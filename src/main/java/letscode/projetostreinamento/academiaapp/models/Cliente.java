package letscode.projetostreinamento.academiaapp.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente extends Usuario implements Serializable {

    private Double altura;
    private Double peso;
    private Integer diaPagamento;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "info_pagamento_id", referencedColumnName = "id")
    private InfoPagamento infoPagamento;

    @JsonIgnore
    @OneToMany(mappedBy = "cliente")
    private List<Treino> treinos;

    @JsonIgnore
    @OneToMany(mappedBy = "cliente")
    private List<AtividadesExtra> atividades;


}
