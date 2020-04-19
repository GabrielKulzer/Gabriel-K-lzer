package kulzer.gabriel.post.construct.e.pre.destroy.dao;

import kulzer.gabriel.post.construct.e.pre.destroy.model.Client;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Classe de DAO
 * @Author - Gabriel Külzer
 * @Since - 16/04/2020
 * @Version - 1.0
 */
@Component
@Getter
@Setter
public class ClientDAO {

     @Autowired
    private Client client;

     @PostConstruct
    public void postConstructor() {
         System.out.println("Objeto criado!");
     }

     @PreDestroy
    public void preDestroy() {
         System.out.println("Objeto Finalizado!");
     }
}
