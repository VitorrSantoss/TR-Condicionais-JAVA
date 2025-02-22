import java.util.Scanner;

public class EX23 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Insira dois números:");
    System.out.print("1º Número: ");
    double num1 = sc.nextInt();
    System.out.print("2º Número: ");
    double num2 = sc.nextInt();
    
    System.out.println("Qual operação você deseja realizar?");
    System.out.println("Digite [1] -> Soma.\nDigite [2] -> Subtração.\nDigite [3] -> Divisão.\nDigite [4] -> Multiplicação.");
    System.out.print("Opção: ");
    double opcao = sc.nextDouble();
    sc.close();

    double soma =  num1 + num2;
    double subtração = num1 - num2;
    double divisao = num1 / num2;
    double multiplicação = num1 * num2;

    if (opcao == 1 && soma % 2 == 0 && soma > 0)
      System.out.printf("Soma: %.1f + %.1f = %.1f -> O número é PAR e POSITIVO", num1, num2, soma);
    else if (opcao == 1 && soma % 2 == 0 && soma < 0){
      System.out.printf("Soma: %.1f + %.1f = %.1f -> O número é PAR e NEGATIVO", num1, num2, soma);
    }
    else if (opcao == 1 && soma % 2 != 0 && soma > 0){
      System.out.printf("Soma: %.1f + %.1f = %.1f -> O número é ÍMPAR e POSITIVO", num1, num2, soma);
    }
    else if (opcao == 1 && soma % 2 != 0 && soma < 0){
      System.out.printf("Soma: %.1f + %.1f= %.1f -> O número é ÍMPAR e NEGATIVO", num1, num2, soma);
    }
    else if (opcao == 2 && subtração % 2 == 0 && subtração > 0){
      System.out.printf("Subtração: %.1f - %.1f = %.1f -> O número é PAR e POSITIVO", num1, num2, subtração);
    }
    else if (opcao == 2 && subtração % 2 == 0 && subtração < 0){
      System.out.printf("Subtração: %.1f - %.1f = %.1f -> O número é PAR e NEGATIVO", num1, num2, subtração);
    }
    else if (opcao == 2 && subtração % 2 != 0 && subtração > 0){
      System.out.printf("Subtração: %.1f - %.1f = %.1f -> O número é ÍMPAR e POSITIVO", num1, num2, subtração);
    }
    else if (opcao == 2 && subtração % 2 != 0 && subtração < 0){
      System.out.printf("Subtração: %.1f - %.1f = %.1f -> O número é ÍMPAR e NEGATIVO", num1, num2, subtração);
    }
    else if (opcao == 3 && divisao % 2 == 0 && divisao > 0){
      System.out.printf("Divisão: %.1f / %.1f = %.1f -> O número é PAR e POSITIVO", num1, num2, divisao);
    }
    else if (opcao == 3 && divisao % 2 == 0 && divisao < 0){
      System.out.printf("Divisão: %.1f / %.1f = %.1f -> O número é PAR e NEGATIVO", num1, num2, divisao);
    }
    else if (opcao == 3 && divisao % 2 != 0 && divisao > 0){
      System.out.printf("Divisão: %.1f / %.1f = %.1f -> O número é ÍMPAR e POSITIVO", num1, num2, divisao);
    } 
    else if (opcao == 3 && divisao % 2 != 0 && divisao < 0){
      System.out.printf("Divisão: %.1f / %.1f = .1f -> O número é ÍMPAR e NEGATIVO", num1, num2, divisao);
    }
    else if (opcao == 4 && multiplicação % 2 == 0 && multiplicação > 0){
      System.out.printf("Multiplicação: %.1f x %.1f = %.1f -> O número é PAR e POSITIVO", num1, num2, multiplicação);
    }
    else if (opcao == 4 && multiplicação % 2 == 0 && multiplicação < 0){
      System.out.printf("Multiplicação: %.1f x %.1f = %.1f -> O número é PAR e NEGATIVO", num1, num2, multiplicação);
    }
    else if (opcao == 4 && multiplicação % 2 != 0 && multiplicação > 0){
      System.out.printf("Multiplicação: %.1f x %.1f = %.1f -> O número é ÍMPAR e POSITIVO", num1, num2, multiplicação);
    }
    else if (opcao == 4 && multiplicação % 2 != 0 && multiplicação < 0){
      System.out.printf("Multiplicação: %.1f x %.1f = %.1f -> O número é ÍMPAR e NEGATIVO", num1, num2, multiplicação);
    }
    
















  }
}
