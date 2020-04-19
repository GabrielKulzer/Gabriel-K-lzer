package kulzer.gabriel.post.construct.e.pre.destroy;

import kulzer.gabriel.post.construct.e.pre.destroy.dao.ClientDAO;
import kulzer.gabriel.post.construct.e.pre.destroy.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
/**
 * Classe Principal
 * @Author - Gabriel Külzer
 * @Since - 16/04/2020
 * @Version - 1.0
 */

@SpringBootApplication
public class PostConstructEPreDestroyApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(PostConstructEPreDestroyApplication.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);
		clientDAO.setClient(new Client("Gabriel Külzer"));

		System.out.println("Cliente DAO: " +clientDAO);
		System.out.println("Objeto CLIENTE: " +clientDAO.getClient());
	}

}
