import javax.swing.JOptionPane;

public class SistemaDeAvaliacao {
    public static void main(String[] args) {
        String nota1Str = JOptionPane.showInputDialog("Digite a nota da primeira prova:");
        double nota1 = Double.parseDouble(nota1Str);

        String nota2Str = JOptionPane.showInputDialog("Digite a nota da segunda prova:");
        double nota2 = Double.parseDouble(nota2Str);

        String notaTrabalhoStr = JOptionPane.showInputDialog("Digite a nota do trabalho:");
        double notaTrabalho = Double.parseDouble(notaTrabalhoStr);

        double media = (nota1 + nota2 + notaTrabalho) / 3;

        String status = media >= 6 ? "Aprovado" : "Reprovado";

        JOptionPane.showMessageDialog(null, String.format("Média: %.2f - %s", media, status));
    }
}
