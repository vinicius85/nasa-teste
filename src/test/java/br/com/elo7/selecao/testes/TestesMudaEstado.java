package br.com.elo7.selecao.testes;

import org.junit.Assert;
import org.junit.Test;

import br.com.elo7.selecao.modelo.Coordenada;
import br.com.elo7.selecao.modelo.Direcao;
import br.com.elo7.selecao.modelo.Movimento;
import br.com.elo7.selecao.modelo.Robo;
import br.com.elo7.selecao.state.Mudar;

public class TestesMudaEstado {

	/**
	 * Entrada de Teste:
	 * 
	 * 5 5 1 2 N LMLMLMLMM 3 3 E MMRMMRMRRM Saída esperada:
	 * 
	 * 1 3 N 5 1 E
	 */

	@Test
	public void testesMudaEstado() {

		Robo robo = new Robo(new Coordenada(1, 2), Direcao.NORTH);
		Robo expRobo = new Robo(new Coordenada(1, 3), Direcao.NORTH);
		
		Mudar mudar = new Mudar();
		mudar.mudarEstado(robo, Movimento.LEFT);
		mudar.mudarEstado(robo, Movimento.MOVE);
		mudar.mudarEstado(robo, Movimento.LEFT);
		mudar.mudarEstado(robo, Movimento.MOVE);
		mudar.mudarEstado(robo, Movimento.LEFT);
		mudar.mudarEstado(robo, Movimento.MOVE);
		mudar.mudarEstado(robo, Movimento.LEFT);
		mudar.mudarEstado(robo, Movimento.MOVE);
		mudar.mudarEstado(robo, Movimento.MOVE);
		
		Assert.assertEquals(robo, expRobo);
		
		
	    Robo robo2 = new Robo(new Coordenada(3, 3), Direcao.EAST);
	    Robo expRobo2 = new Robo(new Coordenada(5, 1), Direcao.EAST);
		
		mudar.mudarEstado(robo2, Movimento.MOVE);
		mudar.mudarEstado(robo2, Movimento.MOVE);
		mudar.mudarEstado(robo2, Movimento.RIGHT);
		mudar.mudarEstado(robo2, Movimento.MOVE);
		mudar.mudarEstado(robo2, Movimento.MOVE);
		mudar.mudarEstado(robo2, Movimento.RIGHT);
		mudar.mudarEstado(robo2, Movimento.MOVE);
		mudar.mudarEstado(robo2, Movimento.RIGHT);
		mudar.mudarEstado(robo2, Movimento.RIGHT);
		mudar.mudarEstado(robo2, Movimento.MOVE);
		
		Assert.assertEquals(robo2, expRobo2);
	}

}
