package br.com.utfpr.sd.rmi.modelos;

import java.io.Serializable;

public class Passagem implements Serializable {
	
	private static final long serialVersionUID = 355205998811598069L;

	private int tipo;
	private String origem;
	private String destino;
	private String dataIda;
	private String dataVolta;
	private int numeroPessoas;
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getDataIda() {
		return dataIda;
	}
	public void setDataIda(String dataIda) {
		this.dataIda = dataIda;
	}
	public String getDataVolta() {
		return dataVolta;
	}
	public void setDataVolta(String dataVolta) {
		this.dataVolta = dataVolta;
	}
	public int getNumeroPessoas() {
		return numeroPessoas;
	}
	public void setNumeroPessoas(int numeroPessoas) {
		this.numeroPessoas = numeroPessoas;
	}
}
