package br.edu.univille.poo.jpa;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Seguir {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String usuarioSeguindo;
    private String usuarioSeguir;
    @ManyToMany
    private Perfil realizadoPor;
}
