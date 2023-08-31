package com.viniciusschneider.taskmanagerapi.model.tarefa;

import com.viniciusschneider.taskmanagerapi.model.usuario.Usuario;

import java.time.LocalDate;

public record DadosListagemTarefa(String titulo, String descricao, LocalDate dataVencimento, Usuario reponsavel,Prioridade prioridade) {

    public DadosListagemTarefa(Tarefa tarefa){
        this(tarefa.getTitulo(), tarefa.getDescricao(), tarefa.getDataVencimento(),tarefa.getResponsavel(),tarefa.getPrioridade());
    }
}
