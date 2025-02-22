import java.util.Scanner;

public class EX13 {
  public static void main(String[] args) {
    
    System.out.println("Digite um número para cada dia da semana:");
    Scanner sc = new Scanner(System.in);
    int dia = sc.nextInt();
    sc.close();

    if (dia == 1){
      System.out.println("DOMINGO");
    }
    else if (dia ==2){
      System.out.println("SEGUNDA FEIRA");
    }
    else if (dia ==3){
      System.out.println("TERÇA FEIRA");
    }
    else if (dia ==4){
      System.out.println("QUARTA FEIRA");
    }
    else if (dia ==5){
      System.out.println("QUINTA FEIRA");
    }
    else if (dia ==6){
      System.out.println("SEXTA FEIRA");
    }
    else if (dia ==7){
      System.out.println("SÁBADO");
    }
    else{
      System.out.print("VALOR INVÁLIDO!");
    }
  }
}
