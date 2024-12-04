class Heap constructor(capacidade: Int = 10) : InterfaceHeap {
    private val arvore = arrayOfNulls<Any>(capacidade)
    private var indiceUltimo = -1

    override fun inserir(dado: Any) {
        if (!estaCheio()) {
            indiceUltimo++
            arvore[indiceUltimo] = dado
            ajustarAcima(indiceUltimo)
        } else {
            System.err.println("Heap está cheio")
        }
    }

    private fun ajustarAcima(indice: Int) {
        var indice = indice
        while (indice > 0) {
            if ((arvore[indice] as Int?)!! < (arvore[indicePai(indice)] as Int?)!!) {
                trocar(indice, indicePai(indice))
                indice = indicePai(indice)
            } else {
                break
            }
        }
    }

    private fun ajustarAbaixo(pai: Int) {
        val filhoEsquerdo = 2 * pai + 1
        val filhoDireito = 2 * pai + 2
        var menor = pai

        if (filhoEsquerdo <= indiceUltimo) {
            if ((arvore[filhoEsquerdo] as Int?)!! < (arvore[menor] as Int?)!!) {
                menor = filhoEsquerdo
            }
        }

        if (filhoDireito <= indiceUltimo) {
            if ((arvore[filhoDireito] as Int?)!! < (arvore[menor] as Int?)!!) {
                menor = filhoDireito
            }
        }

        if (menor != pai) {
            trocar(pai, menor)
            ajustarAbaixo(menor)
        }
    }

    private fun trocar(i: Int, j: Int) {
        val temp = arvore[i]
        arvore[i] = arvore[j]
        arvore[j] = temp
    }

    override fun extrair(): Any? {
        var raiz: Any? = null
        if (!estaVazio()) {
            raiz = arvore[0]
            arvore[0] = arvore[indiceUltimo]
            indiceUltimo--
            ajustarAbaixo(0)
        } else {
            System.err.println("Heap está vazio!")
        }
        return raiz
    }

    override fun obterRaiz(): Any? {
        var valorMinimo: Any? = null
        if (!estaVazio()) {
            valorMinimo = arvore[0]
        }
        return valorMinimo
    }

    override fun estaVazio(): Boolean {
        return (indiceUltimo == -1)
    }

    override fun estaCheio(): Boolean {
        return (indiceUltimo == arvore.size - 1)
    }

    override fun imprimir(): String {
        var resultado = "["
        for (i in 0 until indiceUltimo + 1) {
            if (i == indiceUltimo) {
                resultado += arvore[i]
            } else {
                resultado += "${arvore[i]},"
            }
        }
        return "$resultado]"
    }

    // Método auxiliar para obter o índice do pai
    private fun indicePai(indice: Int): Int {
        return (indice - 1) / 2
    }
}
