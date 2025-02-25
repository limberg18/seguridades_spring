package com.modelo.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EnlaceDTO {

    @NotNull
  private int  enlaceId	;
    @NotNull
    private String nombre	;
    @NotNull
   private String ruta;
    @NotNull
    private int enlacePadreId;

    public int getEnlaceId() {
        return enlaceId;
    }

    public void setEnlaceId(int enlaceId) {
        this.enlaceId = enlaceId;
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
}
