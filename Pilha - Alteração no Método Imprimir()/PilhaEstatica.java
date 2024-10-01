public class PilhaEstatica {
    public static void main (String args[]){
        Empilhavel pilha = new Empilhamento();

        pilha.empilhar("rg");
        pilha.empilhar("cpf");
        pilha.empilhar("cnh");
        pilha.empilhar("titulo de eleitor");
        pilha.empilhar("tipo sanguineo");
        //pilha.desempilhar();

        pilha.imprimir();
    }
}
