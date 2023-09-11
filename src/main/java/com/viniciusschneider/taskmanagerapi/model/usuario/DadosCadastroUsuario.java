package com.viniciusschneider.taskmanagerapi.model.usuario;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroUsuario(
        @NotBlank(message = ("Login é obrigatório"))
        String login,
        @NotBlank(message = ("Senha é obrigatória"))
        String senha,
        @NotBlank(message = ("Email é obrigatório"))
        String email
) {
}
