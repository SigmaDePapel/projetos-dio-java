import java.util.Scanner;

public class ContaTerminal{


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o número da conta: ");
        int Numero = scanner.nextInt();

        System.out.print("Insira a agência: ");
        String Agencia = scanner.next();

        scanner=new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String NomeCliente = scanner.nextLine();



        System.out.print("Qual o saldo: ");
        float Saldo=scanner.nextFloat();

        System.out.printf("\"Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque\".");


    }
}