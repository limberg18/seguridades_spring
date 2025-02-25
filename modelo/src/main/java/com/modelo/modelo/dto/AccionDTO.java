package com.modelo.modelo.dto;

import com.modelo.modelo.model.Rol;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class AccionDTO {
  
    @NotNull
    private int  accionId;
    @NotNull
    @Size(min = 3, max = 60)
    private String nombre;
    @NotNull
    @Size(min = 3, max = 60)
    private Rol rol;

    
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

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
