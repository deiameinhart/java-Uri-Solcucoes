package uri;
/*
 * @author Andréa Meinhart
 * @category NExT - Imersão Java
 * @Exercicios URI Judge 
 * @class Fundamentos1005
 */

/*
 * Média 1
 * 2 valores de ponto flutuante de dupla precisão A e B, que 
 * correspondem a 2 notas de um aluno. A seguir, calcule a média do
 *  aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5
 * (A soma dos pesos portanto é 11). 
 * Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa 
 * decimal.
 * ENTRADA = 5.0 3.0
 * SAIDA = MEDIA = 6.43182
 */

import java.util.Scanner;

public class Media1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double nota1 = teclado.nextDouble();
    double nota2 = teclado.nextDouble();
    double media;
    media = (nota1 * 3.5 + nota2 * 7.5) / 11;
    System.out.printf("MEDIA = %.5f", media);
    teclado.close();
  }
}
