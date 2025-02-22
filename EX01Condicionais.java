import java.util.Scanner;

public class EX01Condicionais {
  public static void main(String[] args) {
    System.out.println("Digite dois números:");
    Scanner sc = new Scanner(System.in);
    double num1 = sc.nextDouble();
    double num2 = sc.nextDouble();
    sc.close();

    if (num1 > num2) {
      System.out.printf("O número %.0f é o maior", num1);
    }
    else if (num2 > num1) {
      System.out.printf("O número %.0f é o maior", num2);
    }
    else {
      System.out.println("Os números são iguais");
    }
  }
}
