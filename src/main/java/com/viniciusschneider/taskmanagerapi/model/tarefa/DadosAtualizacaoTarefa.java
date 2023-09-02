package com.viniciusschneider.taskmanagerapi.model.tarefa;

import com.viniciusschneider.taskmanagerapi.model.usuario.Usuario;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosAtualizacaoTarefa(
        @NotNull Long id, String titulo, String descricao, LocalDate dataConclusao, Usuario responsavel, String status) {
}
