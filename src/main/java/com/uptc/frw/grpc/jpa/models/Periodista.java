package com.uptc.frw.grpc.jpa.models;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Periodistas")
public class Periodista {

    @Id
    @Column(name = "ID_P")
    private long idP;

    @Column(name = "Nombre_P")
    private String nombreP;

    @Column(name = "Direccion")
    private String direccion;

    @Column(name = "Telefono")
    private long telefono;

    // Relación con Periodista_noticia (muchos a muchos a través de tabla intermedia)
    @ManyToMany
    @JoinTable(
            name = "PERIODISTA_NOTICIA",
            joinColumns = @JoinColumn(name = "ID_P"),
            inverseJoinColumns = @JoinColumn(name = "ID_N")
    )
    private List<Noticia> noticias;
    // Relación con Implicados (muchos a muchos a través de tabla intermedia)
    @ManyToMany(mappedBy = "periodistas")
    private List<Implicado> implicados;


}
