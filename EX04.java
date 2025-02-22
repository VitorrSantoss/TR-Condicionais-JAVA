import java.util.Scanner;

public class EX04 {
  public static void main(String[] args) {
    
    System.out.println("Digite uma letra:");
    Scanner sc = new Scanner(System.in);
    String letra = sc.nextLine().toUpperCase();
    sc.close();
  if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")){
    System.out.println("VOGAL");
  }
  else{
    System.out.println("CONSOANTE");
  }
  }
}
