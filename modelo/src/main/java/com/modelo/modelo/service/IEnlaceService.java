package com.modelo.modelo.service;

import com.modelo.modelo.model.Enlace;
import com.modelo.modelo.model.Usuario;

import java.util.List;

public interface IEnlaceService {
    List<Enlace> readAll() throws Exception;
    Enlace readById(int id) throws  Exception;
    void save(Enlace enlace) throws Exception;
    Enlace update(Enlace enlace,int id) throws  Exception;
    void deleteEnlace(int id) throws Exception;
}
