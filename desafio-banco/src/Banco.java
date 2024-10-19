import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;
    private List<Cliente> clientes; // Nova lista para armazenar os clientes

    public Banco() {
        this.contas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void listarClientes() {
        System.out.println("Clientes do banco:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome());
        }
    }
}
