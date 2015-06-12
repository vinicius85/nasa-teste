package br.com.elo7.selecao.modelo;
public enum Direcao {

	NORTH("N"), WEST("W"), EAST("E"), SOUTH("S");

	private String valor;

	private Direcao(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

}
