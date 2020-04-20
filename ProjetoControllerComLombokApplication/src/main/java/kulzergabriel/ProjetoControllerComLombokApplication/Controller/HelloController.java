package kulzergabriel.ProjetoControllerComLombokApplication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Külzer
 * @since 18/04/2020
 * @version 1.0
 */
@RestController
public class HelloController {
    /**
     *
     * @return the index off aplication
     */
    @GetMapping("/")
    public String Index(){
        return "Index do Projeto";
    }
}