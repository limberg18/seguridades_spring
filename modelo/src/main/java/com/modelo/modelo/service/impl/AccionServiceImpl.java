package com.modelo.modelo.service.impl;

import com.modelo.modelo.dto.AccionDTO;
import com.modelo.modelo.dto.UsuarioDTO;
import com.modelo.modelo.repo.IAccionRepo;
import com.modelo.modelo.service.IAccionService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccionServiceImpl implements IAccionService {
    
    private final IAccionRepo iAccionRepo;
    private final ModelMapper modelMapper;

    public AccionServiceImpl(IAccionRepo iAccionRepo, ModelMapper modelMapper) {
        this.iAccionRepo = iAccionRepo;
        this.modelMapper = modelMapper;
    }


    @Override
    public List<AccionDTO> readAll() throws Exception {
        return iAccionRepo.findAll().stream().map(e->modelMapper.map(e,AccionDTO.class)).toList();
    }

    @Override
    public AccionDTO readById(int id) throws Exception {
        return null;
    }

    @Override
    public void save(AccionDTO usuariodto) throws Exception {

    }

    @Override
    public AccionDTO update(AccionDTO accionDTO, int id) throws Exception {
        return null;
    }

    @Override
    public void deleteUsuario(int id) throws Exception {

    }

    @Override
    public AccionDTO getUsuarioName(String name) {
        return null;
    }

    @Override
    public List<UsuarioDTO> getUsuarioEntidad(Integer id) {
        return null;
    }
}
