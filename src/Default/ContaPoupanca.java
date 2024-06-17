package Default;

public abstract class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);

        System.out.println("=== Extrato Conta Poupança === ");
        super.imprimirInfosComuns();
    }
}