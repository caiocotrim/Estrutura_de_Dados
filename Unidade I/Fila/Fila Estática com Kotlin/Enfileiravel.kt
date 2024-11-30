interface Enfileiravel {
    fun enfileirar(dado: Any?)
    fun desenfileirar(): Any?
    fun espiar(): Any?

    fun cheia(): Boolean
    fun vazia(): Boolean
    fun imprimir()
}