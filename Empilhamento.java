public class Empilhamento implements Empilhavel {
    private int ponteirotopo;
    private Object[] dados;

    public Empilhamento(int tamanho){
        ponteirotopo = -1;
        dados = new Object[tamanho];
    }

    //Sobrecarga de construtor que define o tamanho padrão da Pilha caso o usuário não definir
    public Empilhamento(){
        this(10);
    }

    @Override
    public boolean cheia(){
        return (ponteirotopo == dados.length - 1);
    }

    @Override
    public boolean vazia(){
        return (ponteirotopo == -1);
    }

    @Override
    public void imprimir(){
        for(int i = 0; i <= ponteirotopo; i++) {
           System.out.println("[" + dados[i] + "] "); 
        }
    }
    
    @Override
    public void empilhar(Object dado){
        if(!cheia()){
            ponteirotopo++;
            dados[ponteirotopo] = dado;
        } else {
            System.out.println("Não foi possível realizar o empilhamento. A pilha já se encontra cheia.");
        }
    }

    @Override
    public Object desempilhar(){
        Object dadotopo = null;
        if(!vazia()){
            dadotopo = dados[ponteirotopo];
            ponteirotopo--;
        } else {
            System.out.println("Não foi possível desempilhar. A pilha já se encontra vazia.");
        }
        return dadotopo;
    }

    @Override
    public Object topo(){
        Object dadotopo = null;
        if(!vazia()) {
            dadotopo = dados[ponteirotopo];
        } else {
            System.out.println("A Pilha está vazia.");
        }
        return dadotopo;
    }
    
}
