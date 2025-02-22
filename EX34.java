import java.util.Scanner;

public class EX34 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe sua idade:");
    double idade = sc.nextInt();
    sc.close();

    if (idade <16){
      System.out.println("NÃO ELEITOR");
    }
    else if ( idade > 18 && idade < 65){
      System.out.println("ELEITOR OBRIGATÓRIO");
    }
    else if (idade >16 && idade <18 && idade >65){
      System.out.println("ELEITOR FACULTATIVO");
    }
  }
}
