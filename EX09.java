import java.util.Scanner;

public class EX09 {
 public static void main(String[] args) {
  System.out.println("Digite três números:");
  Scanner sc = new Scanner(System.in);
  System.out.print("1º Número: ");
  int num1 = sc.nextInt();
  System.out.print("2º Número: ");
  int num2 = sc.nextInt();
  System.out.print("3º Número: ");
  int num3 = sc.nextInt();
  sc.close();

  
  if (num1 > num2 && num1 > num3){
    if (num2 > num3){
      System.out.println(num1 + " " + num2 + " " + num3);
    }
    else{
      System.out.println(num1 + " " + num3 + " " + num2);
    }
  }
  else if(num2 > num1 && num2 > num3){
    if (num1 > num3){
      System.out.println(num2 + " " + num1 + " " + num3);
    }
    else{
      System.out.println(num2 + " " + num3 + " " + num1);
    }
  }
  else if (num3 > num1 && num3 > num2){
    if (num1 > num2){
      System.out.println(num3 + " " + num1 + " " + num2);
    }
    else{
      System.out.println(num3 + " " + num2 + " " + num1);
    }
  }
 





































 } 
}
