public class PilhaDinamica implements PilhaOperacoes {

    No topo;

    public PilhaDinamica() {
        this.topo = null;
    }

    @Override
    public boolean empilhar(String elemento) {
        No novo = new No(elemento);
        novo.setProx(topo);
        topo = novo;
        return true;
    }

    @Override
    public String desempilhar() {
        if (estaVazia()) {
            return null;
        }

        String removido = topo.getConteudo();
        topo = topo.getProx();
        return removido;
    }

    @Override
    public String topo() {
        if (estaVazia()) {
            return null;
        }

        return topo.getConteudo();
    }

    @Override
    public int contar() {
        int count = 0;
        No aux = topo;

        while (aux != null) {
            count++;
            aux = aux.getProx();
        }

        return count;
    }

    @Override
    public boolean estaVazia() {
        return topo == null;
    }

    @Override
    public void limpar() {
        topo = null;
    }

    @Override
    public int empilharVarios(String[] elementos) {
        int adicionados = 0;

        for (String e : elementos) {
            if (empilhar(e)) {
                adicionados++;
            }
        }

        return adicionados;
    }

    @Override
    public int contarOcorrencias(String elemento) {
        int count = 0;
        No aux = topo;

        while (aux != null) {
            if (aux.getConteudo().equals(elemento)) {
                count++;
            }
            aux = aux.getProx();
        }

        return count;
    }

    @Override
    public boolean contem(String elemento) {
        No aux = topo;

        while (aux != null) {
            if (aux.getConteudo().equals(elemento)) {
                return true;
            }
            aux = aux.getProx();
        }

        return false;
    }

    @Override
    public int substituir(String antigo, String novo) {
        int substituidos = 0;
        No aux = topo;

        while (aux != null) {
            if (aux.getConteudo().equals(antigo)) {
                aux.setConteudo(novo);
                substituidos++;
            }
            aux = aux.getProx();
        }

        return substituidos;
    }

    public void exibir() {
        if (estaVazia()) {
            System.out.println("Pilha vazia.");
            return;
        }

        No aux = topo;

        while (aux != null) {
            System.out.println(aux.getConteudo());
            aux = aux.getProx();
        }
    }
}