import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Scanner scan = new Scanner(System.in);
        // String nomeCliente;
        // String agencia;
        // int numeroConta;
        // double saldo;

        // while (true) {
        // System.out.println("Por favor, digite o nome do cliente.");
        // nomeCliente = scan.nextLine();
        // System.out.println("Por favor digite o numero da agencia.");
        // agencia = scan.nextLine();
        // System.out.println("Por favor digite o numero da conta.");
        // numeroConta = Integer.parseInt(scan.nextLine());
        // System.out.println("Por favor digite o saldo.");
        // saldo = Double.parseDouble(scan.nextLine());

        // System.out.println("Gostaria de inserir dados diferentes? Digite Sim ou
        // Nao.");
        // if (scan.nextLine().equalsIgnoreCase("Sim")) {
        // continue;
        // }
        // break;
        // }

        // System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em
        // nosso banco, sua agencia e "
        // + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " ja esta
        // disponivel para saque.");
        // scan.close();

        /*
         * Versao abaixo utiliza class ContaBancaria
         * para executar o mesmo programa, mas
         * utilizando OOP em vez de ficheiro unico.
         */

        Scanner scan = new Scanner(System.in);
        ContaBancaria contaBancaria = new ContaBancaria();

        while (true) {
            System.out.println("Por favor, digite o nome do cliente.");
            contaBancaria.setNomeCliente(scan.nextLine());
            System.out.println("Por favor digite o numero da agencia.");
            contaBancaria.setAgencia(scan.nextLine());
            System.out.println("Por favor digite o numero da conta.");
            contaBancaria.setNumeroConta(Integer.parseInt(scan.nextLine()));
            System.out.println("Por favor digite o saldo.");
            contaBancaria.setSaldo(Double.parseDouble(scan.nextLine()));

            System.out.println("Gostaria de inserir dados diferentes? Digite Sim ou Nao.");
            if (scan.nextLine().equalsIgnoreCase("Sim")) {
                continue;
            }
            break;
        }
        scan.close();

        System.out.println("Ola, e obrigado por criar uma conta com o nosso banco.");
        System.out.println("A sua conta ja esta pronta, com os seguintes dados:");
        System.out.println(contaBancaria);
    }
}
