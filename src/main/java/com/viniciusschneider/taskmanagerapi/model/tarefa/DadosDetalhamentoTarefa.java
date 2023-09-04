package com.viniciusschneider.taskmanagerapi.model.tarefa;

import com.viniciusschneider.taskmanagerapi.model.usuario.Usuario;

import java.time.LocalDate;

public record DadosDetalhamentoTarefa(Long id, String titulo, String descricao, LocalDate dataCriacao, LocalDate dataVencimento, Prioridade prioridade, String status, Usuario responsavel,LocalDate dataConclusao) {

    public DadosDetalhamentoTarefa(Tarefa tarefa) {
        this(tarefa.getId(), tarefa.getTitulo(), tarefa.getDescricao(), tarefa.getDataCriacao(),tarefa.getDataVencimento(),tarefa.getPrioridade(),tarefa.getStatus(),tarefa.getResponsavel(),tarefa.getDataConclusao());
    }
}
