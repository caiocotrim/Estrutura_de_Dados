class DoubleNode(var data: Any?) {
    var previous: DoubleNode? = null
    var next: DoubleNode? = null
}

class PilhaDinamica(private var tamanho: Int) : Empilhavel {
    private var ponteiroTopo: DoubleNode? = null
    private var quantidade = 0

    override fun empilhar(dado: Any?) {
        if (!estaCheia()) {
            // cria um novo nó e atualiza o ponteiro do nó anterior para o nó do topo da pilha
            val auxNode = DoubleNode(dado)
            auxNode.previous = ponteiroTopo

            if (!estaVazia()) {
                // caso a pilha não esteja vazia, atualiza o ponteiro do próximo nó do topo da pilha
                ponteiroTopo?.next = auxNode
            }
            // atualiza o ponteiro do topo da pilha para o novo nó e incrementa a quantidade de elementos
            ponteiroTopo = auxNode
            quantidade++
        } else {
            throw IndexOutOfBoundsException("Pilha Cheia!")
        }
    }

    override fun desempilhar(): Any? {
        var auxData: Any? = null
        if (!estaVazia()) {
            // obtém o dado do nó do topo da pilha
            auxData = ponteiroTopo?.data
            // atualiza o ponteiro do nó anterior do topo da pilha
            ponteiroTopo = ponteiroTopo?.previous
            quantidade--
            if (!estaVazia()) {
                // caso a pilha não esteja vazia, atualiza o ponteiro do próximo nó do topo da pilha
                ponteiroTopo?.next = null
            }

        } else {
            throw NoSuchElementException("Pilha Vazia!")
        }
        return auxData
    }

    override fun espiar(): Any? {
        var auxData: Any? = null
        if (!estaVazia()) {
            // obtém o dado do nó do topo da pilha
            auxData = ponteiroTopo?.data
        } else {
            throw NoSuchElementException("Pilha Vazia!")
        }
        return auxData
    }

    override fun atualizar(dado: Any?) {
        if (!estaVazia())
            ponteiroTopo?.data = dado
        else
            throw NoSuchElementException("Pilha Vazia!")
    }

    override fun estaCheia(): Boolean {
        return quantidade == tamanho
    }

    override fun estaVazia(): Boolean {
        return quantidade == 0
    }

    override fun imprimir(): String {
        var auxPointer = ponteiroTopo
        var result = "["
        for (i in 0 until quantidade) {
            result += auxPointer?.data
            if (i != quantidade - 1)
                result += ",\n"

            auxPointer = auxPointer?.previous
        }
        return "$result]"
    }

    fun obterPonteiroTopo(): DoubleNode? {
        return ponteiroTopo
    }
}
