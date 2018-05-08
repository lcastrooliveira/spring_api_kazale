package com.kazale.pontointeligente.api.services;

import com.kazale.pontointeligente.api.entities.Lancamento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Optional;

public interface LancamentoService {

    /**
     * Retorna uma lista paginada de lançamentos de um determinado funcionário
     *
     * @param funcionarioId
     * @param pageRequest
     * @return
     */
    Page<Lancamento> buscarPorFuncionarioId(Long funcionarioId, PageRequest pageRequest);

    /**
     * Retorna um lançamento por ID
     *
     * @param id
     * @return
     */
    Optional<Lancamento> buscarPorId(Long id);

    /**
     * Persiste um lançamento na base de dados
     *
     * @param lancamento
     * @return
     */
    Lancamento persistir(Lancamento lancamento);

    /**
     * Remove um lançamento na base de dados
     *
     * @param id
     */
    void remover(Long id);

}
