class ListaDinamica(var tamanho: Int) : Listavel {
    private var quantidade: Int = 0
    private var ponteiroFim: No2? = null
    private var ponteiroInicio: No2? = null

    // Métodos Auxiliares
    override fun estaCheia(): Boolean {
        return (quantidade == tamanho)
    }

    override fun estaVazia(): Boolean {
        return (quantidade == 0)
    }

    override fun selecionar(posicao: Int): Any? {
        if (!estaVazia()) {
            if (posicao >= 0 && posicao < quantidade) {
                var aux = ponteiroInicio
                for (i in 0 until posicao) {
                    aux = aux?.proximo
                }
                return aux?.dado
            }
        }
        return null
    }

    override fun limpar() {
        quantidade = 0
        ponteiroFim = null
        ponteiroInicio = null
    }

    override fun selecionarTodos(): Array<Any?> {
        val arrayDados: Array<Any?> = arrayOfNulls(quantidade)
        var aux = ponteiroInicio
        if (!estaVazia()) {
            for (i in 0 until quantidade) {
                arrayDados[i] = aux?.dado
                aux = aux?.proximo
            }
        } else {
            throw NoSuchElementException("Lista Vazia!")
        }
        return arrayDados
    }

    override fun imprimir(): String {
        var resultado = "["
        var aux = ponteiroInicio
        for (i in 0 until quantidade) {
            resultado += aux?.dado
            if (i != quantidade - 1) {
                resultado += ","
            }
            aux = aux?.proximo
        }
        return "$resultado]"
    }

    override fun inserir(dado: Any?, posicao: Int) {
        if (estaCheia()) {
            throw IllegalStateException("Lista está cheia!")
        }
        if (posicao < 0 || posicao > quantidade) {
            throw IndexOutOfBoundsException("Posição inválida!")
        }

        val novoNo = No2(dado)
        if (posicao == 0) {
            novoNo.proximo = ponteiroInicio
            ponteiroInicio = novoNo
            if (quantidade == 0) {
                ponteiroFim = novoNo
            }
        } else {
            var aux = ponteiroInicio
            for (i in 0 until posicao - 1) {
                aux = aux?.proximo
            }
            novoNo.proximo = aux?.proximo
            aux?.proximo = novoNo
            if (posicao == quantidade) {
                ponteiroFim = novoNo
            }
        }
        quantidade++
    }
}
