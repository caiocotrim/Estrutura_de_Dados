class TesteLista {
    fun main() {
        var lista: Listavel = ListaEstaticaCircular()
        lista.anexar("Caio")  
        lista.anexar("Cotrim")   
        lista.inserir(1,"Pereira")
        println("${lista.imprimir()}")
        lista.anexar("Pereira")   
        lista.apagar(0) 
        lista.inserir(0,"Cotrim")   
        lista.inserir(2,"Caio");	
        println("${lista.imprimir()}") 
        println("${lista.selecionar(1)}")
        lista.atualizar(1,"G")
        println("${lista.imprimir()}")  
    }
}    