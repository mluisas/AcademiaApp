package letscode.projetostreinamento.academiaapp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente extends Usuario implements Serializable {

    private Double altura;
    private Double peso;
    private HashMap<LocalDate, Double> medicoesImc;
    private Integer diaPagamento;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "info_pagamento_id", referencedColumnName = "id")
    private InfoPagamento infoPagamento;
    @OneToMany
    private List<Treino> treinos;
    @OneToMany
    private List<AtividadesExtra> atividades;


}
