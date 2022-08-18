package letscode.projetostreinamento.academiaapp.dto.treino;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TreinoResponseDto {

    private String clienteCpf;
    private String instrutorCpf;
    private Integer id;
}
