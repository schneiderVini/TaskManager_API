package com.viniciusschneider.taskmanagerapi.tarefa;

import java.time.LocalDate;
import java.util.Date;

public record DadosCadastroTarefa(String id, String titulo, String descricao, LocalDate dataCriacao, LocalDate dataVencimento, Prioridade prioridade, String status, String responsável, LocalDate dataConclusao) {
}
