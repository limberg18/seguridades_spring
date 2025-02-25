package com.modelo.modelo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Rol {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="rolid")
   private int idRol;	
   private String  nombre;



}
