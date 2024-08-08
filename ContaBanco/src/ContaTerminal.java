import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Importar a classe scanner com configuração regional
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        // Exibir as mensagens para o nosso usuário
        // Obter pela scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da Agência !");
        Integer numero = scanner.nextInt();

        System.out.println("Por favor, digite qual é sua Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome:");
        String nome = scanner.next();

        System.out.println("Por favor, digite um saldo para saque:");
        Float saldo = scanner.nextFloat();

        // Exibir a mensagem da conta criada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}
