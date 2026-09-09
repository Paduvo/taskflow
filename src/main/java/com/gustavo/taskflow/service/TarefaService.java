package com.gustavo.taskflow.service;

import com.gustavo.taskflow.entity.Tarefa;
import com.gustavo.taskflow.repository.TarefaRepository;
import org.springframework.stereotype.Service;
import com.gustavo.taskflow.exception.TarefaNaoEncontradaException;

import java.util.List;

@Service
public class TarefaService {

    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public List<Tarefa> listarTodas() {
        return tarefaRepository.findAll();
    }

    public Tarefa criar(Tarefa tarefa) {
    return tarefaRepository.save(tarefa);
    }

    public Tarefa atualizar(Long id, Tarefa tarefa) {
        Tarefa tarefaExistente = tarefaRepository.findById(id)
                .orElseThrow(() -> new TarefaNaoEncontradaException(id));

        tarefaExistente.setTitulo(tarefa.getTitulo());
        tarefaExistente.setDescricao(tarefa.getDescricao());
        tarefaExistente.setConcluida(tarefa.isConcluida());
        return tarefaRepository.save(tarefaExistente);
    }

    public void deletar(Long id) {
    if (!tarefaRepository.existsById(id)) {
        throw new TarefaNaoEncontradaException(id);
    }

    tarefaRepository.deleteById(id);
}
}