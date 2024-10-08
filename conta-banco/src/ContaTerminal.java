import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, para comceçarmos, poderia nos informar sua agência ?");
        int agencia = scanner.nextInt();

        System.out.println("Digite sua conta: ");
        String numero = scanner.next();

        System.out.println("Informe seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia + " , conta " + numero + " e seu saldo " + saldo + " já esta dispinível para saque.");
    }
}
