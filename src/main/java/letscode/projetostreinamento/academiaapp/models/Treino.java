package letscode.projetostreinamento.academiaapp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Treino {
    @Id
    private Integer id;
    @OneToMany
    private Set<Exercicio> exercicios;
    @OneToOne
    private Cliente cliente;
    @OneToOne
    private Instrutor instrutor;
}
