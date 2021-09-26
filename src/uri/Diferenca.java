package uri;
/*
 * @author Andréa Meinhart
 * @category NExT - Imersão Java
 * @Exercicios URI Judge 
 * @class Fundamentos1007
 */

/*
 * Diferença
 * Leia quatro valores inteiros A, B, C e D. 
 * A seguir, calcule e mostre a diferença do produto
 * de A e B pelo produto de C e D segundo a
 * fórmula: DIFERENCA = (A * B - C * D).
 * SAIDA: DIFERENCA = -26
*/

import java.util.Scanner;

public class Diferenca {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int a = teclado.nextInt();
    int b = teclado.nextInt();
    int c = teclado.nextInt();
    int d = teclado.nextInt();
    int diferenca = (a * b - c * d);
    System.out.printf("DIFERENÇA = %d", diferenca);
    teclado.close();
  }
}
