package com.uptc.frw.grpc.jpa.models;
import jakarta.persistence.*;

import java.util.List;

    @Entity
    @Table(name = "AGENCIAS")
    public class Agencia {

        @Id
        @Column(name = "ID_A")
        private long id;

        @Column(name = "AGENCIA")
        private String agencia;

        @Column(name = "ANIO_C")
        private int anioCreacion;

        // Relación con Noticia_Agencia (OneToMany)
        @ManyToMany
        @JoinTable(
                name = "NOTICIA_AGENCIA",
                joinColumns = @JoinColumn(name = "ID_A") ,
                inverseJoinColumns = @JoinColumn(name = "ID_N")
        )
        private List<Noticia> noticias;



    }

