package br.com.elo7.selecao.testes;

import org.junit.Assert;
import org.junit.Test;

import br.com.elo7.selecao.modelo.Coordenada;
import br.com.elo7.selecao.modelo.Direcao;
import br.com.elo7.selecao.modelo.Planalto;
import br.com.elo7.selecao.modelo.Robo;

public class MudaEstadoTests {

	/**
	 * Entrada de Teste:
	 * 
	 * 5 5 1 2 N LMLMLMLMM 3 3 E MMRMMRMRRM Saida esperada:
	 * 
	 * 1 3 N 5 1 E
	 */

	@Test
	public void testesMudaEstado() {

		Robo robo = new Robo(new Coordenada(1, 2), Direcao.N,
				new Planalto(5, 5));
		Robo expRobo = new Robo(new Coordenada(1, 3), Direcao.N, new Planalto(
				5, 5));

		robo.left().move().left().move().left().move().left().move().move();

		Assert.assertEquals(expRobo, robo);

		Robo robo2 = new Robo(new Coordenada(3, 3), Direcao.E, new Planalto(5,
				5));
		Robo expRobo2 = new Robo(new Coordenada(5, 1), Direcao.E, new Planalto(
				5, 5));

		robo2.move().move().right().move().move().right().move().right()
				.right().move();
		Assert.assertEquals(expRobo2, robo2);
	}

}
