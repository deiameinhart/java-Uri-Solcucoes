package uri;

/*
 * @author Andréa Meinhart
 * @category NExT - Imersão Java
 * @Exercicios URI Judge 
 * @class Fundamentos1036
 */

/*
 * Fórmula de Bhaskara
 * Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara.
 * Se não for possível calcular as raízes, mostre a mensagem correspondente 
 * “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.
 * ENTRADA: três valores de ponto flutuante (double) A, B e C
 * SAIDA: R1 = -0.29788  / R2 = -1.71212 / Impossivel calcular
 */

import java.util.Scanner;

public class FormulaBhaskara {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double a = teclado.nextDouble();
    double b = teclado.nextDouble();
    double c = teclado.nextDouble();
    
    if ((a == 0) | (b * b - 4 * a * c < 0)) {
			System.out.println("Impossivel calcular");
		}

    double bascara = Math.sqrt((b * b) - 4 * a * c);
    double r1 = (-b + bascara) / (2 * a);
    double r2 = (-b - bascara) / (2 * a);
    System.out.println(String.format("R1 = %.5f", r1));
    System.out.println(String.format("R2 = %.5f", r2));

    teclado.close();
  }
  
}
