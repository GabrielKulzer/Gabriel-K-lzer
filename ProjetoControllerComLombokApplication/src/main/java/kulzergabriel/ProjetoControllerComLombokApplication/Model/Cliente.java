package kulzergabriel.ProjetoControllerComLombokApplication.Model;

import lombok.*;

/**
 * @author Gabriel Külzer
 * @Since 18/04/2020
 * @Version 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Cliente {
    private String nome;
    private int idade;
    private String email;
}
