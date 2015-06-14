package br.com.elo7.selecao.testes;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import br.com.elo7.selecao.controller.MainApplication;
import br.com.elo7.selecao.controller.RoboController;
import br.com.elo7.selecao.modelo.Coordenada;
import br.com.elo7.selecao.modelo.Direcao;
import br.com.elo7.selecao.modelo.Planalto;
import br.com.elo7.selecao.modelo.Robo;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MainApplication.class)
@WebAppConfiguration
@IntegrationTest
@DirtiesContext
public class ControllerTests {

	@Autowired
	private RoboController controller;

	@Test
	public void testVelocityTemplate() throws Exception {
		ResponseEntity<String> entity = new TestRestTemplate().getForEntity(
				"http://localhost:8080", String.class);
		Assert.assertEquals(HttpStatus.OK, entity.getStatusCode());
		Assert.assertTrue("Wrong body:\n" + entity.getBody(), entity.getBody()
				.contains("Configuracao"));
	}

	@Test
	public void testVelocityErrorTemplate() throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.TEXT_HTML));
		HttpEntity<String> requestEntity = new HttpEntity<String>(headers);

		ResponseEntity<String> responseEntity = new TestRestTemplate()
				.exchange("http://localhost:8080/does-not-exist",
						HttpMethod.GET, requestEntity, String.class);

		Assert.assertEquals(HttpStatus.NOT_FOUND,
				responseEntity.getStatusCode());
		Assert.assertTrue("Wrong body:\n" + responseEntity.getBody(),
				responseEntity.getBody().contains("404"));
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testVariablesOnModelAndViewMap() {

		String entrada = "3 3\r\n1 1 N\r\nLM";
		ModelAndView view = controller.getParametrosEntrada(entrada);
		ModelMap modelMap = view.getModelMap();

		String[] coordPlanalto = (String[]) modelMap.get("coordPlanalto");
		Assert.assertEquals("3", coordPlanalto[0]);
		Assert.assertEquals("3", coordPlanalto[1]);

		String entradaAtual = (String) modelMap.get("entrada");
		Assert.assertEquals(entrada, entradaAtual);

		List<Robo> robos = (List<Robo>) modelMap.get("robots");
		Assert.assertTrue(robos != null && !robos.isEmpty());

		Robo robo = robos.get(0);

		Assert.assertEquals(new Integer(0), robo.getCoordenada().getX());
		Assert.assertEquals(new Integer(1), robo.getCoordenada().getY());
		Assert.assertEquals(Direcao.W, robo.getDirecao());
	}

	@Test
	public void testAplicarCaminho() {
		
		Robo robo = new Robo(new Coordenada(1,1), Direcao.E, new Planalto(2,2));
		String caminho = "LMRX";
		
		controller.aplicarAcao(robo, caminho);
		
		Assert.assertEquals(new Integer(1), robo.getCoordenada().getX());
		Assert.assertEquals(new Integer(2), robo.getCoordenada().getY());
		Assert.assertEquals(Direcao.E, robo.getDirecao());
		
	}

}
