package uri;
/*
 * @author Andréa Meinhart
 * @category NExT - Imersão Java
 * @Exercicios URI Judge 
 * @class Fundamentos1036
 */

/*
 * Triângulo
 * Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. 
 * Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem: Perimetro = XX.X
 * m caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem: Area = XX.X
 * ENTRADA: A entrada contém três valores reais - 6.0 4.0 2.1
 * SAIDA: presentado com uma casa decimal Area = 10.0 / Perimetro = 12.1
 */

import java.util.Scanner;

public class Triangulo {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double a = teclado.nextDouble();
    double b = teclado.nextDouble();
    double c = teclado.nextDouble();

    if (a < b + c && b < a + c && c < a + b) {
      double triangulo = (a * c) / 2;
      System.out.printf("Perímetro = %.1f", triangulo);

    } else {
      double trapezio = (c * (b + a)) / 2;
      System.out.printf("Área ' = %.1f", trapezio);
    }
    teclado.close();
  }
}
