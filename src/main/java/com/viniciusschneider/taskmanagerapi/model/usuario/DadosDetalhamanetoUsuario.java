package com.viniciusschneider.taskmanagerapi.model.usuario;

public record DadosDetalhamanetoUsuario(Long id, String nome, String email, String senha, Boolean ativo) {

    public DadosDetalhamanetoUsuario(Usuario usuario) {
        this(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getSenha(), usuario.getAtivo());
    }
}
