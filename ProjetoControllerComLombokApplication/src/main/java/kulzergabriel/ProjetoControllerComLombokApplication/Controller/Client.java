package kulzergabriel.ProjetoControllerComLombokApplication.Controller;

import kulzergabriel.ProjetoControllerComLombokApplication.Model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @Author - Gabriel Külzer
 * @Since - 18/04/2020
 * @Version 1-0
 */
@RestController
public class Client {


    /**
     *
     * @return one client specific
     */
    @GetMapping("/client")
    public Cliente client(){
        Cliente client = new Cliente();
        client.setNome("ze");
        client.setIdade(30);
        client.setEmail("ze@ze.com");
        return client;
    }

    /**
     *
     * @return All Clients
     */
    @GetMapping("/listaclient")
    public ArrayList<Cliente> getClient(){
        Cliente client = new Cliente();
        client.setNome("Thiago");
        client.setIdade(36);
        client.setEmail("thiagocury@gmail.com");
        Cliente client2 = new Cliente();
        client2.setNome("Gabriel");
        client2.setIdade(55);
        client2.setEmail("gabrielk.rodrigues@hotmail.com");
        Cliente client3 = new Cliente();
        client3.setNome("Maria");
        client3.setIdade(92);
        client3.setEmail("velhamaria@hotmail.com");
        ArrayList<Cliente> clients = new ArrayList<>();
        clients.add(client);
        clients.add(client2);
        clients.add(client3);
        return clients;
    }
}