import java.util.Scanner;
import java.util.ArrayList;

public class Register {

    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<>();  // Lista para armazenar os usuários

        System.out.println("Bem-vindo ao sistema de cadastro de usuários em JAVA...");

        while (true) {
            System.out.print("\nDigite seu nome: ");
            String nome = scannerInput.nextLine();

            System.out.print("Digite seu email: ");
            String email = scannerInput.nextLine();

            System.out.print("Digite sua senha: ");
            String senha = scannerInput.nextLine();

            Usuario usuario = new Usuario(nome, email, senha);
            usuarios.add(usuario);  // Adiciona o novo usuário à lista

            System.out.println("\nCadastro realizado com sucesso!");
            usuario.exibirUsuario();

            // Perguntar ao usuário se ele quer cadastrar outro
            System.out.print("\nDeseja cadastrar outro usuário? (s/n): ");
            String resposta = scannerInput.nextLine();
            if (resposta.equalsIgnoreCase("n")) {
                break;  // Sai do loop se a resposta for n
            }
        }

        // Exibe todos os usuários cadastrados
        System.out.println("\nTodos os usuários cadastrados:");

        //Loop para exibir todos usuarios
        for (Usuario u : usuarios) {
            u.exibirUsuario();
            System.out.println("---------------");
        }

        scannerInput.close();
    }
}

