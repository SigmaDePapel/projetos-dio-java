import java.util.Scanner;

public class ControleSimplesDeSaques{

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        double limiteDiario=scanner.nextDouble();

        for (double saque=0; saque <= limiteDiario; ) {
            saque=scanner.nextDouble();
            if (saque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            } else if (saque > 0 && saque <= limiteDiario) {limiteDiario-=saque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            } else if (saque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
            }
        }

        scanner.close();

    }
}