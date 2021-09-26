package uri;
/*
 * @author Andréa Meinhart
 * @category NExT - Imersão Java
 * @Exercicios URI Judge 
 * @class Fundamentos1008
 */

/*
 * Salário
 * leia o número de um funcionário, seu número de horas trabalhadas, 
 * o valor que recebe por hora e calcula o salário desse funcionário. 
 * A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
 * ENTRADA:  2 números inteiros e 1 número com duas casas decimais.
 * SAIDA: NUMBER = 25 e SALARY = U$ 550.00 
 */

import java.util.Scanner;

public class Salario {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int numero = teclado.nextInt();
    int horas = teclado.nextInt();
    double salario = teclado.nextDouble();
    double totalSalario = horas * salario;

    System.out.printf("NUMBER = %d %n", numero);
    System.out.printf("SALARY = U$ %.2f", totalSalario);
    teclado.close();
  }
}
