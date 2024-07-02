import OperacoesBasicas.listaTarefa;
import Ordenacao.OrdenacaoPessoas;



public class App {
    public static void main(String[] args) throws Exception {
        
        TestarTarefas();
        
        OrdenarPessoas();
    }

    private static void TestarTarefas(){

        listaTarefa listaTarefa = new listaTarefa();

        listaTarefa.adicionarTarefa("Comprar leite");
        listaTarefa.adicionarTarefa("Estudar para o exame");
        listaTarefa.adicionarTarefa("Fazer exercícios");

        System.out.println("Você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

        listaTarefa.obterDescricoesTarefas();

        listaTarefa.removerTarefa("Trabalhar");

        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

        listaTarefa.obterDescricoesTarefas();

        listaTarefa.removerTarefa("Estudar para o exame");

        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
    }

    private static void OrdenarPessoas(){

        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);
        
        System.out.println(ordenacaoPessoas.pessoaList);
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
        
    }
    

}
