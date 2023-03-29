public interface InterfaceConta {
    public void Sacar(double valor);
        

    public void Depositar(double valor);


    public void Transferir(double valor, InterfaceConta destinConta);



    public void ImprimirExtrato();
}
