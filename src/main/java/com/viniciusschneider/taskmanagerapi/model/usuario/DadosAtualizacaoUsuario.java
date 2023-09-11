package com.viniciusschneider.taskmanagerapi.model.usuario;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoUsuario(@NotNull Long id, String login, String senha, String email) {
}
