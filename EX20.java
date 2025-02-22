import java.util.Scanner;

public class EX20 {

  public static void main(String[] args) {
    System.out.println("Digite 3 notas:");

    Scanner sc = new Scanner(System.in);
    System.out.print("1º Nota: ");
    double nota1 = sc.nextDouble();
    System.out.print("2º Nota: ");
    double nota2 = sc.nextDouble();
    System.out.print("3º Nota: ");
    double nota3 = sc.nextDouble();
    sc.close();
    double media = (nota1 + nota2 + nota3)/3;

    if (media >= 7 && media < 10)
      System.out.printf("Média: %.1f -> APROVADO", media);
    else if (media < 7)
      System.out.printf("Média: %.1f -> REPROVADO", media);
    else if (media == 10)
      System.out.printf("Média: %.1f -> APROVADO COM ÊXITO", media);
  
  }
}
  
