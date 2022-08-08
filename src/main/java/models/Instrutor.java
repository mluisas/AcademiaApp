package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Instrutor {
    InfoPessoal infoPessoal;
    InfoPagamento infoPagamento;

}
