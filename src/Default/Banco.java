package Default;

import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;

    }

    private void setNome(String nome) {
        this.nome = nome;

    }
    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}

