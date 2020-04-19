package kulzer.gabriel.escopo;

import kulzer.gabriel.escopo.dao.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @Author - Gabriel Külzer
 * @Since - 16/04/2020
 * @Version - 1.0
 *
 */
@SpringBootApplication
public class ProjetoEscopoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ProjetoEscopoApplication.class, args);

		ClassDAO objectDAO1 = applicationContext.getBean(ClassDAO.class);
		ClassDAO objectDAO2 = applicationContext.getBean(ClassDAO.class);

		System.out.println("Objeto DAO: " +objectDAO1);
		System.out.println("Objeto JDBC: " +objectDAO1.getObjectJDBC());

		System.out.println("Objeto DAO: " +objectDAO2);
		System.out.println("Objeto JDBC: " +objectDAO2.getObjectJDBC());
	}

}
