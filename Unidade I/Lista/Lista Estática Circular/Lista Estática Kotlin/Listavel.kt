interface Listavel {
    // Metodos Fundamentais
    fun anexar(dado: Any?)                  //c
    fun inserir(posicao: Int, dado: Any?)   //c
    fun selecionar(posicao: Int): Any?      //r
    fun selecionarTodos(): Array<Any?>      //r
    fun atualizar(posicao: Int, dado: Any?) //u
    fun apagar(posicao: Int): Any?          //d

    // Metodos auxiliares
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String
}