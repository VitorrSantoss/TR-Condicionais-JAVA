import java.util.Scanner;

public class EX26 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double macaPreco5KG = 1.80;
    double morangoPreco5KG = 2.50;
    double desconto = 0.10;
    double macaPreco6KG = 1.50;
    double morangoPreco6KG = 2.20;
    double maca;
    double morango;

    System.out.println("Quantos KG de MAÇÃ você quer? ");
    maca = sc.nextDouble();

    System.out.println("Quantos KG de MORANGO você quer? ");
    morango = sc.nextDouble();
    sc.close();
    
    if (maca <=5 && morango <=5 && morango + maca < 8 ){
      System.out.printf("Preço Maçã: R$ %.2f\n", maca*macaPreco5KG);
      System.out.printf("Preço Morango: R% %.2f\n", morango*morangoPreco5KG);
      System.out.printf("Total a Pagar: R$ %.2f\n", (maca*macaPreco5KG) + (morango*morangoPreco5KG));
    }
    else if (maca <=5 && morango <=5 && morango + maca > 8 ){
      System.out.printf("Preço Maçã: R$ %.2f\n", maca * macaPreco5KG);
      System.out.printf("Preço Morango: R$ %.2f\n", morango * morangoPreco5KG);
      System.out.printf("Total a Pagar: R$ %.2f\n",(maca*macaPreco5KG) + (morango*morangoPreco5KG) - ((maca*macaPreco5KG)*desconto) - ((morango*morangoPreco5KG)*desconto));
    } 
    else if (maca >5 && morango >5 || morango + maca > 8 ){
      System.out.printf("Preço Maçã: R$ %.2f\n", maca * macaPreco6KG);
      System.out.printf("Preço Morango: R$ %.2f\n", morango * morangoPreco6KG);
      System.out.printf("Total a Pagar: R$ %.2f\n",(maca*macaPreco6KG) + (morango*morangoPreco6KG) - ((maca*macaPreco6KG)*desconto) - ((morango*morangoPreco6KG)*desconto));
    }
  }
}




































































/*import java.util.Scanner;
                                                                     SECÇÃO 5 QUESTÃO 12
public class EX26 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Características de Animais:");
    System.out.println("vertebrado ou invertebrado?");
    String palavra = sc.nextLine().toLowerCase();

    if (palavra.equals("vertebrado")){
      System.out.println("ave ou mamifero");
      String palavra1 = sc.nextLine().toLowerCase();
      if (palavra1.equals("ave")){                 
        System.out.println("carnivoro ou onivoro");
        String palavra2 = sc.nextLine().toLowerCase();
        if (palavra2.equals("carnivoro")){
          System.out.println("aguia");
        }
        else if (palavra2.equals("onivoro")){
          System.out.println("pomba");
        }
      }
      if (palavra.equals("vertebrado")){
        if (palavra1.equals("mamifero")){                 
          System.out.println("onivero ou herbivoro");
          String palavra2 = sc.nextLine().toLowerCase();
          if (palavra2.equals("onivero")){
            System.out.println("homem");
          }
          else if (palavra2.equals("herbivoro")){
            System.out.println("vaca");
          }
        }
      }
    }
    if (palavra.equals("invertebrado")){
      System.out.println("inseto ou anelideo");
      String palavra1 = sc.nextLine().toLowerCase();
      if (palavra1.equals("inseto")){                 
        System.out.println("hematofago ou herbivoro");
        String palavra2 = sc.nextLine();
        if (palavra2.equals("hematofago")){
          System.out.println("pulga");
        }
        else if (palavra2.equals("herbivoro")){
          System.out.println("largata");
        }
      }
      if (palavra.equals("invertebrado")){
        if (palavra1.equals("anelideo")){                 
          System.out.println("hematofago ou onivero");
          String palavra2 = sc.nextLine().toLowerCase();
          if (palavra2.equals("hematofago")){
            System.out.println("sanguessuga");
          }
          else if (palavra2.equals("onivero")){
            System.out.println("minhoca");
          }
        }
      }
    }
    sc.close();
  }
}*/









































