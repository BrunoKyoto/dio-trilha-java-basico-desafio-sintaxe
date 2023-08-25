import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite o saldo disponível em conta: ");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá, " + nomeCliente + "! Obrigado por criar uma conta em nosso banco. Sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de R$" + saldoConta + " já está disponível para saque.");
    }
}
