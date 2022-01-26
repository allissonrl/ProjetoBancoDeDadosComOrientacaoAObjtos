public class main {
    public static void main(String[] args) {
        Conta cc = new Conta();
        Conta poupanca = new ContaPoupanca();

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
