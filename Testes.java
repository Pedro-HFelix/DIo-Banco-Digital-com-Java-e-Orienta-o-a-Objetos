public class Testes {
    public static void main(String[] args) {

        cliente pedro = new cliente();
        pedro.setNome("Pedro");

        InterfaceConta  conta_Corrente = new contaCorrente(pedro);
        InterfaceConta conta_Poupanca = new contaPoupanca(pedro);



        conta_Corrente.Depositar(100);    
        conta_Corrente.ImprimirExtrato();

        conta_Corrente.Transferir(50, conta_Poupanca);


       
         conta_Poupanca.ImprimirExtrato();

        
    }
}