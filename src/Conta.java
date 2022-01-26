public class Conta {
    public void imprimirExtrato() {

    }

    public abstract static class Contas extends Icompra {
        protected static final int AGENCIA_PADRAO = 0001;
        protected int agencia;
        protected int numero;
        protected double saldo;


        public double getSaldo() {
            return saldo;
        }


        public int getAgencia() {
            return agencia;
        }


        public int getNumero() {
            return numero;
        }



    }
}
