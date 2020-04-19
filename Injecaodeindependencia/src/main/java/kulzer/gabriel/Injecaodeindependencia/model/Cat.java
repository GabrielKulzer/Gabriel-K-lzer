package kulzer.gabriel.Injecaodeindependencia.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * Classe Cat
 * @Author - Gabriel Külzer
 * @Since - 16/04/2020
 * @Version 1.0
 */
@Component
@Qualifier("cat")
public class Cat {

    /**Metodo de comunicação
     *
     */
    public void comunicar() {
        // TODO Auto-generated method stub
        System.out.println("Miauu!");
    }
}
