package com.viniciusschneider.taskmanagerapi.model.tarefa;

import com.viniciusschneider.taskmanagerapi.model.usuario.Usuario;
import com.viniciusschneider.taskmanagerapi.model.usuario.service.UsuarioService;
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
    @ManyToOne
    @JoinColumn(name = "responsavel")
    private Usuario responsavel;
    @Column(name = "dataConclusao")
    private LocalDate dataConclusao;

    public Tarefa(DadosCadastroTarefa dados, UsuarioService us) {
        this.titulo = dados.titulo();
        this.descricao = dados.descricao();
        this.dataCriacao = LocalDate.now();
        this.dataVencimento = dados.dataVencimento();
        this.prioridade = dados.prioridade();
        this.status = dados.status();
        this.responsavel = us.buscaPorId(dados.responsavel());
        this.dataConclusao = dados.dataConclusao();
    }

    public void atualizarInformacoes(DadosAtualizacaoTarefa dados) {
        if(dados.titulo() != null){
            this.titulo = dados.titulo();
        }
        if(dados.descricao() != null) {
            this.titulo = dados.descricao();
        }
        if(dados.responsavel() != null) {
            this.responsavel =  dados.responsavel();
        }
        if(dados.dataConclusao() != null) {
            this.dataConclusao = dados.dataConclusao();
        }
        if(dados.status() != null) {
            this.status = dados.status();
        }
    }
}
