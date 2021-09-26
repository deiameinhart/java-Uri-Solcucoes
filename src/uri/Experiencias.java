package uri;

/*
 * @author Andréa Meinhart
 * @category NExT - Imersão Java
 * @Exercicios URI Judge 
 * @class Fundamentos1094
 */

/*
 * Experiências
 * Este laboratório em especial utiliza três tipos de cobaias: 
 * sapos, ratos e coelhos. Para obter estas informações, ela sabe 
 * exatamente o número de experimentos que foram realizados, 
 * o tipo de cobaia utilizada e a quantidade de cobaias utilizadas 
 * em cada experimento.
 * 
 * ENTRADA: A primeira linha de entrada contém um valor inteiro N 
 * que indica os vários casos de teste que vem a seguir. 
 * Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) 
 * que representa a quantidade de cobaias utilizadas e um caractere 
 * Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia 
 * (R:Rato S:Sapo C:Coelho).
 * 
 * SAIDA: Total: 92 cobaias / Total de coelhos: 29 / Total de ratos: 40
 * Total de sapos: 23 / Percentual de coelhos: 31.52 % / Percentual
 * de ratos: 43.48 % / Percentual de sapos: 25.00 %
 */

import java.util.Scanner;

public class Experiencias {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int n = teclado.nextInt(); // qtd de testes

    int qtdCoelho = 0;
    int qtdRato = 0;
    int qtdSapo = 0;
    int qtdTotal = 0;

    for (int i = 0; i < n; i++) { // qtd de testes

      int quantia = teclado.nextInt(); // qtd de cobaias entre min 1 e max 15
      String tipo = teclado.nextLine(); // 'C', 'R' ou 'S'

      switch (tipo) {
        case "c":
          qtdCoelho += quantia;
          qtdTotal += quantia;
          break;

        case "r":
          qtdRato += quantia;
          qtdTotal += quantia;
          break;

        case "s":
          qtdSapo += quantia;
          qtdTotal += quantia;
          break;

        default:
          break;
      }

    }
  
    double percCoelho = ((double)qtdCoelho/(double)qtdTotal)*100.00;
    double percRato = ((double)qtdRato/(double)qtdTotal)*100.00;
    double percSapo = ((double)qtdSapo/(double)qtdTotal)*100.00;

    System.out.println("Total: " + qtdTotal + " cobaias");
    System.out.println("Total de coelhos: " + qtdCoelho);
    System.out.println("Total de ratos: " + qtdRato);
    System.out.println("Total de sapos: " + qtdSapo);
    System.out.printf("Percentual de coelhos: %.2f %%%n", percCoelho);
    System.out.printf("Percentual de ratos: %.2f %%%n", percRato);
    System.out.printf("Percentual de sapos: %.2f %%%n", percSapo);

    teclado.close();
  }
}
