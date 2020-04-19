package externalclasses;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * Classe DAO
 * @Author - Gabriel Külzer
 * @Since - 16/04/2020
 * @Version - 1.0
 *
 */
@Component
@Getter
@Setter
public class ClassDAO {

    @Autowired
    ClassJDBC objectJDBC;

}
