package com.viniciusschneider.taskmanagerapi.controller;

import com.viniciusschneider.taskmanagerapi.usuario.DadosCadastroUsuario;
import com.viniciusschneider.taskmanagerapi.usuario.Usuario;
import com.viniciusschneider.taskmanagerapi.usuario.UsuarioRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    private UsuarioRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar( @RequestBody @Valid DadosCadastroUsuario dados) {
        repository.save(new Usuario(dados));
    }
}
