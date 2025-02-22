import java.util.Scanner;

public class EX30 {
  public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número");
    int num = sc.nextInt();
    sc.close();

    if (num % 3 == 0 && num % 7 ==0){
      System.out.println("É múltiplo de 3 e 7");
    }
    else{
      System.out.println("Não é múltiplo de 3 e 7");
    }


  }
}
