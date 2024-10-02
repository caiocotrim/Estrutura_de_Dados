fun main() {
    val pilha: Empilhavel = Empilhamento()

    pilha.empilhar("rg")
    pilha.empilhar("cpf")
    pilha.empilhar("cnh")
    pilha.empilhar("titulo de eleitor")
    pilha.empilhar("tipo sanguineo")

    pilha.imprimir()
    println(pilha.topo())
    println(pilha.cheia())
    println(pilha.vazia())

    pilha.desempilhar()
    pilha.imprimir()
}