public class SobreMim {
    public static void main(String[] args) {
        
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Meu nome é " + nome + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Tenho " + altura + " mts de Altura");
        
    }
}
/*na pasta/diretorio bin é onde fica os arquivos para execução */
/* pra rodar java --enable-preview NOME DA BIN.class*/