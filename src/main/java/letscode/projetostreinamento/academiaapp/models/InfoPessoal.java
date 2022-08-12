package letscode.projetostreinamento.academiaapp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class InfoPessoal implements Serializable {
    private Integer id;
    private String nome;
    private String cpf;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InfoPessoal that = (InfoPessoal) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cpf);
    }
}
