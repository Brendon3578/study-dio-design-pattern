package com.br.projetospringdessignpatern.service;

import com.br.projetospringdessignpatern.model.Cliente;

/**
 * Interface que ddefine o padrão <b>Strategy</b> no domínio de cliente.
 * Com isso, se necessário, podemos ter multiplas implementações
 * dessa mesma interface
 *
 * @author brendon3578
 */
public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
