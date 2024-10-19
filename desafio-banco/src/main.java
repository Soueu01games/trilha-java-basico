public class main {
    public static void main(String [] args){
        Cliente emanuela =new Cliente();
        emanuela.setNome("Emanuela");


        Conta cc = new ContaCorrente(emanuela);
        Conta poupanca = new ContaPoupanca(emanuela);
        
        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
