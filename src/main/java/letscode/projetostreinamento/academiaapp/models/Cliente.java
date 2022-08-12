package letscode.projetostreinamento.academiaapp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.time.MonthDay;
import java.util.HashMap;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente {

    @EmbeddedId
    private InfoPessoal infoPessoal;
    private Double altura;
    private Double peso;
    private HashMap<LocalDate, Double> medicoesImc;
    private MonthDay dataPagamento;
    @OneToOne
    private InfoPagamento infoPagamento;
    @OneToMany
    private List<Treino> treinos;
    @OneToMany
    private List<AtividadesExtra> atividades;


}
