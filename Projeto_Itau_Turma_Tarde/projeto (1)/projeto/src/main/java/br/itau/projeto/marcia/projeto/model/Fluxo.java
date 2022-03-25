package br.itau.projeto.marcia.projeto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fluxo_caixa")

public class Fluxo {
	@Id

	
	@Column(name="ag", nullable = false)
	private int ag;
	
	@Column(name="conta", nullable = false)
	private int conta;
	
	@Column(name="fluxo")
	private int fluxo;
	
	@Column(name="entrada")
	private double entrada;
	
	@Column(name="saida")
	private double saida;
	
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

	public int getFluxo() {
		return fluxo;
	}

	public void setFluxo(int fluxo) {
		this.fluxo = fluxo;
	}

	public double getEntrada() {
		return entrada;
	}

	public void setEntrada(double entrada) {
		this.entrada = entrada;
	}

	public double getSaida() {
		return saida;
	}

	public void setSaida(double saida) {
		this.saida = saida;
	}
}
