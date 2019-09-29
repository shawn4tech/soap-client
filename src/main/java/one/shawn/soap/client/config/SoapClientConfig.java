package one.shawn.soap.client.config;

import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
public class SoapClientConfig {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage> specified in
		// pom.xml
		marshaller.setContextPath("one.shawn.soap.client.model");
		return marshaller;
	}
	
	@Bean
	public Credentials credentials(){
	    UsernamePasswordCredentials credentials = new UsernamePasswordCredentials("admin", "admin");
	    return credentials;
	}

	@Bean
	public HttpComponentsMessageSender sender(Credentials credentials) {
		HttpComponentsMessageSender sender = new HttpComponentsMessageSender();
		sender.setCredentials(credentials);
		sender.setConnectionTimeout(1000);
		sender.setReadTimeout(1000);
		return sender;
	}

	@Bean
	public WebServiceTemplate webServiceTemplate(HttpComponentsMessageSender sender) {
		WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
		webServiceTemplate.setMarshaller(marshaller());
		webServiceTemplate.setUnmarshaller(marshaller());
		webServiceTemplate.setDefaultUri("http://localhost:8080/ws/sum");
		// set a HttpComponentsMessageSender which provides support for basic
		// authentication
		webServiceTemplate.setMessageSender(sender);

		return webServiceTemplate;
	}

}
