import java.util.Scanner;

public class VerificadorNumeroConta{

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        try {
            String conta=scanner.nextLine();
            verificarNumeroConta(conta);
            System.out.println("Numero de conta valido.");

        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());

        }finally {
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta){

        if (numeroConta.length() != 8) {
            throw new IllegalStateException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}