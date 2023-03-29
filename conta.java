public abstract class conta implements InterfaceConta {
    protected int agencia,numero;
    protected double saldo;
    private static final int agencia_Padrao=1;
    private static int sequencial=1;
    private cliente cliente;


    public conta(cliente cliente){
        this.agencia = agencia_Padrao;
        this.numero = sequencial++;
        this.cliente = cliente;
    }

    
    public void Sacar(double valor_Saque) {
        this.saldo -= valor_Saque;
    }
    public void Depositar(double valor_deposito) {
        this.saldo += valor_deposito;

    }
    public void Transferir(double valor_transferencia, InterfaceConta conta_Destino) {
        this.Sacar(valor_transferencia);
        conta_Destino.Depositar(valor_transferencia);
    }




    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
   

    protected void ImprimirInformação(){
        System.out.println(String.format("Titular: %s",this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d",this.agencia));  
        System.out.println(String.format("Numero: %d",this.numero));
        System.out.println(String.format("Saldo: %.2f",this.saldo));
    }
   
}
