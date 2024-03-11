import java.util.List;
import java.util.Scanner;

class Usuario {
    private String nomeCompleto;
    private String email;
    private int dataDeNascimento;
    private String localDeNascimento;
}

class Eventos {
    private String nome;
    private String endereco;
    private List<Categoria> categorias;
    private String horario;
    private String descricao;
}

class Categoria{
    private String nome;
    private String descricao;
}

class ControleEvento{

    public static void cadastrarUsuario(Usuario usario){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();
        System.out.println("Digite seu Email: ");
        String email = scanner.nextLine();
        System.out.println("Digite seu local de nascimento: ");
        String loalDeNascimento = scanner.nextLine();
        System.out.println("Digite sua data de nascimento: ");
        int dataDeNascimento = scanner.nextInt();
    }
}

public class Main{
    public static void main(String[]args){
        ControleEvento.cadastrarUsuario(new Usuario());
    }
}