import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {
        Scanner entradaDeDados = new Scanner(System.in);
        Cadastro cadastro = new Cadastro();

        System.out.println("Vamos criar uma conta ? 1 = Sim 2 = Não");
        int respostaConta = entradaDeDados.nextInt();
        entradaDeDados.nextLine();

        if (respostaConta == 1) {
            System.out.println("Digite o seu primeiro nome:");
            String nomes = entradaDeDados.nextLine();
            cadastro.setNome(nomes);

            System.out.println("Qual sua data de nascimento ?");
            int dataDeNascimento = entradaDeDados.nextInt();
            cadastro.setDataDeNascimento(dataDeNascimento);
            entradaDeDados.nextLine();

            System.out.print("Digite seu numero de telefone:");
            String numeroTel = entradaDeDados.nextLine();
            cadastro.setTelefone(numeroTel);
            entradaDeDados.close();

            System.out.println("Seu nome é " + cadastro.nome);
            System.out.println("Sua idade é " + cadastro.idade);
            System.out.println("Seu telefone é " + cadastro.telefone);
        } else {
            System.out.println("Que pena até uma proxima");
        }

    }

}
