package br.com.elo7.selecao.modelo;
public enum Movimento {

	LEFT("L"), RIGHT("R"), MOVE("M");

	private String valor;

	private Movimento(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return this.valor;
	}

}
