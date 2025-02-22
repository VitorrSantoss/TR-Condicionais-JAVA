import java.util.Scanner;

public class EX14 {
  public static void main(String[] args) {
    
    System.out.println("Digite duas notas:");
    Scanner sc = new Scanner(System.in);
    System.out.print("1º Nota: ");
    double nota1 = sc.nextInt();
    System.out.print("2º Nota: ");
    double nota2 = sc.nextInt();
    double media = (nota1 + nota2)/2;
    sc.close();

    if (media >= 0 && media < 4){
      System.out.printf("Média %.1f: CONCEITO E\nREPROVADO!", media);
    }
    else if (media >=4 && media < 6){
      System.out.printf("Média %.1f: CONCEITO D\nREPROVADO!", media);
    }
    else if (media >=6 && media < 7.5){
      System.out.printf("Média %.1f: CONCEITO C\nAPROVADO!", media);
    }
    else if (media >=7.5 && media < 9){
      System.out.printf("Média %.1f: CONCEITO B\nAPROVADO!", media);
    }
    else if (media >=9 && media < 10){
      System.out.printf("Média %.1f: CONCEITO A\nAPROVADO!", media);
    }
  }
}
