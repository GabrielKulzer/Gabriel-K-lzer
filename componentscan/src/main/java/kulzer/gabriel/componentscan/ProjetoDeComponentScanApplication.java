package kulzer.gabriel.componentscan;

import externalclasses.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
/**
 * Classe Principal com Component Scan
 * @Author - Gabriel Külzer
 * @Since - 16/04/2020
 * @Version - 1.0
 *
 */
@SpringBootApplication
@ComponentScan("externalclasses")
public class ProjetoDeComponentScanApplication {

	public static void main(String[] args)
	{
		ApplicationContext applicationContext = SpringApplication.run(ProjetoDeComponentScanApplication.class, args);

		ClassDAO objectDAO1 = applicationContext.getBean(ClassDAO.class);

		System.out.println("Objeto DAO: " +objectDAO1);
		System.out.println("Objeto JDBC: " +objectDAO1.getObjectJDBC());
	}

}
