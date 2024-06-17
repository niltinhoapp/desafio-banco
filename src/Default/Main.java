package Default;

public class Main {
    public static void main(String[] args) {
        Cliente nilton = new Cliente();
        nilton.setNome("Nilton");

        Conta cc = new ContaCorrente(nilton);
        Conta poupanca = new ContaPoupanca(nilton) {
            @Override
            public void imprimirExtrato() {

            }
        };

        cc.depositar(1800);
        cc.transferir(1500, poupanca);



        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
