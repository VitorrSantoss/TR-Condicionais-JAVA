import java.util.Scanner;

public class EX08 {
  public static void main(String[] args) {
    System.out.println("Digite o preço de três produtos, você deverá levar o mais barato:");
    Scanner sc = new Scanner(System.in);
    System.out.print("Camisa: ");
    double num1 = sc.nextDouble();
    System.out.print("Calça: ");
    double num2 = sc.nextDouble();
    System.out.print("Sapato: ");
    double num3 = sc.nextDouble();
    sc.close();

    if (num1 < num2 && num1 < num3){
      System.out.printf("A camisa %.0f é a mais BARATA\n", num1);
    }
    else if (num2 < num1 && num2 < num3){
      System.out.printf("A calça %.0f é a mais BARATA\n", num2);
    }
    else if (num3 < num2 && num3 < num1){
      System.out.printf("O sapato %.0f é o MAIS BARATO\n", num3);
    }











  }
}
