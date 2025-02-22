import java.util.Scanner;
public class EX12 {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    System.out.print("Informe o preço da hora trabalhada: R$ ");
    double precoHora = sc.nextDouble();
    System.out.print("Quantas horas trabalhadas você possui? ");
    int horaTrabalhada = sc.nextInt();
    double salarioBruto = (precoHora * horaTrabalhada);
    System.out.printf("Salário Bruto: R$ %.2f\n", salarioBruto);
    sc.close();

    double sindicato = 3.0/100;
    double fgts = 11.0/100;
    double inss = 10.0/100;
    double ir1500 = 5.0/100;
    double ir2500 = 10.0/100;
    double ir3000 = 20.0/100;

    System.out.println("DESCONTOS");
    if (salarioBruto <= 900){
      System.out.printf("IR: -> ISENTO\nINSS: R$ %.2f\nFGTS: R$ %.2f\nSINDICATO: R$ %.2f\n", (salarioBruto*inss), (salarioBruto*fgts), (salarioBruto*sindicato));
      System.out.printf("Total de descontos: R$ %.2f\n", ((salarioBruto*inss) + (salarioBruto*sindicato)));
      System.out.printf("Salário Líquido: R$ %.2f", (salarioBruto - (salarioBruto*inss) + (salarioBruto*sindicato)));
    }
    else if (salarioBruto > 900 && salarioBruto <= 1500){
      System.out.printf("IR: R$ %.2f\nINSS: R$ %.2f\nFGTS: R$ %.2f\nSINDICATO: R$ %.2f\n",(salarioBruto*ir1500), (salarioBruto*inss), (salarioBruto*fgts), (salarioBruto*sindicato));
      System.out.printf("Total de descontos: R$ %.2f\n", (((salarioBruto*ir1500) + (salarioBruto*inss) + (salarioBruto*sindicato))));
      System.out.printf("Salário Líquido: R$ %.2f", (salarioBruto - ((salarioBruto*ir1500) + (salarioBruto*inss) + (salarioBruto*sindicato))));
    }
    else if (salarioBruto > 1500 && salarioBruto <=2500){
      System.out.printf("IR: R$ %.2f\nINSS: R$ %.2f\nFGTS: R$ %.2f\nSINDICATO: R$ %.2f",(salarioBruto*ir2500), (salarioBruto*inss), (salarioBruto*fgts), (salarioBruto*sindicato));
      System.out.printf("Total de descontos: R$ %.2f\n", (((salarioBruto*ir2500) + (salarioBruto*inss) + (salarioBruto*sindicato))));
      System.out.printf("Salário Líquido: R$ %.2f", (salarioBruto - ((salarioBruto*ir2500) + (salarioBruto*inss) + (salarioBruto*sindicato))));
    }
    else if (salarioBruto > 2500){
      System.out.printf("IR: R$ %.2f\nINSS: R$ %.2f\nFGTS: R$ %.2f\nSINDICATO: R$ %.2f",(salarioBruto*ir3000), (salarioBruto*inss), (salarioBruto*fgts), (salarioBruto*sindicato));
      System.out.printf("Total de descontos: R$ %.2f\n", (((salarioBruto*ir3000) + (salarioBruto*inss) + (salarioBruto*sindicato))));
      System.out.printf("Salário Líquido: R$ %.2f ", (salarioBruto - ((salarioBruto*ir3000) + (salarioBruto*inss) + (salarioBruto*sindicato))));
    }
  }
}
