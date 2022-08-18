package letscode.projetostreinamento.academiaapp.dto.exercicio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExercicioResponseDto {

    private String nome;
    private String urlVideoDemonstracao;
    private Integer treinoId;
    private String nomeCliente;
    private String nomeInstrutor;

}
