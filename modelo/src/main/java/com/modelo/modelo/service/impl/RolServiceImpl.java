package com.modelo.modelo.service.impl;

import com.modelo.modelo.dto.RolDTO;
import com.modelo.modelo.repo.IRolRepo;
import com.modelo.modelo.service.IRolService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceImpl implements IRolService {
    
    private  final ModelMapper modelMapper;
  
    private final IRolRepo iRolRepo;

    public RolServiceImpl( ModelMapper modelMapper, IRolRepo iRolRepo) {
        this.modelMapper = modelMapper;
        this.iRolRepo = iRolRepo;
    }


    @Override
    public List<RolDTO> readAll() throws Exception {
        return iRolRepo.findAll().stream().map(e->modelMapper.map(e,RolDTO.class)).toList();
                
    }

    @Override
    public RolDTO readById(int id) throws Exception {
        return null;
    }

    @Override
    public void save(RolDTO roldto) throws Exception {

    }

    @Override
    public RolDTO update(RolDTO rolDTO, int id) throws Exception {
        return null;
    }

    @Override
    public void deleteRol(int id) throws Exception {

    }

    @Override
    public RolDTO getRolName(String name) {
        return null;
    }
}
