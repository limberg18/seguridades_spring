package com.modelo.modelo.service;

import com.modelo.modelo.dto.UsuarioDTO;
import com.modelo.modelo.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {
    
    List<UsuarioDTO> readAll() throws Exception;
    UsuarioDTO readById(int id) throws  Exception;
    void save(UsuarioDTO usuariodto) throws Exception;
    UsuarioDTO update(UsuarioDTO usuariodt,int id) throws  Exception;
    void deleteUsuario(int id) throws Exception;
    
    UsuarioDTO getUsuarioName(String name);
    
    List<UsuarioDTO> getUsuarioEntidad(Integer id);
    
    
}
