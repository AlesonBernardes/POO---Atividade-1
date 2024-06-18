import java.util.Scanner;

public class CircuitoDeResistencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] resistencias = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.printf("Digite o valor da resistência %d: ", i + 1);
            resistencias[i] = scanner.nextDouble();
        }

        double resistenciaEquivalente = 0;
        double maiorResistencia = resistencias[0];
        double menorResistencia = resistencias[0];

        for (double r : resistencias) {
            resistenciaEquivalente += r;
            if (r > maiorResistencia) maiorResistencia = r;
            if (r < menorResistencia) menorResistencia = r;
        }

        System.out.printf("Resistência equivalente: %.2f%n", resistenciaEquivalente);
        System.out.printf("Maior resistência: %.2f%n", maiorResistencia);
        System.out.printf("Menor resistência: %.2f%n", menorResistencia);

        scanner.close();
    }
}
    