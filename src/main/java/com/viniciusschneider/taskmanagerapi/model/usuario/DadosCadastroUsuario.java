package com.viniciusschneider.taskmanagerapi.model.usuario;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroUsuario(
        @NotBlank(message = ("Nome é obrigatório"))
        String nome,
        @NotBlank(message = ("Senha é obrigatória"))
        String senha,
        @NotBlank(message = ("Email é obrigatório"))
        String email
) {
}
