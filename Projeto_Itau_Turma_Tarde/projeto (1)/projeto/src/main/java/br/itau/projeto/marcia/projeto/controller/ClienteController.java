package br.itau.projeto.marcia.projeto.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itau.projeto.marcia.projeto.dao.ClienteDao;
import br.itau.projeto.marcia.projeto.model.Cliente;

@RestController // Monitorar uma URL
@CrossOrigin("*")
@RequestMapping("/clientes")
public class ClienteController {
	
	
	@Autowired // Permite com que a interface seja executada com os processos CRUD
	private ClienteDao dao;
	
	@GetMapping // Permite indicar o nome da página que você deverá executar no endereço da sua URL
	
	// Criando um método de leitura de dados da nossa tabela 
	public ArrayList<Cliente> recuperarTudo(){
		ArrayList<Cliente> lista;
		lista=(ArrayList<Cliente>)dao.findAll();
		return lista;		
		
	}
}

