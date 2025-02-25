package com.modelo.modelo.service;

import com.modelo.modelo.dto.AccionDTO;
import com.modelo.modelo.dto.UsuarioDTO;
import com.modelo.modelo.model.Accion;
import com.modelo.modelo.model.Usuario;

import java.util.List;

public interface IAccionService {
    List<AccionDTO> readAll() throws Exception;
    
    AccionDTO readById(int id) throws  Exception;
    void save(AccionDTO usuariodto) throws Exception;
    AccionDTO update(AccionDTO accionDTO,int id) throws  Exception;
    void deleteUsuario(int id) throws Exception;
    AccionDTO getUsuarioName(String name);
    List<UsuarioDTO> getUsuarioEntidad(Integer id);
}
