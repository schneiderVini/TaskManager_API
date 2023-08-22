package com.viniciusschneider.taskmanagerapi.usuario;

import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioService {

    private final UsuarioRepository repository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.repository = usuarioRepository;
    }
    public Usuario buscaPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

}
