package com.modelo.modelo.model;
import jakarta.persistence.*;

@Entity
@Table(name = "entidad")
@Inheritance(strategy = InheritanceType.JOINED) // Usa herencia con tablas separadas
public class Entidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "entidadid")
    private int entidadId;

    @Column(name = "ruc", nullable = false, length = 20)
    private String ruc;

    @Column(name = "razonsocial", nullable = false, length = 100)
    private String razonSocial;

    // Getters y setters
}
