package com.viniciusschneider.taskmanagerapi.model.usuario;

public record DadosListagemUsuario(Long id, String login, String email, String senha) {

    public DadosListagemUsuario(Usuario usuario){
        this(usuario.getId(),usuario.getLogin(), usuario.getEmail(), usuario.getSenha());
    }
}
