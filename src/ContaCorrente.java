public class ContaCorrente<agencia, numero, saldo> extends Conta.Contas {
 System.out.println("Extrato conta corrente");
        System.out.println(String.format("Agencia: %d", super.agencia));
        System.out.println(String.format("Numero: %d", super.numero));
        System.out.println(String.format("Saldo: %.2f", super.saldo));

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

    @Override
    public int getAgencia() {
        return super.getAgencia();
    }

    @Override
    public int getNumero() {
        return super.getNumero();
    }
}
