package com.modelo.modelo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="enlace")
public class Enlace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="enlaceid")
    private int  idEnlace	;
    @Column(length = 50,nullable = false)
    private String nombre	;
    @Column(length = 150,nullable = false,unique = true)
    private String ruta;	
    
    private int enlacePadreId;
    
    @ManyToOne
    @JoinColumn(name="rolid", nullable = false)
    private Rol rol ;

    public int getIdEnlace() {
        return idEnlace;
    }

    public void setIdEnlace(int idEnlace) {
        this.idEnlace = idEnlace;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getEnlacePadreId() {
        return enlacePadreId;
    }

    public void setEnlacePadreId(int enlacePadreId) {
        this.enlacePadreId = enlacePadreId;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
