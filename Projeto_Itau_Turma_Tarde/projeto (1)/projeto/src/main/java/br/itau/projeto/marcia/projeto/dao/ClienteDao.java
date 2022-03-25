package br.itau.projeto.marcia.projeto.dao;

import org.springframework.data.repository.CrudRepository;

import br.itau.projeto.marcia.projeto.model.Cliente;

public interface ClienteDao extends CrudRepository<Cliente, Integer>{
	

}
