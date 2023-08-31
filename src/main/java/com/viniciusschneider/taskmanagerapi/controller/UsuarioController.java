package com.viniciusschneider.taskmanagerapi.controller;

import com.viniciusschneider.taskmanagerapi.model.usuario.DadosCadastroUsuario;
import com.viniciusschneider.taskmanagerapi.model.usuario.DadosListagemUsuario;
import com.viniciusschneider.taskmanagerapi.model.usuario.Usuario;
import com.viniciusschneider.taskmanagerapi.model.usuario.UsuarioRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
    public Page<DadosListagemUsuario> listar(@PageableDefault(page = 10, sort = {"titulo"}) Pageable pageable){
        return repository.findAll(pageable).map(DadosListagemUsuario::new);
    }
}
