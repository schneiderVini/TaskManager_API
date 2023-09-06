package com.viniciusschneider.taskmanagerapi.model.usuario;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    Page<Usuario> findAllByAtivoTrue(Pageable pageable);

    UserDetails findByLogin(String username);
}
