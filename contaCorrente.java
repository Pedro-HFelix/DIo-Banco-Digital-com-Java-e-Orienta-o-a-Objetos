public class contaCorrente extends conta {
    
    public contaCorrente(cliente cliente){
        super(cliente);
    }
    public void ImprimirExtrato(){
        System.out.println("*Extrato conta corrente*");
       super.ImprimirInformação();
      }
}
