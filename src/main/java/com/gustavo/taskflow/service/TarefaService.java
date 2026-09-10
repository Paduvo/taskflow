package com.gustavo.taskflow.service;

import com.gustavo.taskflow.entity.Tarefa;
import com.gustavo.taskflow.repository.TarefaRepository;
import org.springframework.stereotype.Service;
import com.gustavo.taskflow.exception.TarefaNaoEncontradaException;
import com.gustavo.taskflow.dto.TarefaRequest;
import com.gustavo.taskflow.dto.TarefaResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
public class TarefaService {

    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public Page<Tarefa> listarTodas(Boolean concluida, Pageable pageable) {

    if (concluida == null) {
        return tarefaRepository.findAll(pageable);
    }

    return tarefaRepository.findByConcluida(concluida, pageable);
    }

   public TarefaResponse criar(TarefaRequest tarefaRequest) {

    Tarefa tarefa = new Tarefa();

    tarefa.setTitulo(tarefaRequest.getTitulo());
    tarefa.setDescricao(tarefaRequest.getDescricao());
    tarefa.setConcluida(tarefaRequest.isConcluida());

    Tarefa tarefaSalva = tarefaRepository.save(tarefa);

    return paraResponse(tarefaSalva);
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

    private TarefaResponse paraResponse(Tarefa tarefa) {
    return new TarefaResponse(
            tarefa.getId(),
            tarefa.getTitulo(),
            tarefa.getDescricao(),
            tarefa.isConcluida(),
            tarefa.getDataCriacao()
    );
}

}