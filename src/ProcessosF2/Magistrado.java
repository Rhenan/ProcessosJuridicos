package ProcessosF2;
/**
 * Magistrado
 * @author gilvaju
 */
public class Magistrado extends Pessoa
{
    private String matricula;
    private String orgaoJulgador;

    /**
     * Atribue valores de Pessoa além dos atributos de Magistradosß ao ser instanciada
     * @param nome
     * @param endereco
     * @param telefone
     * @param matricula
     * @param orgaoJulgador
     */
    public Magistrado(String nome, String endereco, String telefone, String matricula, String orgaoJulgador) {
        super(nome, endereco, telefone);
        this.matricula = matricula;
        this.orgaoJulgador = orgaoJulgador;
    }
    
    /**
     * Exibe valores herdados de Pessoas
     * e os de Magistrado
     */
    @Override
    public void exibirDadosPessoais() 
    {
        super.exibirDadosPessoais();
        
        System.out.println("Dados de Magistrado");
        System.out.println("  " + this.matricula + " / " + this.orgaoJulgador);
    }
    
}