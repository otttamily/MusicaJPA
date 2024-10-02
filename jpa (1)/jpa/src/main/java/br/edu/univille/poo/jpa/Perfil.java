package br.edu.univille.poo.jpa;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    public String nomeUsuario;
    public String fotoPerfil;
    @OneToMany
    public Usuario seguidoPorVarios;
}
