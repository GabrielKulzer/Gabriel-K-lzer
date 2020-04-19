package kulzer.gabriel.escopo.dao;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
/**
 * Classe JDBC com Scope
 * @Author - Gabriel Külzer
 * @Since - 16/04/2020
 * @Version - 1.0
 *
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)

public class ClassJDBC {

    public ClassJDBC() {
        System.out.println("Classe JDBC!");
    }
}
