package letscode.projetostreinamento.academiaapp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@Entity
public class Treino {
    @Id
    Integer id;
    Set<Exercicio> exercicios;
    Cliente cliente;
    Instrutor instrutor;
}
