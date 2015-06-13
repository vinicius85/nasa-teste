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
		if (direcao == Direcao.NORTH) {
			coordenada.setY(coordenada.getY() + 1);
		}

		else if (direcao == Direcao.SOUTH) {
			coordenada.setY(coordenada.getY() - 1);
		}

		else if (direcao == Direcao.WEST) {
			coordenada.setX(coordenada.getX() - 1);
		}

		else if (direcao == Direcao.EAST) {
			coordenada.setX(coordenada.getX() + 1);
		}
	}

}
