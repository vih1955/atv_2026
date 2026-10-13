public class RecursividadePilha {

    static class No {
        int valor;
        No abaixo;

        No(int valor) {
            this.valor = valor;
            this.abaixo = null;
        }
    }

    static class Pilha {
        No topo;

        void empilhar(int valor) {
            No novo = new No(valor);
            novo.abaixo = topo;
            topo = novo;
        }

        void imprimirRecursivo(No atual) {
            if (atual == null) {
                return;
            }

            System.out.println(atual.valor);
            imprimirRecursivo(atual.abaixo);
        }

        void imprimir() {
            imprimirRecursivo(topo);
        }
    }

    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);
        pilha.empilhar(40);
        pilha.empilhar(50);

        System.out.println("Elementos da pilha:");
        pilha.imprimir();
    }
}