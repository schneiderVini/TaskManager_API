package com.viniciusschneider.taskmanagerapi.controller;

import com.viniciusschneider.taskmanagerapi.usuario.DadosCadastroUsuario;
import com.viniciusschneider.taskmanagerapi.usuario.DadosListagemUsuario;
import com.viniciusschneider.taskmanagerapi.usuario.Usuario;
import com.viniciusschneider.taskmanagerapi.usuario.UsuarioRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar( @RequestBody @Valid DadosCadastroUsuario dados) {
        repository.save(new Usuario(dados));
    }

    @GetMapping
    public List<DadosListagemUsuario> listar(){
        return repository.findAll().stream().map(DadosListagemUsuario::new).toList();
    }
}
