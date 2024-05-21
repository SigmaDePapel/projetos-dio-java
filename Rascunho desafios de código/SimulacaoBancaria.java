import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean b = true;
        while (b) {
            int opcao = scanner.nextInt();
            switch (opcao ) {
                case 1:
                    saldo = saldo + scanner.nextFloat();
                    System.out.println("Saldo atual: "+saldo);
                    break;
                case 2:
                    double sacar =  scanner.nextFloat();
                    if(saldo < sacar) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo = saldo - sacar;
                        System.out.println("Saldo atual: "+saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: "+saldo);
                    break;
                case 4:
                    b = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
        System.out.println("Programa encerrado.");
    }
}