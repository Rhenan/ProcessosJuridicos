package ProcessosF2;
class Processos {

    public static void main(String args[]) {
        
        System.out.println("Usando Construtor de Classes");
        System.out.println("----------");
        
        // Instancia classe Pessoa criando objeto joao
        Pessoa joao = new Pessoa("Gilvan", "Rua Teste", "12345678");
        joao.exibirDadosPessoais();
        
        System.out.println("----------");
        
        // Instancia classe Pessoa criando objeto paulo
        Advogado paulo = new Advogado("Paulo Júnior", "Rua teste advogado", "12348765", "123", "RN");
        paulo.exibirDadosPessoais();
        
        System.out.println("----------");
        
        // Instancia classe Pessoa criando objeto flavio
        Magistrado flavio = new Magistrado("Flavio Júnior", "Rua teste magistrado", "12348765", "1423", "TRE");
        flavio.exibirDadosPessoais();
    }

}