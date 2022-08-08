package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import models.AtividadesExtra;
import models.InfoPagamento;
import models.InfoPessoal;
import models.Treino;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.time.MonthDay;
import java.util.HashMap;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Cliente {
    InfoPessoal infoPessoal;
    Double altura;
    Double peso;
    HashMap<LocalDate, Double> medicoesImc;
    MonthDay dataPagamento;
    InfoPagamento infoPagamento;
    List<Treino> treinos;
    List<AtividadesExtra> atividades;


}
