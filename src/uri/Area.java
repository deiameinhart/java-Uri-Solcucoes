package uri;
/*
 * @author Andréa Meinhart
 * @category NExT - Imersão Java
 * @Exercicios URI Judge 
 * @class Fundamentos1012
 */

/*
 * Área
 * Escreva um programa que leia três valores com ponto flutuante de dupla 
 * precisão: A, B e C. Em seguida, calcule e mostre:
 * a) a área do triângulo retângulo que tem A por base e C por altura.
 * b) a área do círculo de raio C. (pi = 3.14159)
 * c) a área do trapézio que tem A e B por bases e C por altura.
 * d) a área do quadrado que tem lado B.
 * e) a área do retângulo que tem lados A e B. 
 * 
 * ENTRADA: 3.0 4.0 5.2
 * SAIDA: 
 * TRIANGULO: 7.800
 * CIRCULO: 84.949
 * TRAPEZIO: 18.200
 * QUADRADO: 16.000
 * RETANGULO: 12.000
 */

import java.util.Scanner;

public class Area {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    // entrada
    double a = teclado.nextDouble();
    double b = teclado.nextDouble();
    double c = teclado.nextDouble();
    double pi = 3.14159;

    // triangulo A = (b*h)/2
    double triangulo = (a * c) / 2;

    // circulo raio C. (pi = 3.14159)
    double circulo = pi * (c * c);

    // trapézio que tem A e B por bases e C por altura
    double trapezio = (c * (b + a)) / 2;

    // quadrado que tem lado B
    double quadrado = b * b;

    // retângulo que tem lados A e B
    double retangulo = a * b;

    // saida
    System.out.printf("TRIANGULO: %.3f %n", triangulo);
    System.out.printf("CIRCULO: %.3f %n", circulo);
    System.out.printf("TRAPEZIO: %.3f %n", trapezio);
    System.out.printf("QUADRADO: %.3f %n", quadrado);
    System.out.printf("RETANGULO: %.3f %n", retangulo);

    teclado.close();
  }
}
