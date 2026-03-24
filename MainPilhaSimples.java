public class MainPilhaSimples {

    public static void main(String[] args) {

        PilhaSimples pilha = new PilhaSimples(10);

        pilha.empilharVarios(new String[]{"Ana", "Carlos", "Pedro", "Ana"});

        System.out.println("Pilha inicial:");
        pilha.exibir();

        System.out.println("Quantidade de elementos: " + pilha.contar());

        System.out.println("Topo da pilha: " + pilha.topo());

        System.out.println("Ocorrencias de Ana: " + pilha.contarOcorrencias("Ana"));

        System.out.println("Contem Pedro? " + pilha.contem("Pedro"));

        pilha.substituir("Ana", "Julia");
        System.out.println("Apos substituir Ana por Julia:");
        pilha.exibir();

        System.out.println("Desempilhado: " + pilha.desempilhar());
        System.out.println("Apos desempilhar:");
        pilha.exibir();

        pilha.limpar();
        System.out.println("Apos limpar:");
        pilha.exibir();
    }
}