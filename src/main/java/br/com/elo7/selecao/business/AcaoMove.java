package br.com.elo7.selecao.business;

import br.com.elo7.selecao.modelo.Coordenada;
import br.com.elo7.selecao.modelo.Direcao;
import br.com.elo7.selecao.modelo.Robo;

public class AcaoMove implements AcaoRobot {

	private Robo robo;

	public AcaoMove(Robo robo) {
		this.robo = robo;
	}

	@Override
	public void mudaEstado() {
		Direcao direcao = robo.getDirecao();
		Coordenada coordenada = robo.getCoordenada();
		if (direcao == Direcao.N) {
			coordenada.setY(coordenada.getY() + 1);
		}

		else if (direcao == Direcao.S) {
			coordenada.setY(coordenada.getY() - 1);
		}

		else if (direcao == Direcao.W) {
			coordenada.setX(coordenada.getX() - 1);
		}

		else if (direcao == Direcao.E) {
			coordenada.setX(coordenada.getX() + 1);
		}
	}

}
