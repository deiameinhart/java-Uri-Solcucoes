package uri;

/*
 * @author Andréa Meinhart
 * @category NExT - Imersão Java
 * @Exercicios URI Judge 
 * @class Fundamentos1168
 */

/*
 * LED
 * oão quer montar um painel de leds contendo diversos números. 
 * Ele não possui muitos leds, e não tem certeza se conseguirá 
 * montar o número desejado. Considerando a configuração dos 
 * leds dos números abaixo, faça um algoritmo que ajude João a 
 * descobrir a quantidade de leds necessário para montar o valor.
 * 
 * ENTRADA : A entrada contém um inteiro N, (1 ≤ N ≤ 1000) 
 * correspondente ao número de casos de teste, seguido de N linhas,
 * cada linha contendo um número (1 ≤ V ≤ 10100) correspondente
 * ao valor que João quer montar com os leds.
 *  1 = 2, 2 = 5, 3 = 5, 4 = 4, 5 = 5, 6 = 6, 7 = 3,
 * 8 = 7, 9 = 7, 0 = 6
 * 
 * SAÍDA: Para cada caso de teste, imprima uma linha contendo o
 * número de leds que João precisa para montar o valor desejado,
 * seguido da palavra "leds".
 */

import java.util.Scanner;

public class Led {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String numero = teclado.nextLine();


    teclado.close();
  }
}
