package uri;

/*
 * @author Andréa Meinhart
 * @category NExT - Imersão Java
 * @Exercicios URI Judge 
 * @class Fundamentos1049
 */

/*
 * Animal
 * Ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, 
 * da esquerda para a direita.  Em seguida conclua qual dos animais seguintes foi
 * escolhido, através das três palavras fornecidas. 
 * ENTRADA: vertebrado / mamifero / onivoro - SAIDA homem
 * ENTRADA: vertebrado / ave / carnivoro - SAIDA aguia
 * ENTRADA: invertebrado / anelideo / onivoro - SAIDA  minhoca
*/

import java.util.Scanner;

public class Animal {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String nome1 = teclado.nextLine();
    String nome2 = teclado.nextLine();
    String nome3 = teclado.nextLine();

    if (nome1.equals("vertebrado")) {
      if (nome2.equals("ave") && nome3.equals("carnivoro")) {
        System.out.println("aguia");
      } else {
        System.out.println("pomba");
      }

      if (nome2.equals("mamifero") && nome3.equals("onivoro")) {
        System.out.println("homem");
      } else {
        System.out.println("vaca");
      }
    } else {
      if (nome2.equals("inseto") && nome3.equals("hematofogo")) {
        System.out.println("pulga");
      } else {
        System.out.println("lagarta");
      }

      if (nome2.equals("anelideo") && nome3.equals("hematofogo")) {
        System.out.println("sanguessuga");
      } else {
        System.out.println("minhoca");
      }
    }
    teclado.close();
  }
}
