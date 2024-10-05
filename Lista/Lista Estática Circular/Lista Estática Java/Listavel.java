public interface Listavel {
    // Métodos Fundamentais
    void anexar(Object dado);                   // c
    void inserir(int posicao, Object dado);     // c
    Object selecionar(int posicao);             // r
    Object[] selecionarTodos();                 // r
    void atualizar(int posicao, Object dado);   // u
    Object apagar(int posicao);                 // d

    // Métodos auxiliares
    boolean estaCheia();
    boolean estaVazia();
    String imprimir();
}