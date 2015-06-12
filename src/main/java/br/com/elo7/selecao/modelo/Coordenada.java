package br.com.elo7.selecao.modelo;

public class Coordenada {

	private Integer x;

	private Integer y;

	public Coordenada(Integer x, Integer y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Coordenada [x=" + x + ", y=" + y + "]";
	}

	public void setY(Integer y) {
		this.y = y;
	}

}
