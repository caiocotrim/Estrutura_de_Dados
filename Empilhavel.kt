interface Empilhavel {
    // Métodos Fundamentais
    fun empilhar(dado: Any)
    fun desempilhar(): Any?
    fun topo(): Any?

    // Métodos Auxiliares
    fun cheia(): Boolean
    fun vazia(): Boolean
    fun imprimir()
}