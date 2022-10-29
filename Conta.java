
public abstract class Conta implements IConta{

   private static final int AGENCIA_PADRAO = 001;
   private static int SEQUENCIAL = 1;

    protected int conta;
    protected int agencia;
    protected double saldo;

    
    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
    }

    public int getConta() {
        return conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
       
        this.saldo -= valor;
        
    }

    @Override
    public void depositar(double valor) {
      
        this.saldo += valor;
        
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        
        this.sacar(valor);
        contaDestino.depositar(valor);
        
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Agencia:%d", this.agencia));
        System.out.println(String.format("Conta:%d", this.conta));
        System.out.println(String.format("Saldo:%.2f", this.saldo));
    }

}
