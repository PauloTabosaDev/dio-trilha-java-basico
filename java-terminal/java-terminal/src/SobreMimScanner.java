import java.util.Locale;
import java.util.Scanner;

public class SobreMimScanner {
  public static void main(String[] args) {
    //Criando o Objeto scanner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Qual o seu nome ? ");
    String nome = scanner.next();

    System.out.println("Qual o seu sobrenome ? ");
    String sobrenome = scanner.next();

    System.out.println("Qual sua altura em Metros ? ");
    double altura = scanner.nextDouble();

    System.out.println("Qual sua idade ? ");
    int idade = scanner.nextInt();

    //Imprime dados inseridos
    System.out.println("Meu nome é " + nome + " " + sobrenome);
    System.out.println("Tenho " + idade + " anos");
    System.out.println("E " + altura + " mts de altura");

  }
  
}
