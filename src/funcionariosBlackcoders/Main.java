package funcionariosBlackcoders;

public class Main {
    public static void main(String[] args) {

        System.out.println("Cadastrando funcionários\n");

        // Adicionando os executivos
        CEO funcionario = new CEO("Hugo", "CEO", 5000, "41643459856", "Executivo");
        CTO funcionario2 = new CTO("Gabriela", "CTO", 5000, "41648859856", "Executivo");

        // Adicionando Coordenador, supervisor e analista de Desenvolvimento
        Coordenador funcionario3 = new Coordenador("Tulio", "Coordenador", 4500, "4164565689", "Desenvolvimento");
        Supervisor funcionario4 = new Supervisor("Guilherme", "Supervisor", 3800, "4884565689", "Desenvolvimento");
        Analista funcionario5 = new Analista("Gustavo", "Analista", 3000, "48845663249", "Desenvolvimento");
        Analista funcionario7 = new Analista("Gabriel", "Analista", 3000, "48845543349", "Desenvolvimento");

        // Criando uma árvore para todos os funcionários cadastrados
        System.out.println("Adicionando Funcionários na árvore total\n");
        ArvoreDeFuncionarios arvoreTotal = new ArvoreDeFuncionarios<>();
        arvoreTotal.adicionar(funcionario);
        arvoreTotal.adicionar(funcionario2);
        arvoreTotal.adicionar(funcionario3);
        arvoreTotal.adicionar(funcionario4);
        arvoreTotal.adicionar(funcionario5);
        arvoreTotal.adicionar(funcionario7);
        arvoreTotal.mostrarTodos();

        // Criando árvores de armazenamento - Filtragem por cargo
        System.out.println("Criando árvores especificas para filtragem dos funcionários\n");
        ArvoreCEO arvoreCEO = new ArvoreCEO();
        ArvoreCTO arvoreCTO = new ArvoreCTO();
        ArvoreCoordenador arvoreCoordenador = new ArvoreCoordenador();
        ArvoreSupervisor arvoreSupervisor = new ArvoreSupervisor();
        ArvoreAnalista arvoreAnalista = new ArvoreAnalista();

        // Adicionando executivos em suas respectivas árvores
        System.out.println("Adicionando Cargo em sua respectiva árvore\n");
        arvoreCEO.adicionar(funcionario);
        arvoreCTO.adicionar(funcionario2);
        arvoreCoordenador.adicionar(funcionario3);
        arvoreSupervisor.adicionar(funcionario4);
        arvoreAnalista.adicionar(funcionario5);
        arvoreAnalista.adicionar(funcionario7);

        // Filtragem dos Analistas de Desenvolvimento
        System.out.println("\nListagem dos Analistas de desenvolvimento");
        arvoreAnalista.mostrarTodos();

        System.out.println("\nAtualização de Analista de desenvolvimento");
        arvoreAnalista.atualizarDados("Gustavo", 3200, "Analista Pleno");
        arvoreAnalista.mostrarTodos();

        // Adicionando Consultor
        Consultor consultor1 = new Consultor("Otávio", "Consultor", 2000, "41645869875", "Financeiro BlackCoders");
        Consultor consultor2 = new Consultor("Betto", "Consultor", 2000, "41645869875", "Financeiro BlackCoders");

        // Criando uma árvore para todos os Consultores cadastrados
        System.out.println("Adicionando Consultores\n");
        ArvoreDeConsultores arvoreDeConsultores = new ArvoreDeConsultores<>();
        arvoreDeConsultores.adicionar(consultor1);
        arvoreDeConsultores.adicionar(consultor2);
        arvoreDeConsultores.mostrarTodos();

        System.out.println("Removendo Consultores\n");
        arvoreDeConsultores.remover("Betto");
        arvoreDeConsultores.mostrarTodos();
    }
}
