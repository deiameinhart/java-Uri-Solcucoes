package uri;
/*
 * @author Andréa Meinhart
 * @category NExT - Imersão Java
 * @Exercicios URI Judge 
 * @class Fundamentos1011
 */

/*
 * Esfera
 * calcule e mostre o volume de uma esfera sendo fornecido o 
 * valor de seu raio (R). A fórmula para calcular o 
 * volume é: (4/3) * pi * R3. 
 * Considere (atribua) para pi o valor 3.14159. 
 * ENTRADA: valor de ponto flutuante (dupla precisão), 
 * correspondente ao raio da esfera.
 * SAIDA: VOLUME = 113.097 
 */

import java.util.Scanner;

public class Fundamento1011 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double raioEsfera = teclado.nextDouble();
    double pi = 3.14159;
    double volume = (4 / 3.0) * (pi * raioEsfera * raioEsfera * raioEsfera);
    System.out.printf("VOLUME = %.3f", volume);
    teclado.close();
  }
}
