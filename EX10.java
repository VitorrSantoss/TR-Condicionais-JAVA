import java.util.Scanner;

public class EX10 {
  public static void main(String[] args) {
    System.out.println("Informe o período que você estuda\n[M] -> Matutino\n[V] -> Vespertino\n[N] -> Noturno");

    Scanner sc = new Scanner(System.in);
    String turno = sc.nextLine().toUpperCase();
    sc.close();

    if (turno.equals("M")){
      System.out.println("BOM DIA!");
    }
    else if (turno.equals("V")){
      System.out.println("BOA TARDE!");
    }
    else if (turno.equals("N")){
      System.out.println("BOA NOITE!");
    }
    else {
      System.out.println("VALOR INVÁLIDO!");
    }
  }
}
