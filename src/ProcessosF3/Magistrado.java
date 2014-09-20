package ProcessosF3;
/**
 * Magistrado
 * @author gilvaju
 */
public class Magistrado extends Pessoa
{
    private String matricula;
    private String orgaoJulgador;
    
    /**
     * Atribui valores para os atribudos herdados de pessoas
     * @param nome
     * @param endereco
     * @param telefone
     * e para os atributos de Magistrado
     * @param matricula
     * @param orgaoJulgador
     */
    public void atribuirValores(String nome, String endereco, String telefone, String matricula, String orgaoJulgador)
    {
        super.atribuirValores(nome, endereco, telefone);
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