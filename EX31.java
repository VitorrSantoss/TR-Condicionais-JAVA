import java.util.Scanner;

public class EX31 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite sua idade:");
    int idade = sc.nextInt();
    sc.close();

    if (idade > 21 && idade <65){
      System.out.println("MAIOR IDADE");
    }
    else if (idade < 21){
      System.out.println("MENOR IDADE");
    }
    else if (idade >= 65){
      System.out.println("PESSOA IDOSA");
    }
  }
}
