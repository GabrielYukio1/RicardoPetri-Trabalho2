public class MainPilhaDinamica {

    public static void main(String[] args) {

        PilhaDinamica pilha = new PilhaDinamica();

        pilha.empilhar("Ana");
        pilha.empilhar("Carlos");
        pilha.empilhar("Pedro");
        pilha.empilhar("Ana");

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