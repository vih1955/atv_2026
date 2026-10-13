public class RecursividadeLista {

    static class No {
        int valor;
        No proximo;

        No(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    static void imprimirLista(No atual) {
        if (atual == null) {
            return;
        }

        System.out.println(atual.valor);
        imprimirLista(atual.proximo);
    }

    public static void main(String[] args) {
        No inicio = new No(10);
        inicio.proximo = new No(20);
        inicio.proximo.proximo = new No(30);
        inicio.proximo.proximo.proximo = new No(40);
        inicio.proximo.proximo.proximo.proximo = new No(50);

        System.out.println("Elementos da lista:");
        imprimirLista(inicio);
    }
}
