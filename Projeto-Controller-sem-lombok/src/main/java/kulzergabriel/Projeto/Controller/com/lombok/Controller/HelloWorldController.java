package kulzergabriel.Projeto.Controller.com.lombok.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    public class HelloWorldController {

        @GetMapping("/")
        public String Index(){
            return "Index ProjetoooO!";
        }
    }

