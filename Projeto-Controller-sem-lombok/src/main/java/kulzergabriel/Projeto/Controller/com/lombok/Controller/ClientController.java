package kulzergabriel.Projeto.Controller.com.lombok.Controller;

import kulzergabriel.Projeto.Controller.com.lombok.model.Client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ClientController {

    /**
     * @author Gabriel Külzer
     * @since 18/04/2020 
     * @version 1.0
     */



        /**
         *
         * @return cliente específico
         */
        @GetMapping("/client")
        public Client client(){
            Client client = new Client();
            client.setNome("ze");
            client.setIdade(30);
            return client;
        }

        /**
         *
         * @return Todos clientes cadastrados
         */
        @GetMapping("/listaclient")
        public ArrayList<Client> getClient(){
            Client client = new Client();
            client.setNome("Thiago");
            client.setIdade(36);
            Client client2 = new Client();
            client2.setNome("Lucas");
            client2.setIdade(34);
            Client client3 = new Client();
            client3.setNome("Maria");
            client3.setIdade(19);
            ArrayList<Client> clients = new ArrayList<>();
            clients.add(client);
            clients.add(client2);
            clients.add(client3);
            return clients;
        }
    }

