class Empilhamento(private var tamanho: Int = 10) : Empilhavel {
    private var ponteirotopo: Int = -1
    private var dados: Array<Any?> = arrayOfNulls(tamanho)

    constructor() : this(10) // Sobrecarga de construtor para tamanho padrão

    override fun cheia(): Boolean {
        return ponteirotopo == dados.size - 1
    }

    override fun vazia(): Boolean {
        return ponteirotopo == -1
    }

    override fun empilhar(dado: Any) {
        if (!cheia()) {
            ponteirotopo++
            dados[ponteirotopo] = dado
        } else {
            println("Não é possível empilhar. Pilha cheia.")
        }
    }

    override fun desempilhar(): Any? {
        var dadotopo: Any? = null
        if (!vazia()) {
            dadotopo = dados[ponteirotopo]
            ponteirotopo--
        } else {
            println("Não é possível desempilhar. Pilha vazia")
        }
        return dadotopo
    }

    override fun imprimir() {
        for (i in 0..ponteirotopo) {
            if (i < ponteirotopo) {
                print("[" + dados[i] + "], ")
            } else if (i == ponteirotopo) {
                println("[" + dados[i] + "]")
            }
        }
    }

    override fun topo(): Any? {
        var dadotopo: Any? = null
        if (!vazia()) {
            dadotopo = dados[ponteirotopo]
        } else {
            println("Não existe dado no topo. A pilha está vazia.")
        }
        return dadotopo
    }
}