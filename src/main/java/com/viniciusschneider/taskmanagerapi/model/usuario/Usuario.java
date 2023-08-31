package com.viniciusschneider.taskmanagerapi.model.usuario;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "usuarios")
@Entity(name = "Usuario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of ="id")
public class Usuario{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String senha;
    private String email;

    public Usuario(DadosCadastroUsuario dados) {
        this.nome = dados.nome();
        this.senha = dados.senha();
        this.email = dados.email();
    }
}
