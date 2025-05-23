package com.example.projetocrud1javafx.dao;

import com.example.projetocrud1javafx.domain.Cliente;

import java.util.HashMap;

public interface IClienteDAO {

    public Boolean cadastrar(Cliente cliente);
    public void excluir(Long cpf);
    public  void alterar(Cliente cliente);
    public Cliente consultar(Long cpf);
    public HashMap<Long, Cliente> buscarTodos();

}
