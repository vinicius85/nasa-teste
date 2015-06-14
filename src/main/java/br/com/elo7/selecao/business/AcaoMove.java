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

		Coordenada coordenadaInicial = robo.getPlanalto()
				.getCoordenadaInicial();
		Coordenada coordenadaFinal = robo.getPlanalto().getCoordenadaFinal();

		if (direcao == Direcao.N && coordenada.getY() < coordenadaFinal.getY()) {
			coordenada.setY(coordenada.getY() + 1);
		}

		else if (direcao == Direcao.S
				&& coordenada.getY() > coordenadaInicial.getY()) {
			coordenada.setY(coordenada.getY() - 1);
		}

		else if (direcao == Direcao.W
				&& coordenada.getX() > coordenadaInicial.getX()) {
			coordenada.setX(coordenada.getX() - 1);
		}

		else if (direcao == Direcao.E
				&& coordenada.getX() < coordenadaFinal.getX()) {
			coordenada.setX(coordenada.getX() + 1);
		}
	}

}
