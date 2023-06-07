package pe.edu.upc.easytravelapi;

import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EasytravelApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasytravelApiApplication.class, args);
	}

}
