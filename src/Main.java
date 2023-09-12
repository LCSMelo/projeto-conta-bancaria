import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
//      Define as variáveis
        String nome = "Rick Morty";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

//      Apresenta os dados do cliente
        System.out.println("*****************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta) ;
        System.out.println("Saldo atual = " + saldo);
        System.out.println("\n*****************************");

//      Apresenta as operações que o cliente pode realizar
        String menu = """
                *** Operações ***
                
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                
                Digite a opção desejada:
                """;

//      Loop para realizar as operações
        while(opcao != 4) {
            System.out.println(menu);
            opcao = ler.nextInt();

//          Apresenta o saldo do cliente
            if (opcao == 1) {
                System.out.printf("Seu saldo atual é de R$ %.2f%n\n", saldo);
                System.out.println(menu);
                opcao = ler.nextInt();
            }

//          Realiza um depósito na conta do cliente
            if (opcao == 2) {
                System.out.println("Digite o valor a receber: ");
                double receber =  ler.nextDouble();
                saldo += receber;
                System.out.printf("Seu saldo atual é de R$ %.2f %n\n", saldo);
            }

//          Realiza uma transferência da conta do cliente
            if (opcao == 3) {
                System.out.println("Digite o valor que será transferido: ");
                double transferir = ler.nextDouble();
                if (saldo < transferir) {
                    System.out.println("Você não possui saldo para esta transferência.\n");
                }
                else {
                    saldo -= transferir;
                    System.out.printf("Seu salto atual é de R$ %.2f .%n\n", saldo);
                }
            }

//          Sai do sistema
            if (opcao == 4) {
                System.out.println("Obrigado e volte sempre!");
            }

//          Retorna como inválida caso o cliente digite uma opção inválida
            else {
                System.out.println("Opção inválida. Tente novamente.\n");
                System.out.println(menu);
                opcao = ler.nextInt();
            }
        }
    }
}

