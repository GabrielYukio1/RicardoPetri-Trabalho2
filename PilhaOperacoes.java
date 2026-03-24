public interface PilhaOperacoes {

    boolean empilhar(String elemento);

    String desempilhar();

    String topo();

    int contar();

    boolean estaVazia();

    void limpar();

    int empilharVarios(String[] elementos);

    int contarOcorrencias(String elemento);

    boolean contem(String elemento);

    int substituir(String antigo, String novo);
}