package br.com.elo7.selecao.business;

import br.com.elo7.selecao.modelo.Coordenada;
import br.com.elo7.selecao.modelo.Direcao;
import br.com.elo7.selecao.modelo.Movimento;
import br.com.elo7.selecao.modelo.Robo;

public class Mudar {

	public void mudarEstado(Robo robo, Movimento movimento) {

		Coordenada coordenada = robo.getCoordenada();
		Direcao direcao = robo.getDirecao();

		switch (movimento) {

		case LEFT:
			if (direcao == Direcao.NORTH) {
				robo.setDirecao(Direcao.WEST);
			}

			else if (direcao == Direcao.WEST) {
				robo.setDirecao(Direcao.SOUTH);
			}

			else if (direcao == Direcao.SOUTH) {
				robo.setDirecao(Direcao.EAST);
			}

			else if (direcao == Direcao.EAST) {
				robo.setDirecao(Direcao.NORTH);
			}
			break;

		case RIGHT:

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
			break;

		case MOVE:
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
			break;

		}
		
	}

}
