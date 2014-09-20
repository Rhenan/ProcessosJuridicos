package ProcessosF1;


/**
 * Advogado
 * @author gilvaju
 */
public class Advogado extends Pessoa
{
    private String nrOab;
    private String estadoOab;
    
    /**
     *
     * @param nome
     * @param endereco
     * @param telefone
     * @param nrOab
     * @param estadoOab
     */
    public void atribuirValores(String nome, String endereco, String telefone, String nrOab, String estadoOab)
    {
        super.atribuirValores(nome, endereco, telefone);
        this.nrOab = nrOab;
        this.estadoOab = estadoOab;
    }
    
    /**
     * Exibe valores herdados de Pessoas
     * e os de Advogado
     */
    @Override
    public void exibirDadosPessoais() 
    {
        super.exibirDadosPessoais();
        
        System.out.println("Dados de Magistrado");
        System.out.println("  " + this.nrOab + " / " + this.estadoOab);
    }
}