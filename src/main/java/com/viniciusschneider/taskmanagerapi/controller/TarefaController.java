package com.viniciusschneider.taskmanagerapi.controller;


import com.viniciusschneider.taskmanagerapi.model.tarefa.DadosCadastroTarefa;
import com.viniciusschneider.taskmanagerapi.model.tarefa.DadosListagemTarefa;
import com.viniciusschneider.taskmanagerapi.model.tarefa.Tarefa;
import com.viniciusschneider.taskmanagerapi.model.tarefa.TarefaRepository;
import com.viniciusschneider.taskmanagerapi.model.usuario.UsuarioService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tarefas")
public class TarefaController {

    @Autowired
    private TarefaRepository repository;
    @Autowired
    private UsuarioService usuarioService;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroTarefa dados){
        System.out.println(dados);
        repository.save(new Tarefa(dados,usuarioService));
    }
    @GetMapping
    public Page<DadosListagemTarefa> listar(Pageable page){
        return repository.findAll(page).map(DadosListagemTarefa::new);
    }
}
