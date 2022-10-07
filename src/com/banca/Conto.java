package com.banca;

public class Conto {
	 private int idConto;
	 private String nomePropietario;
	 private Double saldo;

	public Conto(int idConto, String nomePropietario) {
		this.idConto = idConto;
		this.nomePropietario = nomePropietario;
		this.saldo = 0.0;
	}

	public int getIdConto() {
		return idConto;
	}

	public void setIdConto(int idConto) {
		this.idConto = idConto;
	}

	public String getNomePropietario() {
		return nomePropietario;
	}

	public void setNomePropietario(String nomePropietario) {
		this.nomePropietario = nomePropietario;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conto [idConto=" + idConto + ", nomePropietario=" + nomePropietario + ", saldo=" + saldo + "]";
	}
	
	public void versamento (double sommaVersata) {
		saldo = this.saldo + sommaVersata;
	}
	public double prelevare (double sommaPrelevata) {
		if (sommaPrelevata > saldo) {
			return -1;
			
		} else {
			 saldo = this.saldo - sommaPrelevata;
			 return saldo;
		}
		
	}
	
	 
};
