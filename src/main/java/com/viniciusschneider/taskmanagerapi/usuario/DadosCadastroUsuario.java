package com.viniciusschneider.taskmanagerapi.usuario;

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
