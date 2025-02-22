import java.util.Scanner;

public class EX16 {
  public static void main(String[] args) {
    
    System.out.println("Equação do Segundo Grau:\nax² + bx + c");

    Scanner sc = new Scanner(System.in);
    System.out.println("ATRIBUIÇÃO DE VALORES");
    System.out.print("a: ");
    int a = sc.nextInt();
    System.out.print("b: ");
    int b = sc.nextInt();
    System.out.print("c: ");
    int c = sc.nextInt();
    sc.close();

    // DELTA -> delta = b² - 4 * a * c
    int delta = (int) Math.pow(b, 2) - (4 * a * c);
    System.out.printf("Delta: %d\n", delta);

    // BASKHARA -> -b +- raiz delta / 2*a
    double baskhara1 =  ((-b + Math.sqrt(delta)) /2.0*a);
    double baskhara2 =  ((-b - Math.sqrt(delta)) /2.0*a);
    
    if (a == 0){
      System.out.println("A equação não é do segundo grau!");
    }
    if (delta < 0){
      System.out.println("A equação não possui raízes reais!");
    }
    else if (delta == 0){
      System.out.println("A equação possui apenas uma raiz real.");
      System.out.printf("Raiz: %.1f", baskhara1);
    }
    else if (delta > 0){
      System.out.println("A equação possui duas raízes reais");
      System.out.printf("Raizes: %.1f e %.1f", baskhara1, baskhara2);
    }
  }
}
