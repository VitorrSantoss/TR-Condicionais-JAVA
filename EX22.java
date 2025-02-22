import java.util.Scanner;

public class EX22 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int num = sc.nextInt();
    sc.close();
    if (num % 2 == 0) 
      System.out.println("PAR");
    else{
      System.out.println("ÍMPAR");
    }
   
  }
}

  
