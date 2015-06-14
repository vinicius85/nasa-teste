package br.com.elo7.selecao.business;

import br.com.elo7.selecao.modelo.Direcao;
import br.com.elo7.selecao.modelo.Robo;

public class AcaoEsquerda implements AcaoRobot {

	private Robo robo;

	public AcaoEsquerda(Robo robo) {
		this.robo = robo;
	}

	@Override
	public void mudaEstado() {
		Direcao direcao = robo.getDirecao();

		if (direcao == Direcao.N) {
			robo.setDirecao(Direcao.W);
		}

		else if (direcao == Direcao.W) {
			robo.setDirecao(Direcao.S);
		}

		else if (direcao == Direcao.S) {
			robo.setDirecao(Direcao.E);
		}

		else if (direcao == Direcao.E) {
			robo.setDirecao(Direcao.N);
		}
	}

}