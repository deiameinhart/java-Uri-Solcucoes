package uri;
/*
 * @author Andréa Meinhart
 * @category NExT - Imersão Java
 * @Exercicios URI Judge 
 * @class Fundamentos1010
 */

/*
 * Cálculo Simples
 * Neste problema, deve-se ler o código de uma peça 1, 
 * o número de peças 1, o valor unitário de cada peça 1, 
 * o código de uma peça 2, o número de peças 2 e 
 * o valor unitário de cada peça 2. 
 * Após, calcule e mostre o valor a ser pago.
 * ENTRADA contém duas linhas de dados em cada linha 
 * haverá 3 valores, respectivamente dois inteiros 
 * e um valor com 2 casas decimais = 12 1 5.30
 * SAIDA = VALOR A PAGAR: R$ 15.50
 */

import java.util.Scanner;

public class CalculoSimples {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    // primeira entrada
    int num1 = teclado.nextInt();
    int num2 = teclado.nextInt();
    double num3 = teclado.nextDouble();
    // segunda entrada
    int num4 = teclado.nextInt();
    int num5 = teclado.nextInt();
    double num6 = teclado.nextDouble();
    // reusltado
    double valorTotal = (num2 * num3) + (num5 * num6);
    // saida
    System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
    teclado.close();
  }
}
