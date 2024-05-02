import java.util.Scanner;

public class ContaTerminal{


    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);


      System.out.printf("Insira seu nome: ");
        String nomeCliente = scanner.nextLine();

      System.out.printf("Insira a agência: ");
        String agencia = scanner.nextLine();

      System.out.printf("Insira o número da conta: ");
        int numero = scanner.nextInt();

      System.out.printf("Insira o saldo: ");
        float saldo = scanner.nextFloat();

      scanner.close();


      System.out.printf("\"Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque\".");
    }
}