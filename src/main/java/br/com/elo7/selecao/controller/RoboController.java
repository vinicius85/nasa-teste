package br.com.elo7.selecao.controller;

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
			@RequestParam("tamanho_planalto") String planalto,
			@RequestParam("coordenadas_robot") String coordenadas_robot,
			@RequestParam("direcao_robot") String direcao_robot,
			@RequestParam("caminho_robot") String caminho_robot) {

		String coordPlanalto[] = planalto.split(",");
		String coordRobot[] = coordenadas_robot.split(",");
		Direcao direcaoRobot = Direcao.valueOf(direcao_robot);
		String caminhos = caminho_robot;

		Robo robo = new Robo(new Coordenada(Integer.valueOf(coordRobot[0]),
				Integer.valueOf(coordRobot[1])), direcaoRobot);

		this.aplicarAcao(robo, caminhos);
		
		Coordenada coordenada = robo.getCoordenada();

		ModelAndView mav = new ModelAndView("result");
		mav.addObject("coordPlanalto", coordPlanalto);
		mav.addObject("coordRobot", coordenada);

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
