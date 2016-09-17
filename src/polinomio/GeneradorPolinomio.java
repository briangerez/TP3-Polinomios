package polinomio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class GeneradorPolinomio {

	public static void main(String[] args) {
	
		GeneradorPolinomio generador = new GeneradorPolinomio();
		generador.generar(8);
	}

	public void generar(int grado){
		PrintWriter pw = null;
        try {
            pw = new PrintWriter(new File("LotesDePrueba\\Polinomio\\Entrada\\PolinomioEvaluarMSucesivas.in"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        pw.println(grado);
        
        int rangeMin = -5;
        int rangeMax = 7;
        
        Random r = new Random();

        for (int i = grado; i >= 0 ; i--){
                int randomValue = rangeMin + (rangeMax - rangeMin) * r.nextInt(50);
                pw.print(randomValue);
                pw.println();
        }
        pw.close();
	}
}
