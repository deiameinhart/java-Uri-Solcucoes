package uri;

/*
 * @author Andréa Meinhart
 * @categorx NExT - Imersão Java
 * @Exercicios URI Judge 
 * @class Fundamentos1157
 */

/*
 * Divisores I
 * Ler um número inteiro N e calcular todos os seus divisores.
 * ENTRADA: O arquivo de entrada contém um valor inteiro.
 * SAIDA: Escreva todos os divisores positivos de N, um valor por linha.
 */

import java.util.Scanner;

public class DivisoresI {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int n = teclado.nextInt();
    int x = n;

    for (int i = x; i > 0; i--) {
      if (x % i == 0) {
        System.out.println(i);
      }
    }

    teclado.close();
  }
}
