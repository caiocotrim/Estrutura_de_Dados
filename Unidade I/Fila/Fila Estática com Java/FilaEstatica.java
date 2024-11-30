public class FilaEstatica implements Enfileiravel{
    private int ponteiroinicio;
    private int ponteirofim;
    private Object[] dados;

    public FilaEstatica(int tamanho){
        ponteiroinicio = 0;
        ponteirofim = -1;
        dados = new Object[tamanho];
    }

    public FilaEstatica(){
        this(10);
    }

    @Override
    public boolean cheia(){
        return (ponteirofim == dados.length - 1);
    }

    @Override
    public boolean vazia(){
        return (ponteiroinicio == 0);
    }

    @Override
    public void enfileirar(Object dado){
        if(!cheia()){
            ponteirofim++;
            dados[ponteirofim] = dado;
        } else {
            System.out.println("Fila cheia.");
        }    
    }

    @Override
    public Object desenfileirar(){
        Object dadoinicio = null;
        if(!vazia()){
            dadoinicio = dados[ponteiroinicio];
            ponteiroinicio++;
        } else {
            System.out.println("Fila vazia.");
        }
        return dadoinicio;
    }

    @Override
    public Object espiar(){
        Object dadoinicio = null;
        if(!vazia()){
            dadoinicio = dados[ponteiroinicio];
        } else {
            System.out.println("Fila vazia.");
        }
        return dadoinicio;
    }

    @Override
    public void imprimir(){
        if(!vazia()){
            for(int i = ponteiroinicio; ponteiroinicio <= ponteirofim; i++){
                System.out.println("[" + dados[i] + "] ");
            }
        } else {
            System.out.println("Fila vazia.");
        }
    }
}
