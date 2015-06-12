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

	@Override
	public String toString() {
		return "Robo [coordenada=" + coordenada + ", direcao=" + direcao + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Robo other = (Robo) obj;
		if (this.getCoordenada().getX() == other.getCoordenada().getX()
				&& this.getCoordenada().getY() == other.getCoordenada().getY()
				&& this.direcao == other.getDirecao()) {
			return true;
		}
		return false;
	}

}
