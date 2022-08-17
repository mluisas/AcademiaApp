package letscode.projetostreinamento.academiaapp.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.DayOfWeek;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AtividadesExtra {
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private DayOfWeek diaDaSemana;
    private Integer hora;
    private Integer minuto;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}
