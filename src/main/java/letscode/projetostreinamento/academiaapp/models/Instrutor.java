package letscode.projetostreinamento.academiaapp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Instrutor {
    @EmbeddedId
    InfoPessoal infoPessoal;
    InfoPagamento infoPagamento;

}
