package br.itau.projeto.marcia.projeto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="correntista")
public class Cliente {

	@Id
	
	@Column(name="ag", nullable = false)
	private int ag;
	
	@Column(name="conta", nullable = false)
	private int conta;
	
	@Column(name="nome", length=100, nullable = false)
	private String nome;
	
	@Column(name="email", length=150, nullable = false, unique = true)
	private String email;
	
	@Column(name="telefone", length=15)
	private String telefone;
	
	@Column(name="saldo")
	private double saldo;

	public int getAg() {
		return ag;
	}

	public void setAg(int ag) {
		this.ag = ag;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
