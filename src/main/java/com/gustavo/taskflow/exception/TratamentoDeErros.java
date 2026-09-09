package com.gustavo.taskflow.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class TratamentoDeErros {

    @ExceptionHandler(TarefaNaoEncontradaException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, String> tratarTarefaNaoEncontrada(
            TarefaNaoEncontradaException exception) {

        return Map.of(
                "erro", "Tarefa não encontrada",
                "mensagem", exception.getMessage()
        );
    }
}