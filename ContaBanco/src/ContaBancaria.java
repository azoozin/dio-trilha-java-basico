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
        return "Ola " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia e "
                + this.agencia + ", conta " + this.numeroConta + " e seu saldo " + this.saldo
                + " ja esta disponivel para saque.";
    }
}
