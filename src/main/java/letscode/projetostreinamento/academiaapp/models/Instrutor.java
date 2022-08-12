package letscode.projetostreinamento.academiaapp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Instrutor {
    @EmbeddedId
    private InfoPessoal infoPessoal;
    @OneToOne
    private InfoPagamento infoPagamento;

}
