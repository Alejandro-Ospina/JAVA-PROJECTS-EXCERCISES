package com.Alejandro.EggNewsLoginUsers.Repositories;

import com.Alejandro.EggNewsLoginUsers.Entidades.Periodista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PeriodistaRepository extends JpaRepository<Periodista, Long> {
    Optional<Periodista> findByName(String email);
    Optional<Periodista> findByEmail(String email);
}
