package com.viniciusschneider.taskmanagerapi.model.tarefa;

import com.viniciusschneider.taskmanagerapi.model.usuario.Usuario;

import java.time.LocalDate;

public record DadosListagemTarefa(Long id,String titulo, String descricao, LocalDate dataVencimento, Usuario reponsavel,Prioridade prioridade, LocalDate dataConclusao) {

    public DadosListagemTarefa(Tarefa tarefa){
        this(tarefa.getId(),tarefa.getTitulo(), tarefa.getDescricao(), tarefa.getDataVencimento(),tarefa.getResponsavel(),tarefa.getPrioridade(),tarefa.getDataConclusao());
    }
}
