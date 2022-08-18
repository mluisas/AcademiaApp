package letscode.projetostreinamento.academiaapp.dto.atividadeExtra;

import lombok.Getter;
import lombok.Setter;

import java.time.DayOfWeek;

@Getter
@Setter
public class AtividadeExtraResponseDto {

    private String nome;
    private DayOfWeek diaDaSemana;
    private Integer hora;
    private Integer minuto;
    private String cpfCliente;
    private String nomeCliente;
    private Integer id;
}
