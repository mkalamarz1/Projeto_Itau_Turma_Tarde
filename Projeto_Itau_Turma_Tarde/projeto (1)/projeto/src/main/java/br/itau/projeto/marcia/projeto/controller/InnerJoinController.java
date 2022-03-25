package br.itau.projeto.marcia.projeto.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itau.projeto.marcia.projeto.dao.InnerJoinDao;
import br.itau.projeto.marcia.projeto.model.InnerJoin;

@RestController
@CrossOrigin("*")
@RequestMapping("/innerjoin")
public class InnerJoinController {
	@Autowired
	private InnerJoinDao dao;
	
	@GetMapping 
	
	public ArrayList<InnerJoin> recuperarTudo(){
		ArrayList<InnerJoin> lista;
		lista=(ArrayList<InnerJoin>)dao.findAll();
		return lista;		
	}
}
