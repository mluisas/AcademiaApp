package letscode.projetostreinamento.academiaapp.dto.atividadeExtra;

import lombok.Getter;
import lombok.Setter;

import java.time.DayOfWeek;

@Getter
@Setter
public class AtividadeExtraRequestDto {

    private String nome;
    private DayOfWeek diaDaSemana;
    private Integer hora;
    private Integer minuto;
    private String cpfCliente;
}
