package com.gustavo.taskflow.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavo.taskflow.entity.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

    Page<Tarefa> findByConcluida(boolean concluida, Pageable pageable);
}