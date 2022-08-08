package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@Entity
public class Treino {
    Integer id;
    Set<Exercicio> exercicios;
    Cliente cliente;
    Instrutor instrutor;
}
