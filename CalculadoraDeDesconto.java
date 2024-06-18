import java.util.Scanner;

public class CalculadoraDeDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Digite a porcentagem de desconto: ");
        double porcentagemDesconto = scanner.nextDouble();

        double valorDesconto = valorProduto * (porcentagemDesconto / 100);
        double precoFinal = valorProduto - valorDesconto;

        System.out.printf("Valor do desconto: %.2f%n", valorDesconto);
        System.out.printf("Preço final do produto: %.2f%n", precoFinal);

        scanner.close();
    }
}
