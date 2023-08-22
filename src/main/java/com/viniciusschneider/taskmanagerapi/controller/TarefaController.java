package com.viniciusschneider.taskmanagerapi.controller;


import com.viniciusschneider.taskmanagerapi.tarefa.DadosCadastroTarefa;
import com.viniciusschneider.taskmanagerapi.tarefa.Tarefa;
import com.viniciusschneider.taskmanagerapi.tarefa.TarefaRepository;
import jakarta.transaction.TransactionScoped;
import jakarta.transaction.Transactional;
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
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroTarefa dados){
        System.out.println(dados);
        repository.save(new Tarefa(dados));
    }
}
