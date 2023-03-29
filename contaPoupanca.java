public class contaPoupanca extends conta{
    
    
    public contaPoupanca(cliente cliente) {
        super(cliente);
    }

    public void ImprimirExtrato(){
        System.out.println("*Extrato conta poupanca*");
       super.ImprimirInformação();
      }
    
}
