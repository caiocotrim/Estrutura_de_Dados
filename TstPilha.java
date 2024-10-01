public class TstPilha {
    public static void main (String args[]){
        Empilhavel pilha = new Empilhamento();

        pilha.empilhar("Arrascaeta");
        pilha.empilhar("Gabi");
        pilha.empilhar("Pedro");
        //pilha.imprimir();
        
        pilha.desempilhar();
        pilha.imprimir();
    }
}