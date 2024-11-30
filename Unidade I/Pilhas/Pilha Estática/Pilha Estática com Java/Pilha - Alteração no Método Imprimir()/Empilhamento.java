public class Empilhamento implements Empilhavel {
    private int ponteirotopo;
    private Object[] dados;

    public Empilhamento(int tamanho){
        ponteirotopo = -1;
        dados = new Object[tamanho];
    }

    //Sobrecarga de construtor para definir o tamanho padrão do array
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
    public void empilhar(Object dado){
        if(!cheia()){
            ponteirotopo++;
            dados[ponteirotopo] = dado;
        } else {
            System.out.println("Não é possível empilhar. Pilha cheia.");
        }
    }

    @Override 
    public Object desempilhar(){
        Object dadotopo = null;
        if(!vazia()){
            dadotopo = dados[ponteirotopo];
            ponteirotopo--;
        } else {
            System.out.println("Não é possível desempilhar. Pilha vazia");
        }
        return dadotopo;
    }

    @Override
    public void imprimir(){
        for(int i = 0; i <= ponteirotopo; i++){
            if(i < ponteirotopo){
                System.out.print("[" + dados[i] + "], ");
            } else if (i == ponteirotopo) {
                System.out.println("[" + dados[i] + "]");
            }
        }
    }

    @Override
    public Object topo(){
        Object dadotopo = null;
        if(!vazia()){
            dadotopo = dados[ponteirotopo];
        } else {
            System.out.println("Não existe dado no topo. A pilha está vazia.");
        }
        return dadotopo;
    }


}
