import java.util.Scanner;

public class EX24 {

  public static void main(String[] args) {
    int contaSim = 0;

    Scanner sc = new Scanner(System.in);
    System.out.println("Perguntas sobre um crime:");
    
    System.out.println("Telefonou para a vítima?");
    String p1 = sc.nextLine().toLowerCase();
    System.out.println("Esteve no local do crime?");
    String p2 = sc.nextLine().toLowerCase();
    System.out.println("Mora perto da vítima?");
    String p3 = sc.nextLine().toLowerCase();
    System.out.println("Devia para a vítima?");
    String p4 = sc.nextLine().toLowerCase();
    System.out.println("Já trabalhou com a vítima?");
    String p5 = sc.nextLine().toLowerCase();
    sc.close();
    
    if (p1.equals("sim")){ 
      contaSim ++;
    }
    if (p2.equals("sim")){
      contaSim ++;
    }
    if (p3.equals("sim")) {
      contaSim ++;
    }

    if (p4.equals("sim")) {
      contaSim ++;
    }
    
    if (p5.equals("sim")) {
      contaSim ++;
    }
    
    if (contaSim == 5){
      System.out.println("Classificação: ASSASSINO");
    }
    else if (contaSim ==3 || contaSim == 4){
     System.out.println("Classificação: CÚMPLICE");
    }
    else if (contaSim ==2){
      System.out.println("Classificação: SUSPEITA");
    }
    else {
      System.out.println("Classificação: INOCENTE");
    }
  }
}