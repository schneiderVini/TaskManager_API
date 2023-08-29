package com.viniciusschneider.taskmanagerapi.tarefa;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.Date;

public record DadosCadastroTarefa(


        @NotBlank
        String titulo,
        String descricao,
        @NotNull
        LocalDate dataCriacao,
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
