package letscode.projetostreinamento.academiaapp.dto.exercicio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExercicioRequestDto {

    private String nome;
    private String urlVideoDemonstracao;
    private Integer treinoId;
}
