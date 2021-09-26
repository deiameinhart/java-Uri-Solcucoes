package uri;

/*
 * @author Andréa Meinhart
 * @category NExT - Imersão Java
 * @Exercicios URI Judge 
 * @class Fundamentos1116
 */

/*
 * Dividindo X por Y
 * leia 2 números e imprima o resultado da divisão do primeiro pelo segundo.
 * Caso não for possível mostre a mensagem “divisao impossivel” para os
 * valores em questão.
 * ENTRADA: contém um número inteiro N. Este N será a quantidade de pares
 * de valores inteiros (X e Y) que serão lidos em seguida.
 * SAÍDA: Para cada caso mostre o resultado da divisão com um dígito após
 * o ponto decimal, ou “divisao impossivel” caso não seja possível
 * efetuar o cálculo.
 */

 import java.util.Scanner;

public class DividindoXY {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int n = teclado.nextInt();
    int resultado = 0;

    for(int i = 0; i <= n; i++) {
      int x = teclado.nextInt();
      int y = teclado.nextInt();

      resultado = x / y;

      if(resultado >= 0){
        System.out.println(resultado);
      }else{
        System.out.println("divisao impossivel");
      }
    }
    teclado.close();
  }
}
