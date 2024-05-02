import java.util.Scanner;

public class Teste{


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.print("Insira o número da conta: ");
            int numero = scanner.nextInt();

        scanner.nextLine(); //limpeza do buffer

        System.out.print("Insira a agência: ");
            String agencia = scanner.nextLine();

        System.out.print("Insira seu nome: ");
            String nomeCliente = scanner.nextLine();


        System.out.print("Insira o saldo: ");
            float saldo=scanner.nextFloat();
        scanner.close();


        System.out.printf("\"Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque\".");


    }
}