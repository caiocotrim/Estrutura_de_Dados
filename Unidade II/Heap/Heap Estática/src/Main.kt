fun main() {
    val heap: InterfaceHeap = Heap(10)

    heap.inserir(1)
    heap.inserir(2)
    heap.inserir(5)
    heap.inserir(6)

    println(heap.imprimir())
    println(heap.obterRaiz())
    println(heap.estaCheio())
    println(heap.extrair())
    println(heap.imprimir())
    println(heap.estaVazio())
}