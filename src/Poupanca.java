public class Poupanca extends Icompra {
    public void imprimirExtrato(){
        System.out.println("Extrato conta poupanca");
        System.out.println(String.format("Agencia: %d", super.agencia));
        System.out.println(String.format("Numero: %d", super.numero));
        System.out.println(String.format("Saldo: %d", super.saldo));
    }
    }


