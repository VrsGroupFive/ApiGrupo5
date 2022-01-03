package br.com.apigrupo5.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbcontas")

public class Conta {

	@Id
	@Column(name = "numero")
	private int numero;

	@Column(name = "agencia")
	private int agencia;

	@Column(name = "tipo")
	private int tipo;

	@Column(name = "saldo")
	private double saldo;

	@Column(name = "titular", length = 100)
	private String titular;

	public int getNumero() {
		return numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
