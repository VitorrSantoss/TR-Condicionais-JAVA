import java.util.Scanner;
public class EX11 {
  public static void main(String[] args) {
    
    // PEGAR SALÁRIO DO USUÁRIO!
    Scanner sc = new Scanner(System.in);
    System.out.print("Informe seu salário: R$ ");
    double salario = sc.nextDouble();
    sc.close();

    // CÁLCULO DOS REAJUSTES!
    double salario280 = 20.0/100;
    double salario700 = 15.0/100;
    double salario1500 = 10.0/100;
    double salario2000 = 5.0/100;

    //  O SALÁRIO ANTES DO REAJUSTE!
    System.out.printf("Salário antes do reajuste: R$ %.2f\n", salario);

    //  O PERCENTUAL DE AUMENTO APLICADO, VALOR DO AUMENTO E O NOVO SALÁRIO APÓS O AUMENTO!
    if (salario <= 280){
      System.out.printf("Aumento a ser aplicado: 20%% -> R$ %.2f\nSalário pós aumento: R$ %.2f",salario * salario280, (salario * salario280) + salario);
    }
    else if (salario > 280 && salario <= 700){
      System.out.printf("Aumento a ser aplicado: 15%% -> R$ %.2f\nSalário pós aumento: R$ %.2f",salario * salario700, (salario * salario700) + salario);
    }
    else if (salario > 700 && salario <= 1500){
      System.out.printf("Aumento a ser aplicado: 10%% -> R$ %.2f\nSalário pós aumento: R$ %.2f",salario * salario1500, (salario * salario1500) + salario);
    }
    else if (salario > 1500){
      System.out.printf("Aumento a ser aplicado: 5%% ->  R$ %.2f\nSalário pós aumento: R$ %.2f",salario * salario2000, (salario * salario2000) + salario);
    }
  }
}
