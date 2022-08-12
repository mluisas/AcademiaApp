package letscode.projetostreinamento.academiaapp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.time.LocalDate;
import java.time.MonthDay;
import java.util.HashMap;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Cliente {

    @EmbeddedId
    private InfoPessoal infoPessoal;
    private Double altura;
    private Double peso;
    private HashMap<LocalDate, Double> medicoesImc;
    private MonthDay dataPagamento;
    private InfoPagamento infoPagamento;
    private List<Treino> treinos;
    private List<AtividadesExtra> atividades;


}
