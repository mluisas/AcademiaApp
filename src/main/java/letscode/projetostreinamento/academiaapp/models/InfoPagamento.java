package letscode.projetostreinamento.academiaapp.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.MonthDay;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class InfoPagamento implements Serializable {
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numeroCartao;
    private LocalDate dataVencimento;

    @JsonIgnore
    @OneToOne(mappedBy = "infoPagamento")
    private Cliente cliente;

    @JsonIgnore
    @OneToOne(mappedBy = "infoPagamento")
    private Instrutor instrutor;
}
