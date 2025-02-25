package com.modelo.modelo.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="usuarioid")
    private int usuarioId;
    @Column(name="entidadid")
    private  int entidadId;
    @Column(name = "username")
    private String userName;
    private String password;
    
    @ManyToOne
    @JoinColumn(name="rolid",nullable = false)
    private Rol rol ;

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getEntidadId() {
        return entidadId;
    }

    public void setEntidadId(int entidadId) {
        this.entidadId = entidadId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}



