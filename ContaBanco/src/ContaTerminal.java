import java.util.Scanner;

public class ContaTerminal{


    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);


      System.out.printf("Insira seu nome: ");
        String NomeCliente = scanner.nextLine();

      System.out.printf("Insira a agência: ");
        String Agencia = scanner.nextLine();

      System.out.printf("Insira o número da conta: ");
        int Numero = scanner.nextInt();

      System.out.printf("Insira o saldo: ");
        float Saldo=scanner.nextFloat();

      scanner.close();


      System.out.printf("\"Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque\".");


    }
}