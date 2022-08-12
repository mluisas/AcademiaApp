package letscode.projetostreinamento.academiaapp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.MonthDay;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class InfoPagamento {
    @Id
    private Integer id;
    private String numeroCartao;
    private MonthDay dataVencimento;

}
