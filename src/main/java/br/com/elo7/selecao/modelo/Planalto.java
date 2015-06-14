package br.com.elo7.selecao.modelo;

public class Planalto {

	private Coordenada coordenadaInicial;

	private Coordenada coordenadaFinal;

	public Planalto(Integer xFinal, Integer yFinal) {
		this.coordenadaInicial = new Coordenada(0, 0);
		this.coordenadaFinal = new Coordenada(xFinal, yFinal);
	}

	public Coordenada getCoordenadaInicial() {
		return coordenadaInicial;
	}

	public Coordenada getCoordenadaFinal() {
		return coordenadaFinal;
	}

}
