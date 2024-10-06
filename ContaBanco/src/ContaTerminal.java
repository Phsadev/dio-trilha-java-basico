import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite o numero da sua conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nDigite o numero da agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.println("\nDigite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        double saldo = 1500.00;

        System.out.println("\nOlá " + nomeCliente + " , obrigado por criar uma conta em nosso banco. Sua agência é a " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.\n");

    }
}
