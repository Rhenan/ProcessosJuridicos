package ProcessosF2;
/**
 * Pessoa
 * @author gilvaju
 */
public class Pessoa
{
    private String nome;
    private String endereco;
    private String telefone;

    /**
     * Atribue valores a Pessoa ao ser instanciada
     * @param nome
     * @param endereco
     * @param telefone
     */
    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    /**
     * Exibe dados pessoais e Pessoa
     */
    public void exibirDadosPessoais() 
    {
        System.out.println("Dados de Pessoa");
        System.out.println("  " + this.nome + " / " + this.endereco + " / " + this.telefone);
    }
    
}