package letscode.projetostreinamento.academiaapp.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Getter
@Setter
@MappedSuperclass
public abstract class Usuario implements Serializable {

    @Id
    private String cpf;
    private String nome;

    protected Usuario(){}

}
