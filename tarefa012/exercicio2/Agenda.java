import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    Contato buscaContato(String parametroBusca) {
        for (Contato c: this.contatos) {
            if(c.getNome().equals(parametroBusca) || c.getEmail().equals(parametroBusca))
                return c;
        }
        return null;
    }

    void excluirContato(String nome) {
        for (Contato c: this.contatos) {
            if(c.getNome().equals(nome))
                this.contatos.remove(c);
        }
    }

    List<Contato> listarContatos() {
        return this.contatos;
    }

}
