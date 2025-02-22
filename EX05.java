import java.util.Scanner;

public class EX05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite duas notas:\n1º Nota: ");
    double nota1 = sc.nextDouble();
    System.out.print("2º Nota: ");
    double nota2 = sc.nextDouble();
    sc.close();
    double media = (nota1 + nota2) /2;
    if (media >= 7 && media < 10){
      System.out.printf("Média: %.1f -> APROVADO", media);
    }
    else if (media < 7){
      System.out.printf("Média: %.1f -> REPROVADO", media);
    }
    else {
      System.out.printf("Média: %.1f -> APROVADO COM ÊXITO", media);
    }
  }
}
