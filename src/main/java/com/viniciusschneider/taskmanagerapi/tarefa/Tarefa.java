package com.viniciusschneider.taskmanagerapi.tarefa;

<<<<<<< HEAD
import com.viniciusschneider.taskmanagerapi.usuario.Usuario;
import com.viniciusschneider.taskmanagerapi.usuario.UsuarioService;
=======
>>>>>>> f41062ab4d57902c381877403e7381f722510a51
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name="tarefas")
@Entity(name = "Tarefa")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of ="id")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    @Column(name = "dataCriacao")
    private LocalDate dataCriacao;
    @Column(name = "dataVencimento")
    private LocalDate dataVencimento;
    @Enumerated(EnumType.STRING)
    private Prioridade prioridade;
    private String status;
<<<<<<< HEAD
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario responsavel;
    @Column(name = "dataConclusao")
    private LocalDate dataConclusao;

    public Tarefa(DadosCadastroTarefa dados, UsuarioService us) {
=======
    private String responsavel;
    @Column(name = "dataConclusao")
    private LocalDate dataConclusao;

    public Tarefa(DadosCadastroTarefa dados) {
>>>>>>> f41062ab4d57902c381877403e7381f722510a51
        this.titulo = dados.titulo();
        this.descricao = dados.descricao();
        this.dataCriacao = dados.dataCriacao();
        this.dataVencimento = dados.dataVencimento();
        this.prioridade = dados.prioridade();
        this.status = dados.status();
<<<<<<< HEAD
        this.responsavel = us.buscaPorId(dados.responsavel());
=======
        this.responsavel = dados.responsável();
>>>>>>> f41062ab4d57902c381877403e7381f722510a51
        this.dataConclusao = dados.dataConclusao();
    }
}
