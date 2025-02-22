import java.util.Scanner;

public class EX03 {
  public static void main(String[] args) {
    
    System.out.print("Digite (F) - Feminino ou (M) - Masculino: ");
    Scanner sc = new Scanner(System.in);
    String sexo = sc.nextLine().toUpperCase();
    sc.close();
    if (sexo.equals("F")){
      System.out.println("Sexo: FEMININO");
    }
    else if (sexo.equals("M")){
      System.out.println("Sexo: MASCULINO");
    }
    else {
    System.out.println("Sexo Inválido");
    }


  }
}
