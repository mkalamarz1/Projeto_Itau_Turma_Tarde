package br.itau.projeto.marcia.projeto.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itau.projeto.marcia.projeto.dao.FluxoDao;
import br.itau.projeto.marcia.projeto.model.Fluxo;

@RestController
@CrossOrigin("*")
@RequestMapping("/fluxo")
public class FluxoController {
	@Autowired
	private FluxoDao dao1;
	
	@GetMapping 
	
	public ArrayList<Fluxo> recuperarTudo(){
		ArrayList<Fluxo> lista;
		lista=(ArrayList<Fluxo>)dao1.findAll();
		return lista;	
	}
}
