package com.viniciusschneider.taskmanagerapi.model.usuario;

public record DadosListagemUsuario(Long id, String nome, String email, String senha) {

    public DadosListagemUsuario(Usuario usuario){
        this(usuario.getId(),usuario.getNome(), usuario.getEmail(), usuario.getSenha());
    }
}
