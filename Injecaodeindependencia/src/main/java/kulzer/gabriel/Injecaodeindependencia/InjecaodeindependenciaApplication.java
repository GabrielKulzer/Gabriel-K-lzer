package kulzer.gabriel.Injecaodeindependencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @Author - Gabriel Külzer
 * @Since - 16/04/2020
 * @Version 1.0
 */
@SpringBootApplication
public class InjecaodeindependenciaApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(InjecaodeindependenciaApplication.class, args);

		Pet pet = applicationContext.getBean(Pet.class);
		pet.execute();
	}

}


