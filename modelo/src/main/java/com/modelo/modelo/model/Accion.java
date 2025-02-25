package com.modelo.modelo.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "accion")
public class Accion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int  accionId;
    @Column(length = 50,nullable = false)
   private String nombre;
    
   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name="rolid" ,nullable = false)
    private Rol rol;


    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public int getAccionId() {
        return accionId;
    }

    public void setAccionId(int accionId) {
        this.accionId = accionId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
}
