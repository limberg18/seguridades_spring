package com.modelo.modelo.service.impl;

import com.modelo.modelo.dto.UsuarioDTO;
import com.modelo.modelo.exception.ModelNotFoundException;
import com.modelo.modelo.model.Usuario;
import com.modelo.modelo.repo.IUsuarioRepo;
import com.modelo.modelo.service.IUsuarioService;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import java.util.List;

@Service

public class UsuarioServiceImpl implements IUsuarioService {
    private final IUsuarioRepo iUsuarioRepo;
    private final ModelMapper modelMapper;
    public UsuarioServiceImpl(IUsuarioRepo iUsuarioRepo, ModelMapper modelMapper) {
        this.iUsuarioRepo = iUsuarioRepo;
        this.modelMapper = modelMapper;
    }
    
    @Override
    public List<UsuarioDTO> readAll() throws Exception {
      
       List<Usuario> lista= iUsuarioRepo.findAll();
    List<UsuarioDTO> listadto=   lista.stream().map(e->modelMapper.map(e,UsuarioDTO.class)).toList();
   return listadto;
    }
    @Override
    public UsuarioDTO readById(int id) throws Exception {
        Usuario usuario=   iUsuarioRepo.findById(id).orElseThrow(() -> new ModelNotFoundException("ID NO EXISTE"+id));
 return modelMapper.map(usuario,UsuarioDTO.class);
    }

    @Override
    public void save( UsuarioDTO usuariodto) throws Exception {
        iUsuarioRepo.save(modelMapper.map(usuariodto,Usuario.class));
    }
    
    @Override
    public UsuarioDTO update(UsuarioDTO usuariodto, int id) throws Exception {
       Usuario usuario;
       usuario =iUsuarioRepo.findById(id).orElseThrow(() -> new Exception("No existe el usuario con id"+id));
       usuario.setUserName(usuariodto.getUserName());
       usuario.setPassword(usuariodto.getPassword());
       usuario.setEntidadId(usuariodto.getEntidadId());
       return  modelMapper.map( iUsuarioRepo.save(usuario),UsuarioDTO.class);
       
    }
    
    @Override
    public void deleteUsuario(int id) throws Exception {
         iUsuarioRepo.deleteById(id);
         
    }

    @Override
    public UsuarioDTO getUsuarioName(String name) {
       
        return modelMapper.map( iUsuarioRepo.getUsuarioName(name),UsuarioDTO.class);
    }

    @Override
    public List<UsuarioDTO> getUsuarioEntidad(Integer id) {
       List<Usuario> listausuario= iUsuarioRepo.getUsuarioEntidad(id);
       List<UsuarioDTO> listadto=listausuario.stream().map(usuario -> modelMapper.map(usuario,UsuarioDTO.class))
               .toList();
        return listadto;
    }


}
