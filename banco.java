import java.util.List;

public class banco {

    private String nome;
    private List<conta> contas;
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getNome() {
        return nome;
    }

    public void setContas(List<conta> contas) {
        this.contas = contas;
    }
    
    public List<conta> getContas() {
        return contas;
    }
}