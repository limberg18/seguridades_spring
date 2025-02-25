package com.modelo.modelo.service;

import com.modelo.modelo.dto.RolDTO;


import java.util.List;

public interface IRolService {
    List<RolDTO> readAll() throws Exception;

    RolDTO readById(int id) throws  Exception;
    void save(RolDTO roldto) throws Exception;
    RolDTO update(RolDTO rolDTO,int id) throws  Exception;
    void deleteRol(int id) throws Exception;
    RolDTO getRolName(String name);
   
}
