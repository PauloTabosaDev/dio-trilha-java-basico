import java.util.Locale;
import java.util.Scanner;
//TO DO: Conhecer e importar a classe Scanner
public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner inputUsuario = new Scanner(System.in).useLocale(Locale.US);
        /* Exibir as mensagens para o nosso usuário
           Obter pela scanner os valores digitados no terminal
        */
        System.out.println("Para criar sua conta bancaria informe os dados conforme solicido: ");
        System.out.println("Qual é o seu nome completo ? (digite em letra maiuscula): ");
        String nomeCliente = inputUsuario.nextLine();
        
        System.out.println("Digite o número Agência com 4 digitos no seguinte formato: 000-0");
        String agencia = inputUsuario.next();

        System.out.println("Digite o número da conta que contém 4 digitos: ");
        int numero = inputUsuario.nextInt();

        System.out.println("Por fim digite o valor em R$ - reais disponibilizado para saldo: ");
        double saldo = inputUsuario.nextDouble();
        
        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
