package com.viniciusschneider.taskmanagerapi.model.usuario.service;

import com.viniciusschneider.taskmanagerapi.model.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class AutenticacaoService implements UserDetailsService {

    @Autowired
    private UsuarioRepository repository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByLogin(username);
    }
}
