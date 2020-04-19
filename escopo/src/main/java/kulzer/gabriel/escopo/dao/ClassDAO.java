package kulzer.gabriel.escopo.dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/**
 * Classe DAO com Scope
 * @Author - Gabriel Külzer
 * @Since - 16/04/2020
 * @Version - 1.0
 *
 */
@Getter
@Setter
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class ClassDAO {

    @Autowired
    ClassJDBC objectJDBC;
}
