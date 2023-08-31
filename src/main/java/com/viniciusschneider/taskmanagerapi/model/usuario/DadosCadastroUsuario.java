package com.viniciusschneider.taskmanagerapi.model.usuario;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroUsuario(
        @NotBlank
        String nome,
        @NotBlank
        String senha,
        @NotBlank
        String email
) {
}
