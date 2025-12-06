package br.com.upgrade.set.pesquisa.agendacontatos;

public class AgendaContatoTeste {

    public static void main(String[] args) {

        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Luan", 998877665);
        agenda.adicionarContato("Luan Carlos", 778877665);
        agenda.adicionarContato("Luan Tinoco", 118877665);
        agenda.adicionarContato("Isadora", 228877665);
        agenda.adicionarContato("Isa vale", 338877665);

        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("Luan"));
        System.out.println(agenda.pesquisarPorNome("Isa"));

        System.out.println(agenda.atualizarNumeroContato("Luan Carlos", 996754321));

    }
}
