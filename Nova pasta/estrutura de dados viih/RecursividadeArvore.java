public class RecursividadeArvore {

    static class No {
        int valor;
        No esquerda;
        No direita;

        No(int valor) {
            this.valor = valor;
            this.esquerda = null;
            this.direita = null;
        }
    }

    static void percorrerEmOrdem(No raiz) {
        if (raiz == null) {
            return;
        }

        percorrerEmOrdem(raiz.esquerda);
        System.out.println(raiz.valor);
        percorrerEmOrdem(raiz.direita);
    }

    public static void main(String[] args) {
        No raiz = new No(10);

        raiz.esquerda = new No(5);
        raiz.direita = new No(15);

        raiz.esquerda.esquerda = new No(3);
        raiz.esquerda.direita = new No(7);

        raiz.direita.esquerda = new No(12);
        raiz.direita.direita = new No(18);

        System.out.println("Valores da arvore em ordem:");
        percorrerEmOrdem(raiz);
    }
}