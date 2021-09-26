package uri;

/*
 * @author Andréa Meinhart
 * @category NExT - Imersão Java
 * @Exercicios URI Judge 
 * @class Fundamentos1009
 */

/*
 * Salário com Bônus
 * leia o nome de um vendedor, o seu salário fixo e o total de vendas
 * efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor
 * ganha 15% de comissão sobre suas vendas efetuadas, informar
 * o total a receber no final do mês, com duas casas decimais.
 * ENTRADA: JOAO - 500.00 - 1230.300
 * SAIDA: TOTAL = R$ 684.54
*/

import java.util.Scanner;

public class SalarioComBonus {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String nome = teclado.nextLine();
    double salarioFixo = teclado.nextDouble();
    double totalVendas = teclado.nextDouble();
    double salarioFinal = (totalVendas * 0.15) + salarioFixo;

    System.out.printf("TOTAL = R$ %.2f", salarioFinal);
    teclado.close();
  }
}
