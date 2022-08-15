package letscode.projetostreinamento.academiaapp.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.MonthDay;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class InfoPagamento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numeroCartao;
    @JsonFormat(pattern = "MM/dd")
    private MonthDay dataVencimento;

    @OneToOne
    private Cliente cliente;
}
