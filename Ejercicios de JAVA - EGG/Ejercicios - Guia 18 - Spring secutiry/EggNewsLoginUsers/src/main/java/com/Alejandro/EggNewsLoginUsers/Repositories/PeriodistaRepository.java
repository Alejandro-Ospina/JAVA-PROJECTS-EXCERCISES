package com.Alejandro.EggNewsLoginUsers.Repositories;

import com.Alejandro.EggNewsLoginUsers.Entidades.Periodista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PeriodistaRepository extends JpaRepository<Periodista, String> {
    Optional<Periodista> findByUserName(String username);
    Optional<Periodista> findByEmail(String email);
}
