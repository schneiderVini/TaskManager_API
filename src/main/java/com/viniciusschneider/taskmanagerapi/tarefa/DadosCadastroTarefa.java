package com.viniciusschneider.taskmanagerapi.tarefa;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.Date;

<<<<<<< HEAD
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
=======
public record DadosCadastroTarefa(String titulo, String descricao, LocalDate dataCriacao, LocalDate dataVencimento, Prioridade prioridade, String status, String responsável, LocalDate dataConclusao) {
>>>>>>> f41062ab4d57902c381877403e7381f722510a51
}
