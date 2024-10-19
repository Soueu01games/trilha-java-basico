public class main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNome("Banco Digital");

        //Adicionando novos clientes
        Cliente emanuela = new Cliente();
        emanuela.setNome("Emanuela");
        banco.adicionarCliente(emanuela);

        Cliente joao = new Cliente();
        joao.setNome("João");
        banco.adicionarCliente(joao);

        Cliente maria = new Cliente();
        maria.setNome("Maria");
        banco.adicionarCliente(maria);

        //Criando as contas dos clienes
        Conta cc = new ContaCorrente(emanuela);
        Conta poupanca = new ContaPoupanca(emanuela);

        Conta cc1 = new ContaCorrente(joao);
        Conta poupanca1 = new ContaPoupanca(joao);

        Conta cc2 = new ContaCorrente(maria);
        Conta poupanca2 = new ContaPoupanca(maria);

        //Simulando transações
        cc.depositar(300);
        cc.transferir(100, cc2);

        cc1.sacar(25);

        cc2.depositar(200);
        cc2.transferir(100, poupanca2);

        //Imprimindo resultados
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc1.imprimirExtrato();
        poupanca1.imprimirExtrato();

        cc2.imprimirExtrato();
        poupanca2.imprimirExtrato();

        banco.listarClientes();
    }
}

