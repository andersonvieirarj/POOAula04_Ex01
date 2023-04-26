import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int opcao = 0;
        int tipoCliente;

        System.out.println("Qual o tipo de cliente? ");
        System.out.println("0 - Cliente Comum ");
        System.out.println("1 - Cliente Especial ");
        tipoCliente = Integer.parseInt(entrada.nextLine());

        while (opcao!=4){
            System.out.println("Qual opção você deseja acessar? ");
            System.out.println("1 - Cadastrar Dados ");
            System.out.println("2 - Sacar ");
            System.out.println("3 - Depositar ");
            System.out.println("4 - Sair ");
            opcao = Integer.parseInt(entrada.nextLine());

            if (tipoCliente==0) {
                ClienteComum c = new ClienteComum();
                if (opcao == 1) {
                    c.setNome("Anderson Vieira");
                    c.setNumeroConta(99999);
                    c.setSaldoCC(100);
                } else if (opcao == 2) {
                    System.out.println("Digite o valor a sacar: ");
                    c.sacar(Float.parseFloat(entrada.nextLine()));
                    c.exibirSaldo();
                } else if (opcao == 3) {
                    System.out.println("Digite o valor a depositar: ");
                    c.depositar(Float.parseFloat(entrada.nextLine()));
                    c.exibirSaldo();
                }
            }
            else if (tipoCliente==1) {
                ClienteEspecial ce = new ClienteEspecial();
                if (opcao==0){

          }
            }
        }

        }
    }
