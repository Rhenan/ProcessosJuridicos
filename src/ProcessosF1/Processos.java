package ProcessosF1;

class Processos {

    public static void main(String args[]) {
        
        System.out.println("----------");
        
        // Instancia classe Pessoa criando objeto joao
        Pessoa joao = new Pessoa();
        joao.atribuirValores("Gilvan", "Rua Teste", "12345678");
        joao.exibirDadosPessoais();
        
        System.out.println("----------");
        
        // Instancia classe Pessoa criando objeto paulo
        Advogado paulo = new Advogado();
        paulo.atribuirValores("Paulo Júnior", "Rua teste advogado", "12348765", "123", "RN");
        paulo.exibirDadosPessoais();
        
        System.out.println("----------");
        
        // Instancia classe Pessoa criando objeto flavio
        Magistrado flavio = new Magistrado();
        flavio.atribuirValores("Flavio Júnior", "Rua teste magistrado", "12348765", "1423", "TRE");
        flavio.exibirDadosPessoais();
    }

}