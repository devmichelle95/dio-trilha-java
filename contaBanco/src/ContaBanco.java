import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta: ");
        int conta = scanner.nextInt() ;

        System.out.println("Por favor, digite a agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome: ");
        String nome = scanner.next();
        
        System.out.println("Por favor, digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o valor: ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +  ", conta " + conta + " atualmente seu saldo é no valor de R$ " + saldo);
    }
}
