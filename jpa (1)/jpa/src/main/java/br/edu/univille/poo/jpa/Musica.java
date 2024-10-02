package br.edu.univille.poo.jpa;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    public String titulo;
    public String artista;
    public String album;
    public float tempoDuracao;
    @OneToMany
    public Musica paraVariasPlaylist;
}
