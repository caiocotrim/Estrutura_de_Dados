interface Empilhavel {
    // métodos auxiliares
    fun estaVazia(): Boolean
    fun estaCheia(): Boolean
    fun imprimir(): String

    // métodos principais
    fun empilhar(dado: Any?)
    fun espiar(): Any?
    fun atualizar(dado: Any?)
    fun desempilhar(): Any?
}
