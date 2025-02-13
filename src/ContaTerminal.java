import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do usuario ");
        int usuario = sc.nextInt();

        System.out.println("Digite o número da agencia ");
        String agencia = sc.next();
        sc.nextLine();

        System.out.println("Digite o nome do cliente ");
        String nomeCliente = sc.next();

        System.out.println("Digite o saldo ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " +nomeCliente + ", Obrigado por criar uma conta em nosso banco, sua agência é " +agencia + " conta " +usuario + " e seu saldo de " +saldo +  " já está disponível para saque");
        sc.close();
    }
}
