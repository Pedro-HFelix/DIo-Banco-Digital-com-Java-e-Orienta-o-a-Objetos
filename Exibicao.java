import java.util.Scanner;

public class Exibicao {
    public static void main(String[] args) {
        Scanner clienteLeitor = new Scanner(System.in);
        cliente cliente = new cliente();
        System.out.println("Digite o nome do cliente");
        cliente.setNome(clienteLeitor.nextLine());
        System.out.println("Digite os 11 numeros do cpf");
        cliente.setCPF("123.456.789-11");
        cliente felix = new cliente();
        felix.setNome("felix");
        felix.setCPF("345.378.859-11");
        InterfaceConta contaCorrente = new contaCorrente(cliente);
        InterfaceConta contaPoupanca = new contaPoupanca(felix);

        contaCorrente.Depositar(100);
        contaCorrente.ImprimirExtrato();

        contaCorrente.Transferir(50, contaPoupanca);

        contaPoupanca.ImprimirExtrato();
    }

    
}
