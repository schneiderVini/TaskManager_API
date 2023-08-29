package com.viniciusschneider.taskmanagerapi.controller;


import com.viniciusschneider.taskmanagerapi.tarefa.DadosCadastroTarefa;
import com.viniciusschneider.taskmanagerapi.tarefa.DadosListagemTarefa;
import com.viniciusschneider.taskmanagerapi.tarefa.Tarefa;
import com.viniciusschneider.taskmanagerapi.tarefa.TarefaRepository;
import com.viniciusschneider.taskmanagerapi.usuario.UsuarioService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<DadosListagemTarefa> listar(){
        return repository.findAll().stream().map(DadosListagemTarefa::new).toList();
    }
}
