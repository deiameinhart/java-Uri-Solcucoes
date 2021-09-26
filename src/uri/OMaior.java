package uri;

/*
 * @author Andréa Meinhart
 * @category NExT - Imersão Java
 * @Exercicios URI Judge 
 * @class Fundamentos1013
 */

/*
 * O Maior
 * Leia três valores e apresente o maior dos três valores lidos seguido
 * da mensagem “eh o maior”.
 * ENTRADA: 7 14 106
 * SAIDA: 106 eh o maior
*/

import java.util.Scanner;

public class OMaior {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int valor1 = teclado.nextInt();
    int valor2 = teclado.nextInt();
    int valor3 = teclado.nextInt();

    if (valor1 > valor2 && valor1 > valor3) {
      System.out.println(valor1 + " eh o maior");
    } else if (valor2 > valor3) {
      System.out.println(valor2 + " eh o maior");
    } else {
      System.out.println(valor3 + " eh o maior");
    }

    teclado.close();
  }
}