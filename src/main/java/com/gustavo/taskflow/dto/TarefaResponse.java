package com.gustavo.taskflow.dto;

import java.time.LocalDateTime;

public class TarefaResponse {

    private Long id;
    private String titulo;
    private String descricao;
    private boolean concluida;
    private LocalDateTime dataCriacao;

    public TarefaResponse(Long id, String titulo, String descricao,
                           boolean concluida, LocalDateTime dataCriacao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = concluida;
        this.dataCriacao = dataCriacao;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }
}