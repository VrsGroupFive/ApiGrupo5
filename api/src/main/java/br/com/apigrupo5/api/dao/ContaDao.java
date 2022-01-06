package br.com.apigrupo5.api.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.apigrupo5.api.model.Conta;

public interface ContaDao extends CrudRepository <Conta, Integer>{

}
