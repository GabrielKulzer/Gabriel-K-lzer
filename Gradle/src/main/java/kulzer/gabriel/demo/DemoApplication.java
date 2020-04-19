package kulzer.gabriel.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @Author - Gabriel Külzer
 * @Since 19/04/2020
 * @Version - 10.0
*/

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);

		System.out.println("Gradlee!");


	}
}
