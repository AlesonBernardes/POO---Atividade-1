import java.util.Scanner;

public class CalculadoraDeAposentadoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o seu sexo (M ou F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Digite os anos de contribuição: ");
        int anosContribuicao = scanner.nextInt();

        boolean podeAposentar = (sexo == 'M' && idade >= 65 && anosContribuicao >= 10) ||
                                (sexo == 'F' && idade >= 60 && anosContribuicao >= 10) ||
                                anosContribuicao >= 35;

        if (podeAposentar) {
            System.out.println("Você já pode se aposentar.");
        } else {
            int anosParaAposentar = Math.min(35 - anosContribuicao, (sexo == 'M' ? 65 - idade : 60 - idade));
            System.out.printf("Faltam %d anos para você se aposentar.%n", anosParaAposentar);
        }

        scanner.close();
    }
}
