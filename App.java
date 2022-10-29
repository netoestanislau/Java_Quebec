public class App {

    public static void main(String[] args) {

        Conta cc = new ContaCorrente();
        cc.depositar(1000);
        Conta poupanca = new ContaPoupanca();
        cc.transferir(350, poupanca);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
