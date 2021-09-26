package uri;

/*
 * @author Andréa Meinhart
 * @category NExT - Imersão Java
 * @Exercicios URI Judge 
 * @class Fundamentos1051
 */

/*
 * Imposto de Renda
 * Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb.
 * Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda,
 * segundo a tabela abaixo.
 * Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, 
 * pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de
 * Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% 
 * sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso
 * com duas casas decimais.
 * ENTRADA: A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.
 * SAIDA: Imprima o texto "R$" seguido de um espaço e do valor total devido de Imposto de Renda, 
 * com duas casas após o ponto. Se o valor de entrada for menor ou igual a 2000, deverá ser impressa a mensagem "Isento". R$ 80.36 - Isento
 */

import java.util.Scanner;

public class ImpostoRenda {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double salario = teclado.nextDouble();

    if (salario > 2000 && salario <= 3000) {
      System.out.println(String.format("R$ %.2f", (salario - 2000) * 0.08));
    } else if (salario > 3000 && salario <= 4500) {
      System.out.println(String.format("R$ %.2f", ((salario - 3000)  * 0.18) + 80));
    } else if (salario > 4500){
      System.out.println(String.format("R$ %.2f", ((salario - 4500) * 0.28) + 350));
    } else {
      System.out.println("Isento");
    }

    teclado.close();
  }
}
