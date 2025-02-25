package com.modelo.modelo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "persona")
@PrimaryKeyJoinColumn(name = "entidadid") 
public class Persona extends Entidad {

  @Column(name = "tipodocumento", nullable = false, length = 20)
  private String tipoDocumento;

  @Column(name = "numerodocumento", nullable = false, length = 20)
  private String numeroDocumento;

  @Column(name = "apellidopaterno", nullable = false, length = 50)
  private String apellidoPaterno;

  @Column(name = "apellidomaterno", nullable = false, length = 50)
  private String apellidoMaterno;

  @Column(name = "nombres", nullable = false, length = 100)
  private String nombres;

}
