public class ContaBancaria {
    private String nomeCliente = "";
    private String agencia = "";
    private int numeroConta = 0;
    private double saldo = 0.0;

    public ContaBancaria() {

    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public void setNomeCliente(String nome) {
        this.nomeCliente = nome;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.nomeCliente = agencia;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int numero) {
        this.numeroConta = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nomeCliente + ". Agencia: "
                + this.agencia + ". Conta: " + this.numeroConta + ". Saldo: " + this.saldo;
    }
}
