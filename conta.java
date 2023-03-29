public abstract class conta implements InterfaceConta {
    protected int agencia,numero;
    protected double saldo;
    private static final int agencia_Padrao=1;
    private static int sequencial=1;
    private cliente cliente;


    public conta(cliente cliente){
        agencia = agencia_Padrao;
        numero = sequencial++;
        this.cliente = cliente;
    }

    
    public void Sacar(double valor_Saque) {
        saldo -= valor_Saque;
        System.out.println("Saque realizado");
    }
    public void Depositar(double valor_deposito) {
        saldo += valor_deposito;
        System.out.println("Deposito realizado");

    }
    public void Transferir(double valor_transferencia, InterfaceConta conta_Destino) {
        Sacar(valor_transferencia);
        conta_Destino.Depositar(valor_transferencia);
        System.out.println("Transferencia realizada");
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
        System.out.println(String.format("Titular: %s",cliente.getNome()));
        System.out.println(String.format("CPF: %s",cliente.getCPF()));
        System.out.println(String.format("Agencia: %d",agencia));  
        System.out.println(String.format("Numero: %d",numero));
        System.out.println(String.format("Saldo: %.2f",saldo));
    }
   
}
