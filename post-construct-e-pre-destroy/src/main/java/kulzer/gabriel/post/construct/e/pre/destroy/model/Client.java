package kulzer.gabriel.post.construct.e.pre.destroy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
/**
 * Classe Cliente
 * @Author - Gabriel Külzer
 * @Since - 16/04/2020
 * @Version - 1.0
 */

@Component
@Getter
@Setter
@AllArgsConstructor
public class Client {

    private String name;

    /** Método construtor
     *
     */
    public Client() {
        System.out.println("Classe Cliente !");
    }
}
