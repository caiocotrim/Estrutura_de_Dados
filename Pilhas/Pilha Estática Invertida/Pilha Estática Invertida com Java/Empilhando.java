//PILHA INVERTIDA
public class Empilhando implements Empilhavel {
    private int ponteirotopo;
    private Object[] dados;
    private int tamanho;

    public Empilhando(int tamanho){
        this.tamanho = tamanho;
        ponteirotopo = tamanho; //ponteirotopo recebe o tamanho da pilha para começar a operar de cima para baixo.
        dados = new Object[tamanho];
    }

    public Empilhando(){
        this(10);
    }

    @Override
    public boolean cheia(){
        return (ponteirotopo == 0); //ponteirotopo inicia = tamanho, logo, para a empilha estar cheia, ele tem que apontar para 0
    }

    @Override
    public boolean vazia(){
        return (ponteirotopo == dados.length); //ponteirotopo inicia = tamanho, logo, se ele aponta para tamanho, significa que a pilha está vazia
    }
    
    @Override
    public void empilhar(Object dado){
        if(!cheia()){
            ponteirotopo--;
            dados[ponteirotopo] = dado; 
        } else {
            System.out.println("Não é possível empilhar. A pilha está cheia.");
        }
    }

    @Override
    public Object desempilhar(){
        Object dadotopo = null;
        if(!vazia()) {
            dadotopo = dados[ponteirotopo];
            ponteirotopo++;   
        } else {
            System.out.println("Não é possível desempilhar. A pilha está vazia.");
        }
        return dadotopo;
    }

    @Override
    public Object topo(){
        Object dadotopo = null;
        if(!vazia()){
            dadotopo = dados[ponteirotopo];
        } else {
            System.out.println("Não há dado no topo. A pilha está vazia.");
        }
        return dadotopo;
    }

    @Override
    public void imprimir(){
        for (int i = ponteirotopo; i < tamanho; i++) {
            System.out.print("[" + dados[i] + "] ");
        }
    }


}
