/*
 * @author Andréa Meinhart
 * @category NExT - Imersão Java
 * @aula 01 de 30/08/2021 
 * @class Fatorial
 */

/*
O fatorial de um número n (n pertence ao conjunto dos números naturais)
é sempre o produto de todos os seus antecessores, incluindo si próprio
e excluindo o zero. 
*/

package semana01;

import java.util.Scanner;

public class Fatorial {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int numero = teclado.nextInt();
    int valorInicial = numero;
    int fatorial = 1;

    while (numero > 0) {
      fatorial = fatorial * numero;
      numero--;
    }
    System.out.println("O resultado do fatorial de " + valorInicial + " é: " + fatorial);
    teclado.close();
  }
}
