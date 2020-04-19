package kulzer.gabriel.Injecaodeindependencia.model;

import kulzer.gabriel.Injecaodeindependencia.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
/**
 * Classe Dog
 * @Author - Gabriel Külzer
 * @Since - 16/04/2020
 * @Version 1.0
 */
@Component
@Primary
@Qualifier("dog")
public class Dog implements IAnimal {

    /**Metodo de comunicação
     *
     */
    @Override
    public void comunicar() {
        // TODO Auto-generated method stub
        System.out.println("Au Au!");
    }
}
