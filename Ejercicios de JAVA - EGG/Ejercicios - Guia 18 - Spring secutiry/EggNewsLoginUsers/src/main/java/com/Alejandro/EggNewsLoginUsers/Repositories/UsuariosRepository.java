package com.Alejandro.EggNewsLoginUsers.Repositories;

import com.Alejandro.EggNewsLoginUsers.Entidades.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, String> {

    @Query ("SELECT u FROM Usuarios u WHERE u.userName = :nombre")
    public Optional<Usuarios> obtenerUsuarioPorNombre(@Param("nombre") String nombre);

    @Query ("SELECT u FROM Usuarios u WHERE u.email = :email")
    public Optional<Usuarios> obtenerUsuarioPorEmail(@Param("email") String email);
}