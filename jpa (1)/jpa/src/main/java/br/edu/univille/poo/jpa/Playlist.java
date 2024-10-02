package br.edu.univille.poo.jpa;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    public String musica;
    public String capaAlbum;
    public String nomes;
    @OneToMany
    public Musica exibeVariasPlaylist;
}
