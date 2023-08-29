package com.viniciusschneider.taskmanagerapi.usuario;

import com.viniciusschneider.taskmanagerapi.tarefa.DadosListagemTarefa;

public record DadosListagemUsuario(String nome, String email, String senha) {

    public DadosListagemUsuario(Usuario usuario){
        this(usuario.getNome(), usuario.getEmail(), usuario.getSenha());
    }
}
