package com.viniciusschneider.taskmanagerapi.tarefa;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.Date;

public record DadosCadastroTarefa(


        @NotBlank
        String titulo,
        String descricao,
        @NotBlank
        LocalDate dataCriacao,
        @NotBlank
        LocalDate dataVencimento,
        @NotNull
        Prioridade prioridade,
        @NotBlank
        String status,
        @NotBlank
        Long responsavel,
        LocalDate dataConclusao) {
}
