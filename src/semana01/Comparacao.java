/*
 * @author Andréa Meinhart
 * @category NExT - Imersão Java
 * @aula 01 de 30/08/2021 
 * @class Comparacao
 */

/*
 * três variáveis locais: x, y e z e em seguida imprime os números em ordem
 * crescente.
 */

package semana01;

public class Comparacao {

  public static void main(String[] args) {
    int x = 2;
    int y = 3;
    int z = 1;

    if (x < y && y < z) {
      System.out.println(x + " , " + y + " , " + z);
    } else if (y < x && x < z) {
      System.out.println(y + " , " + x + " , " + z);
    } else if (y < z && z < x) {
      System.out.println(y + " , " + z + " , " + x);
    } else if (z < x && x < y) {
      System.out.println(z + " , " + x + " , " + y);
    } else {
      System.out.println(z + " , " + y + " , " + x);
    }
  }
}
