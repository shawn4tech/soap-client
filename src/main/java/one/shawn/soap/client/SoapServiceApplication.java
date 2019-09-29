package one.shawn.soap.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import one.shawn.soap.client.service.SoapClient;

@SpringBootApplication
public class SoapServiceApplication implements CommandLineRunner {
	private static final Logger LOGGER = LoggerFactory.getLogger(SoapServiceApplication.class);
	
	@Autowired
	private SoapClient soapClient;


	public static void main(String[] args) {
		SpringApplication.run(SoapServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("Result = {}", soapClient.getSum(1.0f, 2.5f));
	}

}
