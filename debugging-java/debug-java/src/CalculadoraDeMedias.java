import java.util.Scanner;

public class CalculadoraDeMedias {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String[] alunos = {"Jonas", "Maurilio", "Kevin", "Lincon"};

    double media = calculaMediaDaTurma(alunos, scan);

    System.out.printf("Média da turma %.2f", media);
  }

  public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {

    double soma = 0;
    for(String aluno : alunos) {
      System.out.printf("nota do aluno %s: ", aluno);
      double nota = scanner.nextDouble();
      soma += nota;
    }
    return soma / alunos.length;
  }
}
