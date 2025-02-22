import java.util.Scanner;

public class EX25 {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Custo de Combustível");

    System.out.println("Álcool -> [A] ou Gasolina -> [G]?");
    String decisão = sc.nextLine().toUpperCase();

    if (decisão.equals("A")){
      System.out.println("ÁLCOOL");
      System.out.print("Quantos litros você deseja? ");
      double litrosAlcool = sc.nextDouble();
      double preçoAlcool = litrosAlcool * 1.90;
      double descontoAlcool20 = preçoAlcool* 0.03;
      double descontoAlcool21 = preçoAlcool* 0.05;
      double valorPagoAlcool20 = preçoAlcool - descontoAlcool20;
      double valorPagoAlcool21 = preçoAlcool - descontoAlcool21;

      if (litrosAlcool <= 20){
        System.out.printf("Álcool:\nLitros: %.1fL\nPreço: R$ %.2f\nDesconto: R$ %.2f\nValor a ser pago: R$ %.2f",litrosAlcool, preçoAlcool, descontoAlcool20, valorPagoAlcool20);
      }
      else{
        System.out.printf("Álcool:\nLitros: %.1fL\nPreço: R$ %.2f\nDesconto: R$ %.2f\nValor a ser pago: R$ %.2f",litrosAlcool, preçoAlcool, descontoAlcool21, valorPagoAlcool21);
      }
    }
    if (decisão.equals("G")){
      System.out.println("GASOLINA");
      System.out.print("Quantos litros você deseja? ");
      double litrosGas = sc.nextDouble();
      double preçoGas = litrosGas * 2.50;
      double descontoGas20 = preçoGas* 0.04;
      double descontoGas21 = preçoGas* 0.06;
      double valorPagoGas20 = preçoGas - descontoGas20;
      double valorPagoGas21 = preçoGas - descontoGas21;

      if (litrosGas <= 20){
        System.out.printf("Álcool:\nLitros: %.1fL\nPreço: R$ %.2f\nDesconto: R$ %.2f\nValor a ser pago: R$ %.2f",litrosGas, preçoGas, descontoGas20, valorPagoGas20);
      }
      else{
        System.out.printf("Álcool:\nLitros: %.1fL\nPreço: R$ %.2f\nDesconto: R$ %.2f\nValor a ser pago: R$ %.2f",litrosGas, preçoGas, descontoGas21, valorPagoGas21);
      }
    }
    sc.close();
  }
}