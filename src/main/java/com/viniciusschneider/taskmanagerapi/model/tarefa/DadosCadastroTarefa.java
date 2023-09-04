package com.viniciusschneider.taskmanagerapi.model.tarefa;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosCadastroTarefa(


        @NotBlank
        String titulo,
        String descricao,
        @NotNull
        LocalDate dataVencimento,
        @NotNull
        Prioridade prioridade,
        @NotBlank
        String status,
        @NotNull
        Long responsavel,
        LocalDate dataConclusao) {
}
