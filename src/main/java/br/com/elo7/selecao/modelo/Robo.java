package br.com.elo7.selecao.modelo;
public class Robo {

	private Coordenada coordenada;

	private Direcao direcao;

	public Robo(Coordenada coordenada, Direcao direcao) {
		this.coordenada = coordenada;
		this.direcao = direcao;
	}

	public Coordenada getCoordenada() {
		return coordenada;
	}

	public void setCoordenada(Coordenada coordenada) {
		this.coordenada = coordenada;
	}

	public Direcao getDirecao() {
		return direcao;
	}

	public void setDirecao(Direcao direcao) {
		this.direcao = direcao;
	}

}
