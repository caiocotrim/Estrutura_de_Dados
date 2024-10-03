public interface Empilhavel {
    //Métodos Principais 
    public void empilhar(Object dado);
    public Object desempilhar();
    public Object topo();

    //Métodos Auxiliares
    public boolean cheia();
    public boolean vazia();
    public void imprimir();
}