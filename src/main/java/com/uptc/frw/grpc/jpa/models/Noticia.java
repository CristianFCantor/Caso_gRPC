package com.uptc.frw.grpc.jpa.models;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Noticias")
public class Noticia {

    @Id
    @Column(name = "ID_N")
    private long idN;

    @Column(name = "ID_R")
    private long idR;

    @Column(name = "FECHA_N")
    private Date fechaN;

    @Column(name = "TITULAR")
    private String titular;

    @Column(name = "TEXTO")
    private String texto;

    // Relación con PeriodistaNoticia (muchos a muchos a través de tabla intermedia)
    @ManyToMany(mappedBy = "noticia")
    private List<Periodista> periodistas;

    // Relación con NoticiaImplicado (muchos a muchos a través de tabla intermedia)
    @ManyToMany(mappedBy = "noticia")
    private List<Implicado> implicados;

    // Relación con NoticiaAgencia (muchos a muchos a través de tabla intermedia)
    @ManyToMany(mappedBy = "noticia")
    private List<Agencia> agencias;

}
