import javax.swing.JOptionPane;

public class CalculadoraDeITBI {
    public static void main(String[] args) {
        String valorTransacaoStr = JOptionPane.showInputDialog("Digite o valor da transação do imóvel:");
        double valorTransacao = Double.parseDouble(valorTransacaoStr);

        String valorVenalStr = JOptionPane.showInputDialog("Digite o valor venal do imóvel:");
        double valorVenal = Double.parseDouble(valorVenalStr);

        String porcentagemImpostoStr = JOptionPane.showInputDialog("Digite a porcentagem do imposto ITBI:");
        double porcentagemImposto = Double.parseDouble(porcentagemImpostoStr);

        double valorBase = Math.max(valorTransacao, valorVenal);
        double imposto = valorBase * (porcentagemImposto / 100);

        JOptionPane.showMessageDialog(null, String.format("O valor do ITBI a ser pago é: R$ %.2f", imposto));
    }
}
