import java.util.Scanner;

public class EX15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe os lados de um triângulo:");
    System.out.print("1º lado: ");
    int lado1 = sc.nextInt();
    System.out.print("2º lado: ");
    int lado2 = sc.nextInt();
    System.out.print("3º lado: ");
    int lado3 = sc.nextInt();
    sc.close();


    if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1){
      System.out.println("Pode ser formado triângulo!");
      if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
        System.out.println("Triângulo Equilátero!");
      }
      else if (lado1 == lado2 || lado1 == lado3 || lado3 == lado2){
        System.out.println("Triângulo Isósceles!");
      }
      else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
        System.out.println("Triângulo Escaleno!");
      }
    }
    else{
      System.out.println("Não se pode formar triângulo!");
    }
    


























  }
}
