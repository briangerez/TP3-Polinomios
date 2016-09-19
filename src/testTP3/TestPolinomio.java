package testTP3;

import java.io.FileNotFoundException;

import org.junit.Assert;
import org.junit.Test;

import polinomio.Polinomio;

public class TestPolinomio {

	/*@Test
	public void evaluarMSucesivas() throws FileNotFoundException {
		Polinomio polinomio = new Polinomio("LotesDePrueba\\Polinomio\\Entrada\\PolinomioEvaluarMSucesivas.in");
		double resultadoEsperado = 238789;
		double X = 2;
		Assert.assertEquals(resultadoEsperado, polinomio.evaluarMSucesivas(X), 0);
	
	}*/

	
	/*@Test
	public void evaluarRecursiva() throws FileNotFoundException {
		Polinomio polinomio = new Polinomio("LotesDePrueba\\Polinomio\\Entrada\\PolinomioEvaluarMSucesivas.in");
		double resultadoEsperado = 238789;
		double X = 2;
		Assert.assertEquals(resultadoEsperado, polinomio.evaluarRecursiva(X), 0);
	
	}*/
	
	/*@Test
	public void evaluarProgDinamica() throws FileNotFoundException {
		Polinomio polinomio = new Polinomio("LotesDePrueba\\Polinomio\\Entrada\\PolinomioEvaluarMSucesivas.in");
		double resultadoEsperado = 238789;
		double X = 2;
		Assert.assertEquals(resultadoEsperado, polinomio.evaluarProgDinamica(X), 0);
	
	}*/
	  /*
	@Test
	public void evaluarPow() throws FileNotFoundException {
		Polinomio polinomio = new Polinomio("LotesDePrueba\\Polinomio\\Entrada\\PolinomioEvaluarMSucesivas.in");
		double resultadoEsperado = 238789;
		double X = 2;
		Assert.assertEquals(resultadoEsperado, polinomio.evaluarPow(X), 0);
	
	}*/
	

	@Test
	public void evaluarHorner() throws FileNotFoundException {
		Polinomio polinomio = new Polinomio("LotesDePrueba\\Polinomio\\Entrada\\PolinomioEvaluarMSucesivas.in");
		double resultadoEsperado = 238789;
		double X = 2;
		Assert.assertEquals(resultadoEsperado, polinomio.evaluarHorner(X), 0);
	
	}

}
