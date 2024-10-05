class Listando (val tamanho: Int = 10) : Listavel {

    private var elementos: Array<Any?> = arrayOfNulls(tamanho)
    private var contador = 0
    private var inicio = 0
    private var fim = -1

    override fun anexar(item: Any?) {
        if (!estaCheia()) {
            fim++
            if (fim == elementos.size) fim = 0
            elementos[fim] = item
            contador++
        } else {
            println("A lista está cheia!")
        }
    }

    override fun selecionarTodos(): Array<Any?> {
        val auxArray: Array<Any?> = arrayOfNulls(contador)
        if (!estaVazia()) {
            var indexAux = inicio
            for (i in 0 until contador) {
                auxArray[i] = elementos[(indexAux + i) % elementos.size]
            }
        }
        return auxArray
    }

    override fun selecionar(posicao: Int): Any? {
        var resultado: Any? = null
        if (!estaVazia()) {
            if (posicao in 0 until contador) {
                val posicaoReal = (inicio + posicao) % elementos.size
                resultado = elementos[posicaoReal]
            } else {
                println("Posição inválida!")
            }
        } else {
            println("A lista está vazia!")
        }
        return resultado
    }

    override fun atualizar(posicao: Int, item: Any?) {
        if (!estaVazia()) {
            if (posicao in 0 until contador) {
                val posicaoReal = (inicio + posicao) % elementos.size
                elementos[posicaoReal] = item
            } else {
                println("Posição inválida!")
            }
        } else {
            println("A lista está vazia!")
        }
    }

    override fun estaCheia(): Boolean = contador == elementos.size

    override fun estaVazia(): Boolean = contador == 0

    override fun imprimir(): String {
        var resultado = "["
        var indexAux = inicio
        for (i in 0 until contador) {
            resultado += if (i == fim) "${elementos[(indexAux + i) % elementos.size]}"
            else "${elementos[(indexAux + i) % elementos.size]}, "
        }
        return "$resultado]"
    }

    override fun apagar(posicao: Int): Any? {
        var removido: Any? = null
        if (!estaVazia()) {
            if (posicao in 0 until contador) {
                val posicaoReal = (inicio + posicao) % elementos.size
                removido = elementos[posicaoReal]
                var indexAux = posicaoReal
                for (i in posicao until (contador - 1)) {
                    val atual = indexAux
                    val proximo = (indexAux + 1) % elementos.size
                    elementos[atual] = elementos[proximo]
                    indexAux++
                }
                fim--
                if (fim == -1) fim = elementos.size - 1
                contador--
            } else {
                println("Posição inválida!")
            }
        } else {
            println("A lista está vazia!")
        }
        return removido
    }

    override fun inserir(posicao: Int, item: Any?) {
        if (!estaCheia()) {
            if (posicao in 0..contador) {
                val posicaoReal = (inicio + posicao) % elementos.size
                var indexAux = fim + 1
                for (i in posicao until contador) {
                    val anterior = indexAux - 1
                    if (indexAux == elementos.size) indexAux = 0
                    elementos[indexAux] = elementos[anterior]
                    indexAux--
                }
                elementos[posicaoReal] = item
                fim++
                if (fim == elementos.size) fim = 0
                contador++
            } else {
                println("Posição inválida!")
            }
        } else {
            println("A lista está cheia!")
        }
    }
}