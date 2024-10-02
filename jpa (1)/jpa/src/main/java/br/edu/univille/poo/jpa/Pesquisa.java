package br.edu.univille.poo.jpa;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Pesquisa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    public String palavraChave;
    public String resultados;
    @OneToMany
    private Usuario paraVariasPesquisas;
    @OneToOne
    private Pesquisa exibeUmaMusica;
}
