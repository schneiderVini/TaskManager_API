package com.viniciusschneider.taskmanagerapi.controller;


import com.viniciusschneider.taskmanagerapi.tarefa.DadosCadastroTarefa;
import com.viniciusschneider.taskmanagerapi.tarefa.Tarefa;
import com.viniciusschneider.taskmanagerapi.tarefa.TarefaRepository;
<<<<<<< HEAD
import com.viniciusschneider.taskmanagerapi.usuario.UsuarioService;
import jakarta.transaction.TransactionScoped;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
=======
import jakarta.transaction.TransactionScoped;
import jakarta.transaction.Transactional;
>>>>>>> f41062ab4d57902c381877403e7381f722510a51
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tarefas")
public class TarefaController {

    @Autowired
    private TarefaRepository repository;
<<<<<<< HEAD
    @Autowired
    private UsuarioService usuarioService;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroTarefa dados){
        System.out.println(dados);
        repository.save(new Tarefa(dados,usuarioService));
=======
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroTarefa dados){
        System.out.println(dados);
        repository.save(new Tarefa(dados));
>>>>>>> f41062ab4d57902c381877403e7381f722510a51
    }
}
