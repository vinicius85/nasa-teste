package br.com.elo7.selecao.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.elo7.selecao.modelo.Coordenada;
import br.com.elo7.selecao.modelo.Direcao;
import br.com.elo7.selecao.modelo.Robo;

@Controller
public class RoboController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String inicializarForms() {
		return "nasa";
	}

	@RequestMapping(value = "/nasaForm", method = RequestMethod.POST)
	public ModelAndView getParametrosEntrada(
			@RequestParam("entrada") String entrada) {

		String[] linhas = entrada.split("\r\n");

		String[] coordPlanalto = linhas[0].split(" ");
		ModelAndView mav = new ModelAndView("result");
		mav.addObject("coordPlanalto", coordPlanalto);

		int restanteLinhas = linhas.length - 1;

		List<Robo> robots = new ArrayList<Robo>();

		for (int i = 1; i < restanteLinhas; i = i + 2) {

			String[] estadoRobot = linhas[i].split(" ");
			String caminhoRobot = linhas[i + 1];

			Robo robo = new Robo(new Coordenada(
					Integer.valueOf(estadoRobot[0]),
					Integer.valueOf(estadoRobot[1])),
					Direcao.valueOf(estadoRobot[2]));
			this.aplicarAcao(robo, caminhoRobot);

			robots.add(robo);

		}

		mav.addObject("robots", robots);

		return mav;
	}

	private void aplicarAcao(Robo robo, String caminhos) {

		for (char c : caminhos.toCharArray()) {

			if (c == 'L') {
				robo.left();
			}

			else if (c == 'R') {
				robo.right();
			}

			else if (c == 'M') {
				robo.move();
			}
		}

	}
}
