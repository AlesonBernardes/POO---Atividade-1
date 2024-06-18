import java.util.Scanner;

public class SistemaDeLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String loginCorreto = "alesom";
        String senhaCorreta = "alesom";

        int tentativas = 0;
        boolean acessoPermitido = false;

        while (tentativas < 3 && !acessoPermitido) {
            System.out.print("Digite o login: ");
            String login = scanner.nextLine();

            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            if (login.equals(loginCorreto) && senha.equals(senhaCorreta)) {
                acessoPermitido = true;
                System.out.println("Acesso permitido.");
            } else {
                tentativas++;
                System.out.println("Login ou senha incorretos. Tentativas restantes: " + (3 - tentativas));
            }
        }

        if (!acessoPermitido) {
            System.out.println("Número de tentativas excedido. Acesso bloqueado.");
        }

        scanner.close();
    }
}
