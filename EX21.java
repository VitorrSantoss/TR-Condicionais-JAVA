import java.util.Scanner;

public class EX21 {

  public static void main(String[] args) {
    System.out.println("Informe o valor a ser sacado!");
    Scanner sc = new Scanner(System.in);
    int money = sc.nextInt();
    sc.close();

    if (money < 10)
      System.out.println("Valor inválido -> Saque Mínimo: R$ 10,00");
    else if (money > 600)
      System.out.println("Valor inválido -> Saque Mínimo: R$ 600,00");

    





  }
}
