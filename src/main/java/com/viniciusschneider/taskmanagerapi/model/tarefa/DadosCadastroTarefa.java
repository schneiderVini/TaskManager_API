package com.viniciusschneider.taskmanagerapi.model.tarefa;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosCadastroTarefa(


        @NotBlank(message = ("Título é obrigatório"))
        String titulo,
        String descricao,
        @NotNull
        LocalDate dataVencimento,
        @NotNull(message = ("Prioridade é obrigatória"))
        Prioridade prioridade,
        @NotBlank(message = ("Status é obrigatório"))
        String status,
        @NotNull(message = ("Reponsável é obrigatório"))
        Long responsavel,
        LocalDate dataConclusao) {
}
