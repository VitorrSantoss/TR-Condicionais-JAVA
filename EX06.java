import java.util.Scanner;

public class EX06 {
  public static void main(String[] args) {
    System.out.println("Digite três números diferentes:");
    Scanner sc = new Scanner(System.in);
    System.out.print("1º Número: ");
    double num1 = sc.nextDouble();
    System.out.print("2º Número: ");
    double num2 = sc.nextDouble();
    System.out.print("3º Número: ");
    double num3 = sc.nextDouble();
    sc.close();

   if (num1 > num2 && num1 > num3){
    System.out.printf("O número %.0f é o maior", num1);
   }
   else if (num2 > num1 && num2 > num3){
    System.out.printf("O número %.0f é o maior", num2);
   }
   else if (num3 > num1 && num3> num2 ){
    System.out.printf("O número %.0f é o maior", num3);
   }
   else{
    System.out.println("DADOS INVÁLIDOS");
   }

  }
}
