package br.com.elo7.selecao.modelo;

import br.com.elo7.selecao.business.AcaoDireita;
import br.com.elo7.selecao.business.AcaoEsquerda;
import br.com.elo7.selecao.business.AcaoMove;
import br.com.elo7.selecao.business.AcaoRobot;

public class Robo {

	private AcaoRobot direita;
	private AcaoRobot esquerda;
	private AcaoRobot move;

	private Coordenada coordenada;

	private Direcao direcao;

	public Robo(Coordenada coordenada, Direcao direcao) {
		this.coordenada = coordenada;
		this.direcao = direcao;

		this.direita = new AcaoDireita(this);
		this.esquerda = new AcaoEsquerda(this);
		this.move = new AcaoMove(this);
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

	public Robo right() {
		direita.mudaEstado();
		return this;
	}

	public Robo left() {
		esquerda.mudaEstado();
		return this;
	}

	public Robo move() {
		move.mudaEstado();
		return this;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(this.getCoordenada().getX()).append(" ")
				.append(this.getCoordenada().getY()).append(" ")
				.append(this.getDirecao());

		return result.toString();
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
