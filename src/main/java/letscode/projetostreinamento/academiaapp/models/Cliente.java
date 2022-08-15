package letscode.projetostreinamento.academiaapp.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.mapping.PrimaryKey;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.MonthDay;
import java.util.HashMap;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente implements Serializable {

    @EmbeddedId
    private InfoPessoal infoPessoal;

    private Double altura;
    private Double peso;
    private HashMap<LocalDate, Double> medicoesImc;
    @JsonFormat(pattern = "MM/dd")
    private MonthDay dataPagamento;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "info_pagamento_id", referencedColumnName = "id")
    private InfoPagamento infoPagamento;
    @OneToMany
    private List<Treino> treinos;
    @OneToMany
    private List<AtividadesExtra> atividades;


}
