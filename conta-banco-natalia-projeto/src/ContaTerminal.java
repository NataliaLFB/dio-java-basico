import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        try (Scanner scan = new Scanner(System.in)) {
            int numeroConta;
            String agencia;
            String nomeCliente;
            double saldo;
            
            //Obtém o nome do Cliente
            System.out.println("Digite o nome do Cliente: ");
            nomeCliente = scan.nextLine();
            //Pede o número da agência bancária
            System.out.println ("Insira o número da Agência: (000-00) ");
            agencia = scan.nextLine();
            
            //Pede o número da conta bancária
            System.out.println("Digite o número da Conta: (0000) ");
            numeroConta = scan.nextInt();
                       
            //Obtém o saldo inicial da conta
            System.out.println ("Insira o saldo inicial da Conta: ");
            saldo = scan.nextDouble();
            
            //Exibe a mensagem de boas-vindas com os dados inseridos anteriormente
            System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
              + agencia + ", conta " + numeroConta + " e o seu saldo " + saldo + " já está disponível para saque.");
        }

    }
}
