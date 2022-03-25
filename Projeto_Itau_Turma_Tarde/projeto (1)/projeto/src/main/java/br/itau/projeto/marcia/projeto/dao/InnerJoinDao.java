package br.itau.projeto.marcia.projeto.dao;

import org.springframework.data.repository.CrudRepository;

import br.itau.projeto.marcia.projeto.model.InnerJoin;

public interface InnerJoinDao extends CrudRepository<InnerJoin, Integer> {
	
}
