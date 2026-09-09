package com.gustavo.taskflow.repository;

import com.gustavo.taskflow.entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}