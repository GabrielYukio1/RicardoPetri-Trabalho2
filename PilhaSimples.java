public class PilhaSimples implements PilhaOperacoes {

    String[] pilha;
    int topo;

    public PilhaSimples(int tamanho) {
        this.pilha = new String[tamanho];
        this.topo = -1;
    }

    @Override
    public boolean empilhar(String elemento) {
        if (topo == pilha.length - 1) {
            return false;
        }

        topo++;
        pilha[topo] = elemento;
        return true;
    }

    @Override
    public String desempilhar() {
        if (estaVazia()) {
            return null;
        }

        String removido = pilha[topo];
        pilha[topo] = null;
        topo--;

        return removido;
    }

    @Override
    public String topo() {
        if (estaVazia()) {
            return null;
        }

        return pilha[topo];
    }

    @Override
    public int contar() {
        return topo + 1;
    }

    @Override
    public boolean estaVazia() {
        return topo == -1;
    }

    @Override
    public void limpar() {
        for (int i = 0; i <= topo; i++) {
            pilha[i] = null;
        }
        topo = -1;
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

        for (int i = 0; i <= topo; i++) {
            if (pilha[i] != null && pilha[i].equals(elemento)) {
                count++;
            }
        }

        return count;
    }

    @Override
    public boolean contem(String elemento) {
        for (int i = 0; i <= topo; i++) {
            if (pilha[i] != null && pilha[i].equals(elemento)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int substituir(String antigo, String novo) {
        int substituidos = 0;

        for (int i = 0; i <= topo; i++) {
            if (pilha[i] != null && pilha[i].equals(antigo)) {
                pilha[i] = novo;
                substituidos++;
            }
        }

        return substituidos;
    }

    public void exibir() {
        if (estaVazia()) {
            System.out.println("Pilha vazia.");
            return;
        }

        for (int i = topo; i >= 0; i--) {
            System.out.println(pilha[i]);
        }
    }
}