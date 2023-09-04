package com.viniciusschneider.taskmanagerapi.controller;


import com.viniciusschneider.taskmanagerapi.model.tarefa.*;
import com.viniciusschneider.taskmanagerapi.model.usuario.service.UsuarioService;
import jakarta.transaction.Transactional;
import jakarta.validation.ReportAsSingleViolation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("tarefas")
public class TarefaController {

    @Autowired
    private TarefaRepository repository;
    @Autowired
    private UsuarioService usuarioService;
    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroTarefa dados, UriComponentsBuilder uriBuilder){
        System.out.println(dados);
        var tarefa = new Tarefa(dados,usuarioService);
        repository.save(tarefa);
        var uri = uriBuilder.path("tarefas/{id}").buildAndExpand(tarefa.getId()).toUri();
        return ResponseEntity.created(uri).body(new DadosDetalhamentoTarefa(tarefa));
    }
    @GetMapping
    public ResponseEntity<Page<DadosListagemTarefa>> listar(Pageable paginacao){
        var tarefa = repository.findAll(paginacao).map(DadosListagemTarefa::new);
        return ResponseEntity.ok(tarefa);
    }

    @PutMapping
    @Transactional
    public ResponseEntity atualizar(@RequestBody @Valid DadosAtualizacaoTarefa dados){
        var tarefa = repository.getReferenceById(dados.id());
        tarefa.atualizarInformacoes(dados);

        return ResponseEntity.ok(new DadosDetalhamentoTarefa(tarefa));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity excluir(@PathVariable Long id){
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/{id}")
    public ResponseEntity detalhar(@PathVariable Long id){
        var tarefa = repository.getReferenceById(id);
        return ResponseEntity.ok(new DadosDetalhamentoTarefa(tarefa));
    }
}
