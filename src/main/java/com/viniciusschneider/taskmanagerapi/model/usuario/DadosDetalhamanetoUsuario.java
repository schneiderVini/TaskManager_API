package com.viniciusschneider.taskmanagerapi.model.usuario;

public record DadosDetalhamanetoUsuario(Long id, String login, String email, String senha, Boolean ativo) {

    public DadosDetalhamanetoUsuario(Usuario usuario) {
        this(usuario.getId(), usuario.getLogin(), usuario.getEmail(), usuario.getSenha(), usuario.getAtivo());
    }
}
