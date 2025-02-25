package com.modelo.modelo.repo;

import com.modelo.modelo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.lang.annotation.Native;
import java.util.List;

public interface IUsuarioRepo extends JpaRepository<Usuario,Integer> {
    
    @Query("FROM Usuario u where u.userName=:name")
    Usuario getUsuarioName(@Param("name") String name);
    
    //QUERY NATIVE
    
    @Query(value = "select *from Usuario u where entidad_id=:id", nativeQuery = true)
   List<Usuario>  getUsuarioEntidad(@Param("id") Integer id);
}
