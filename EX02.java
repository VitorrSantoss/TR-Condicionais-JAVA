import java.util.Scanner;

public class EX02 {
  public static void main(String[] args) {
    System.out.println("Digite um número:");
    Scanner sc = new Scanner(System.in);
    double num1 = sc.nextDouble();
    sc.close();
    if (num1 > 0) {
      System.out.printf("O número %.0f é POSITIVO", num1);
    }
    else if (num1 <0){
      System.out.printf("O número %.0f é NEGATIVO", num1);
    }
    else {
      System.out.println("O número é NULO!");
    }
  }
}
