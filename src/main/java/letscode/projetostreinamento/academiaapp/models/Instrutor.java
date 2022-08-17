package letscode.projetostreinamento.academiaapp.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Instrutor extends Usuario {
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "info_pagamento_id", referencedColumnName = "id")
    private InfoPagamento infoPagamento;

    @JsonIgnore
    //@OneToOne(mappedBy = "instrutor")
    @OneToMany(mappedBy = "cliente")
    private List<Treino> treinos;
}
