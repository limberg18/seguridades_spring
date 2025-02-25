package com.modelo.modelo.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UsuarioDTO {

    @NotNull 
    private int usuarioId;
    @NotNull
    private  int entidadId;
    @NotNull
    @NotEmpty 
    @Size(min = 2, max = 50, message = "name min 2")
    private String userName;
    @NotNull
    @Size(min = 5, max = 50, message = "name min 5")
    private String password;

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public void setEntidadId(int entidadId) {
        this.entidadId = entidadId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public int getEntidadId() {
        return entidadId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
