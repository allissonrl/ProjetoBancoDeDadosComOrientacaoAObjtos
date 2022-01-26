public abstract class Icompra {
    protected static int SEQUENCIAL = 1;
    protected int numero = SEQUENCIAL++;
    protected final Object agencia;

    public Icompra() {
        this.agencia = Conta.Contas.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }


    public void ContaPoupanca() {

    }

   public void sacar(double valor) {
    saldo -= valor;

    void depositar(double valor) {
            saldo += valor;
    }

    void transferir(double valor, Contas contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    void imprimirExtrato();

    public abstract double getSaldo();

    public abstract int getAgencia();

    public abstract int getNumero();
}
