public class Listando implements Listavel {

    private Object[] elementos;
    private int contador = 0;
    private int inicio = 0;
    private int fim = -1;

    public Listando(int tamanho) {
        this.elementos = new Object[tamanho];
    }

    public Listando() {
        this(10); // Tamanho padrão de 10
    }

    @Override
    public void anexar(Object item) {
        if (!estaCheia()) {
            fim++;
            if (fim == elementos.length) fim = 0;
            elementos[fim] = item;
            contador++;
        } else {
            System.out.println("A lista está cheia!");
        }
    }

    @Override
    public Object[] selecionarTodos() {
        Object[] auxArray = new Object[contador];
        if (!estaVazia()) {
            int indexAux = inicio;
            for (int i = 0; i < contador; i++) {
                auxArray[i] = elementos[(indexAux + i) % elementos.length];
            }
        }
        return auxArray;
    }

    @Override
    public Object selecionar(int posicao) {
        Object resultado = null;
        if (!estaVazia()) {
            if (posicao >= 0 && posicao < contador) {
                int posicaoReal = (inicio + posicao) % elementos.length;
                resultado = elementos[posicaoReal];
            } else {
                System.out.println("Posição inválida!");
            }
        } else {
            System.out.println("A lista está vazia!");
        }
        return resultado;
    }

    @Override
    public void atualizar(int posicao, Object item) {
        if (!estaVazia()) {
            if (posicao >= 0 && posicao < contador) {
                int posicaoReal = (inicio + posicao) % elementos.length;
                elementos[posicaoReal] = item;
            } else {
                System.out.println("Posição inválida!");
            }
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public boolean estaCheia() {
        return contador == elementos.length;
    }

    @Override
    public boolean estaVazia() {
        return contador == 0;
    }

    @Override
    public String imprimir() {
        StringBuilder resultado = new StringBuilder("[");
        int indexAux = inicio;
        for (int i = 0; i < contador; i++) {
            resultado.append(elementos[(indexAux + i) % elementos.length]);
            if (i != fim) {
                resultado.append(", ");
            }
        }
        resultado.append("]");
        return resultado.toString();
    }

    @Override
    public Object apagar(int posicao) {
        Object removido = null;
        if (!estaVazia()) {
            if (posicao >= 0 && posicao < contador) {
                int posicaoReal = (inicio + posicao) % elementos.length;
                removido = elementos[posicaoReal];
                int indexAux = posicaoReal;
                for (int i = posicao; i < contador - 1; i++) {
                    int atual = indexAux;
                    int proximo = (indexAux + 1) % elementos.length;
                    elementos[atual] = elementos[proximo];
                    indexAux++;
                }
                fim--;
                if (fim == -1) fim = elementos.length - 1;
                contador--;
            } else {
                System.out.println("Posição inválida!");
            }
        } else {
            System.out.println("A lista está vazia!");
        }
        return removido;
    }

    @Override
    public void inserir(int posicao, Object item) {
        if (!estaCheia()) {
            if (posicao >= 0 && posicao <= contador) {
                int posicaoReal = (inicio + posicao) % elementos.length;
                int indexAux = fim + 1;
                for (int i = posicao; i < contador; i++) {
                    int anterior = indexAux - 1;
                    if (indexAux == elementos.length) indexAux = 0;
                    elementos[indexAux] = elementos[anterior];
                    indexAux--;
                }
                elementos[posicaoReal] = item;
                fim++;
                if (fim == elementos.length) fim = 0;
                contador++;
            } else {
                System.out.println("Posição inválida!");
            }
        } else {
            System.out.println("A lista está cheia!");
        }
    }
}
