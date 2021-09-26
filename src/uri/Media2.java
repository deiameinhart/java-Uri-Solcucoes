package uri;
/*
 * @author Andréa Meinhart
 * @category NExT - Imersão Java
 * @Exercicios URI Judge 
 * @class Fundamentos1006
 */

/*
 * Média 2
 * Leia 3 valores, no caso, variáveis A, B e C, 
 * que são as três notas de um aluno. A seguir,
 *  calcule a média do aluno, sabendo que a nota A tem peso 2,
 * a nota B tem peso 3 e a nota C tem peso 5.
 * Considere que cada nota pode ir de 0 até 10.0, 
 * sempre com uma casa decimal.
 * ENTRADA: 5.0 3.0 8.0
 * SAIDA: MEDIA = 6.3
 */

import java.util.Scanner;

public class Media2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double a = teclado.nextDouble();
    double b = teclado.nextDouble();
    double c = teclado.nextDouble();
    double media;
    media = (a * 2.0 + b * 3.0 + c * 5.0)/10;
    System.out.printf("MEDIA = %.1f", media);
    teclado.close();
  }
}
