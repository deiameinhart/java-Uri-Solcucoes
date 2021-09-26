package uri;

/*
 * @author Andréa Meinhart
 * @category NExT - Imersão Java
 * @Exercicios URI Judge 
 * @class Fundamentos1165
 */

/*
 * Número Primo
 * Na matemática, um Número Primo é aquele que pode ser dividido somente 
 * por 1 (um) e por ele mesmo. Por exemplo, o número 7 é primo, pois pode
 * ser dividido apenas pelo número 1 e pelo número 7.
 * 
 * ENTRADA:Contém vários casos de teste. A primeira linha da entrada
 * contém um inteiro N (1 ≤ N ≤ 100), indicando o número de casos de 
 * teste da entrada. Cada uma das N linhas seguintes contém um valor 
 * inteiro X (1 < X ≤ 107), que pode ser ou não, um número primo.
 * 
 * SAÍDA: Para cada caso de teste de entrada, imprima a mensagem 
 * “X eh primo” ou “X nao eh primo”, de acordo com a especificação 
 * fornecida.
 */

import java.util.Scanner;

public class NumeroPrimo {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int qtdNumeros = teclado.nextInt();
    
    // quantidade de vezes que roda a aplicacao
    for (int i = 0; i < qtdNumeros; i++) {
      
      // insere o numero que sera verificado
      int n = teclado.nextInt();
      if (n % 2 == 0) {
        System.out.println(n + " nao eh primo");
      } else {
        System.out.println(n + " eh primo");
      }
    }

    teclado.close();
  }
}
