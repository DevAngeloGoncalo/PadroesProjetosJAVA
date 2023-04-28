package one.dio.projetospring.service;

import one.dio.projetospring.model.Cliente;

public interface ClienteService {

    Iterable<Cliente> buscarTodos();
    
    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);
    
    void remover(Long id);
}
