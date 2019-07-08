package ec.com.altiora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ AltioraAppConfig.class })
public class AltioraAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AltioraAppApplication.class, args);
	}

}
