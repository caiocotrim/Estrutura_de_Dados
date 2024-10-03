class Empilhando : Empilhavel {
    private var ponteirotopo: Int
    private var dados:  Array<Any?>

    constructor(tamanho: Int){
        ponteirotopo = tamanho
        dados = arrayOfNulls(tamanho)
    }

    constructor(): this(10)

    override fun cheia(): Boolean {
        return (ponteirotopo == 0)
    }

    override fun vazia(): Boolean {
        return (ponteirotopo == dados.size)
    }

    override fun empilhar(dado: Any?) {
        if(!cheia()) {
            ponteirotopo--
            dados[ponteirotopo] = dado
        } else {
            println("Não é possível empilhar. A pilha está cheia.")
        }
    }

    override fun desempilhar(): Any? {
        var dadotopo: Any? = null;
        if(!vazia()){
            dados[ponteirotopo] = dadotopo
            ponteirotopo++
        } else {
            println("Não é possível desempilhar. A pilha está vazia.")
        }
        return dadotopo
    }

    override fun topo(): Any? {
        var dadotopo: Any? = null;
        if(!vazia()){
            dadotopo = dados[ponteirotopo]
        } else {
            println("Não há dado no topo. A pilha está vazia.")
        }
        return dadotopo
    }

    override fun imprimir(): Unit {
        for(i in ponteirotopo downTo dados.size + 1){
            println("[" + dados[i] + "]")
        }
    }

}