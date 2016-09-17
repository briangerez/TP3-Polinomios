package polinomio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Polinomio {
	int grado;
	private double[] coeficiente;
	
	public Polinomio(String path) throws FileNotFoundException{

		Scanner sc = new Scanner (new File (path));
		
		this.grado = sc.nextInt();
		
		this.coeficiente = new double[this.grado + 1];
		int i = 0;
		while (sc.hasNextDouble()){
			this.coeficiente[i] = sc.nextDouble();
			i++;
		}
		sc.close();
	}

	public Polinomio(int grado){
		this.grado = grado;
		this.coeficiente = new double[this.grado + 1];
	}
	
	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public double[] getCoeficiente() {
		return coeficiente;
	}

	public void setCoeficiente(double[] coeficiente) {
		this.coeficiente = coeficiente;
	}
	
	//O(n^2)
	public double evaluarMSucesivas(double X){
		double resultado = 0;
		for (int i = 0; i < coeficiente.length; i++) {
			double xCalculado = 1;
			for(int j = 0; j < this.grado - i; j++){
				xCalculado *= X;  
			}
			resultado += this.coeficiente[i] * xCalculado;
		}
		return resultado;
	}
	
	public double evaluarRecursiva(double x){
		double resultado = 0;
		for(int i = 0; i < this.coeficiente.length; i++){
			if(i < this.coeficiente.length - 1)
				resultado +=  potenciaSinPar(x, (this.coeficiente.length-1) - i) * this.coeficiente[i];
			else
				resultado +=  this.coeficiente[i] ;
			}
		return resultado;
	}
		
	
	public double potenciaSinPar(double x, int n){
		
		if(n >1)
			return  x*potenciaSinPar(x,n -1);
   		return x;	
	}

	public double evaluarRecursivaPar(double x){
		double resultado = 0;
		for (int i = 0; i < coeficiente.length; i++) {
			double xCalculado = 0;
			int exponente = coeficiente.length - i -1;
			xCalculado = potenciaPar(x,exponente);
			resultado += this.coeficiente[i] * xCalculado;
		}
		return resultado;
	}

	public double potenciaPar(double x, int n){
		double resultado = 0;
		if(n == 0){
			return 1;
		}
		else if (n % 2 == 0) {
			resultado = potenciaPar(x*x, n/2);
			return resultado;
		}else{
			resultado = x * potenciaPar(x, n-1);
			return resultado;
		}		
	}
	public double evaluarProgDinamica(double x){
		double resultado = this.coeficiente[this.grado];
		double aux = 1;
		for(int i = this.grado - 1; i >= 0; i--){
			aux *= x;
			resultado += aux * this.coeficiente[i];
		}
		return resultado;
	}

	public double evaluarPow(double X){
		double resultado = this.coeficiente[this.grado];
		
		for (int i = 0; i < coeficiente.length - 1; i++) {
			resultado += this.coeficiente[i] * Math.pow(X, this.grado - i);
		}
		return resultado;
	}
}