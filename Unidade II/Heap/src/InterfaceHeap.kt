interface InterfaceHeap {
    fun inserir(dado: Any)
    fun extrair(): Any?
    fun obterRaiz(): Any?

    fun imprimir(): String
    fun estaVazio(): Boolean
    fun estaCheio(): Boolean
}
