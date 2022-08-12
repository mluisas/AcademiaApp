package letscode.projetostreinamento.academiaapp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@Embeddable
public class InfoPessoal {
    private Integer id;
    private String nome;
    private String cpf;

}
