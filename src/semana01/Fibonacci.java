/*
 * @author Andréa Meinhart
 * @category NExT - Imersão Java
 * @aula 01 de 30/08/2021 
 * @class Fibonacci
 */

/*
 * implemente um programa que lê um número do teclado
 * e em seguida imprime a seqüência de Fibonacci até
 * o n-esimo número 
*/
package semana01;

import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite um número ");
    int numero = teclado.nextInt();

    for(int i = 0; i <= numero; i++) {
      if(i < 2) {
        System.out.println(i);
      } else {
        System.out.println((i - 1) + (i - 2));
      }
      //System.out.println((i < 2) ? i : (i - 1) + (i - 2));
    }
    teclado.close(); //fecha a variavel aberta la em cima
  }
}
