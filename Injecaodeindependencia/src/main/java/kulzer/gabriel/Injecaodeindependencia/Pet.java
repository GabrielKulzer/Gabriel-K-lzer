package kulzer.gabriel.Injecaodeindependencia;

import kulzer.gabriel.Injecaodeindependencia.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Classe Pet
 * @Author - Gabriel Külzer
 * @Since - 16/04/2020
 * @Version 1.0
 */
@Component
public class Pet {

    @Autowired
    @Qualifier("cat")
    private IAnimal iAnimal;


    public void execute() { iAnimal.comunicar(); }
}
