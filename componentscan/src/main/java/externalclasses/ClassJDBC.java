package externalclasses;

import org.springframework.stereotype.Component;
/**
 * Classe JDBC
 * @Author - Gabriel Külzer
 * @Since - 16/04/2020
 * @Version - 1.0
 *
 */
@Component
public class ClassJDBC {

    public ClassJDBC() {
        System.out.println("Conexão JDBC!");
    }
}
