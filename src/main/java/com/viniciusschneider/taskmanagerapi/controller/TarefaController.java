package com.viniciusschneider.taskmanagerapi.controller;


import com.viniciusschneider.taskmanagerapi.model.tarefa.*;
import com.viniciusschneider.taskmanagerapi.model.usuario.service.UsuarioService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("tarefas")
public class TarefaController {

    @Autowired
    private TarefaRepository repository;
    @Autowired
    private UsuarioService usuarioService;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroTarefa dados){
        System.out.println(dados);
        repository.save(new Tarefa(dados,usuarioService));
    }
    @GetMapping
    public Page<DadosListagemTarefa> listar(Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemTarefa::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoTarefa dados){
        var medico = repository.getReferenceById(dados.id());
        medico.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }
}
