package com.uptc.frw.grpc.jpa.models;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Implicados")
public class Implicado {

    @Id
    @Column(name = "ID_I")
    private long idI;

    @Column(name = "NOMBRE_I")
    private String nombreI;

    @Column(name = "F_NACIMIENTO")
    private Date fechaNacimiento;

    @Column(name = "CALIDAD")
    private String calidad;

    // Relación con Noticias(muchos a muchos a través de tabla intermedia)
    @ManyToMany
    @JoinTable(
            name = "NOTICIA_IMPLICADO",
             joinColumns = @JoinColumn(name = "ID_I"),
            inverseJoinColumns = @JoinColumn(name = "ID_N")
    )
    private List <Noticia> noticias;

    @ManyToMany
    @JoinTable(
            name = "PERIODISTA_IMPLICADOS",
            joinColumns = @JoinColumn(name = "ID_I"),
            inverseJoinColumns = @JoinColumn(name = "ID_P")
    )
    private List <Periodista> periodistas;
}

