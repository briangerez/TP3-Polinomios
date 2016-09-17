package testTP3;

import java.io.FileNotFoundException;

import org.junit.Assert;
import org.junit.Test;

import polinomio.Polinomio;

public class TestPolinomio {

	@Test
	public void evaluarMSucesivas() throws FileNotFoundException {
		Polinomio polinomio = new Polinomio("LotesDePrueba\\Polinomio\\Entrada\\PolinomioEvaluarMSucesivas.in");
		double resultadoEsperado = 238789;
		double X = 2;
		Assert.assertEquals(resultadoEsperado, polinomio.evaluarMSucesivas(X), 0);
	}

}
