package one.shawn.soap.client.service;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapMessage;

import one.shawn.soap.client.model.Operands;
import one.shawn.soap.client.model.Result;

@Service
public class SoapClient extends WebServiceGatewaySupport {

	private static final Logger LOGGER = LoggerFactory.getLogger(SoapClient.class);
	
	@Autowired
	public SoapClient(WebServiceTemplate template) {
		this.setWebServiceTemplate(template);
	}

	public float getSum(float num1, float num2) throws Exception {
		Operands request = new Operands();
		request.setFirstNum(num1);
		request.setSecondNum(num2);
		
		StringWriter sw = new StringWriter();
		JAXBContext context = JAXBContext.newInstance(Operands.class);
		
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.marshal(request, sw);
		LOGGER.info("{}", sw.toString());
		
		Result response = (Result) getWebServiceTemplate()
				.marshalSendAndReceive("http://localhost:8080/ws/sum/", request,
						message -> {
							((SoapMessage)message).getSoapHeader().addHeaderElement(new QName("http://shawn.one/services/sum", "Sender")).setText("Client");
							((SoapMessage)message).setSoapAction("http://shawn.one/services/sum/add");
						});

		return response.getSum();
	}


}
