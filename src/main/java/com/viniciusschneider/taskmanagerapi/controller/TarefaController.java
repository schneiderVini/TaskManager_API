package com.viniciusschneider.taskmanagerapi.controller;


import com.viniciusschneider.taskmanagerapi.tarefa.DadosCadastroTarefa;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tarefas")
public class TarefaController {
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroTarefa dados){
        System.out.println(dados);
    }
}
