import java.util.Scanner;

public class EX33 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe sua Altura:");
    double altura = sc.nextDouble();
    System.out.println("Informe seu peso:");
    double peso = sc.nextDouble();
    sc.close();

    // IMC
    double imc = peso / Math.pow(altura, 2);

    if (imc <20){
      System.out.println("ABAIXO DO PESO");
    }
    else if (imc >= 20 && imc <25){
      System.out.println("PESO NORMAL");
    }
    else if (imc >=25 && imc <30){
      System.out.println("SOBREPESO");
    }
    else if (imc >=30 && imc <40){
      System.out.println("OBESO");
    }
    else if (imc >=40){
      System.out.println("OBESO MÓBIDO");
    }
  }
}
