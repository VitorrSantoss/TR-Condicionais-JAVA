import java.util.Scanner;

public class EX28 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um número no intervalo de 1 - 10:");
    int num = sc.nextInt();
    sc.close();

    switch (num) {
      case 1:
        System.out.println("um");
        break;
      case 2:
        System.out.println("dois");
        break;
      case 3:
        System.out.println("três");
        break;
      case 4:
        System.out.println("quatro");
        break;
      case 5:
        System.out.println("cinco");
        break;
      case 6:
        System.out.println("seis");
        break;
      case 7:
        System.out.println("sete");
        break;
      case 8:
      System.out.println("oito");
        break;
        case 9:
      System.out.println("nove");
        break;
        case 10:
        System.out.println("dez");
        break;
      default:
        System.out.println("Número inválido!");
        
    }
  }
}
