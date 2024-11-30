class FilaEstatica(tamanho: Int = 10) : Enfileiravel {

    private var ponteiroInicio = 0
    private var ponteiroFim = -1
    private var dados: Array<Any?> = arrayOfNulls(tamanho)

    override fun cheia(): Boolean {
        return ponteiroFim == dados.size - 1
    }

    override fun vazia(): Boolean {
        return ponteiroInicio > ponteiroFim
    }

    override fun enfileirar(dado: Any?) {
        if (!cheia()) {
            ponteiroFim++
            dados[ponteiroFim] = dado
        } else {
            println("Fila cheia.")
        }
    }

    override fun desenfileirar(): Any? {
        var dadoInicio: Any? = null
        if (!vazia()) {
            dadoInicio = dados[ponteiroInicio]
            ponteiroInicio++
        } else {
            println("Fila vazia.")
        }
        return dadoInicio
    }

    override fun espiar(): Any? {
        return if (!vazia()) {
            dados[ponteiroInicio]
        } else {
            println("Fila vazia.")
            null
        }
    }

    override fun imprimir() {
        if (!vazia()) {
            for (i in ponteiroInicio..ponteiroFim) {
                println("[" + dados[i] + "] ")
            }
        } else {
            println("Fila vazia.")
        }
    }
}
