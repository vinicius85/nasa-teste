package br.com.elo7.selecao.business;

import br.com.elo7.selecao.modelo.Direcao;
import br.com.elo7.selecao.modelo.Robo;

public class AcaoDireita implements AcaoRobot{
	
	private Robo robo;

	public AcaoDireita(Robo robo) {
		this.robo = robo;
	}

	@Override
	public void mudaEstado() {
		
		Direcao direcao = robo.getDirecao();
		if (direcao == Direcao.NORTH) {
			robo.setDirecao(Direcao.EAST);
		}

		else if (direcao == Direcao.EAST) {
			robo.setDirecao(Direcao.SOUTH);
		}

		else if (direcao == Direcao.SOUTH) {
			robo.setDirecao(Direcao.WEST);
		}

		else if (direcao == Direcao.WEST) {
			robo.setDirecao(Direcao.NORTH);
		}
		
	}

}
