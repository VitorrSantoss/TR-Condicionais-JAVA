import java.util.Scanner;

public class EX27  {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Escolha uma opção de carne!");
    System.out.println("1º Opção: Filé Duplo");
    System.out.println("2º Opção: Picanha");
    System.out.println("3º Opção: Acatra");
    double opcao = sc.nextInt();
    System.out.println("Quantos KG ?");
    double peso = sc.nextDouble();
    sc.nextLine();
    System.out.println("Pagamento: Cartão Tabajara?");
    String cartao = sc.nextLine();
    sc.close(); 
    // 5KG
    double PrecofileDuplo = 4.90;
    double Precoalcatra = 5.90;
    double Precopicanha = 6.90;
    // 6KG
    double PrecofileDuplo6kg = 5.80;
    double Precoalacatra6kg = 6.80;
    double Precopicanha6kg = 7.80;
    // Cartão tabajara:
    double desconto = 0.05;
    if (opcao ==1 && peso <=5){
      if (cartao.equals("sim")){
        System.out.println("-=-=-=-=-= CUPOM FISCAL -=-=-=-=-=");
        System.out.printf("Filé Duplo: R$ %.2f\n", peso * PrecofileDuplo );
        System.out.printf("Desconto: (Cartão Tabajara: 5%%:) R$ %.2f\n", (peso *PrecofileDuplo)*desconto);
        System.out.printf("Total a Pagar: R$ %.2f\n", (peso * PrecofileDuplo) - (peso *PrecofileDuplo)*desconto);
      }
      else{
        System.out.println("-=-=-=-=-= CUPOM FISCAL -=-=-=-=-=");
        System.out.printf("Filé Duplo: R$ %.2f\n", peso * PrecofileDuplo );
        System.out.printf("Total a Pagar: R$ %.2f\n", peso * PrecofileDuplo);
      }
    }
    else if (opcao ==1 && peso >5){
      if (cartao.equals("sim")){
        System.out.println("-=-=-=-=-= CUPOM FISCAL -=-=-=-=-=");
        System.out.printf("Filé Duplo: R$ %.2f\n", peso * PrecofileDuplo6kg );
        System.out.printf("Desconto: (Cartão Tabajara: 5%%:) R$ %.2f\n", (peso *PrecofileDuplo6kg)*desconto);
        System.out.printf("Total a Pagar: R$ %.2f\n", (peso * PrecofileDuplo6kg) - (peso *PrecofileDuplo6kg)*desconto);
      }
      else {
        System.out.println("-=-=-=-=-= CUPOM FISCAL -=-=-=-=-=");
        System.out.printf("Filé Duplo: R$ %.2f\n", peso * PrecofileDuplo6kg);
        System.out.printf("Total a Pagar: R$ %.2f\n", peso * PrecofileDuplo6kg);
      }
    }
    else if (opcao ==2 && peso <=5){
      if (cartao.equals("sim")){
        System.out.println("-=-=-=-=-= CUPOM FISCAL -=-=-=-=-=");
        System.out.printf("Picanha: R$ %.2f\n", peso * Precopicanha );
        System.out.printf("Desconto: (Cartão Tabajara: 5%%:) R$ %.2f\n", (peso *Precopicanha)*desconto);
        System.out.printf("Total a Pagar: R$ %.2f\n", (peso * Precopicanha) - (peso *Precopicanha)*desconto);
      }
      else{
        System.out.println("-=-=-=-=-= CUPOM FISCAL -=-=-=-=-=");
        System.out.printf("Filé Duplo: R$ %.2f\n", peso * Precopicanha );
        System.out.printf("Total a Pagar: R$ %.2f\n", peso * Precopicanha);
      }
    }
    else if (opcao ==2 && peso >5){
      if (cartao.equals("sim")){
        System.out.println("-=-=-=-=-= CUPOM FISCAL -=-=-=-=-=");
        System.out.printf("Picanha: R$ %.2f\n", peso * Precopicanha6kg );
        System.out.printf("Desconto: (Cartão Tabajara: 5%%:) R$ %.2f\n", (peso *Precopicanha6kg)*desconto);
        System.out.printf("Total a Pagar: R$ %.2f\n", (peso * Precopicanha6kg) - (peso *Precopicanha6kg)*desconto);
      }
      else {
        System.out.println("-=-=-=-=-= CUPOM FISCAL -=-=-=-=-=");
        System.out.printf("Picanha: R$ %.2f\n", peso * Precopicanha6kg);
        System.out.printf("Total a Pagar: R$ %.2f\n", peso * Precopicanha6kg);
      }
    }
    else if (opcao ==3 && peso <=5){
      if (cartao.equals("sim")){
        System.out.println("-=-=-=-=-= CUPOM FISCAL -=-=-=-=-=");
        System.out.printf("Alcatra: R$ %.2f\n", peso * Precoalcatra );
        System.out.printf("Desconto: (Cartão Tabajara: 5%%:) R$ %.2f\n", (peso *Precoalcatra)*desconto);
        System.out.printf("Total a Pagar: R$ %.2f\n", (peso * Precoalcatra) - (peso *Precoalcatra)*desconto);
      }
      else{
        System.out.println("-=-=-=-=-= CUPOM FISCAL -=-=-=-=-=");
        System.out.printf("Alcatra: R$ %.2f\n", peso * Precoalcatra );
        System.out.printf("Total a Pagar: R$ %.2f\n", peso * Precoalcatra);
      }
    }
    else if (opcao ==3 && peso >5){
      if (cartao.equals("sim")){
        System.out.println("-=-=-=-=-= CUPOM FISCAL -=-=-=-=-=");
        System.out.printf("Alcatra: R$ %.2f\n", peso * Precoalacatra6kg );
        System.out.printf("Desconto: (Cartão Tabajara: 5%%:) R$ %.2f\n", (peso *Precoalacatra6kg)*desconto);
        System.out.printf("Total a Pagar: R$ %.2f\n", (peso * Precoalacatra6kg) - (peso *Precoalacatra6kg)*desconto);
      }
      else {
        System.out.println("-=-=-=-=-= CUPOM FISCAL -=-=-=-=-=");
        System.out.printf("Alcatra: R$ %.2f\n", peso * Precoalacatra6kg);
        System.out.printf("Total a Pagar: R$ %.2f\n", peso * Precoalacatra6kg);
      }
    }


    
  }
}       