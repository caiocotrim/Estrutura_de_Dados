public class PilhaEstaticaInversa {
    public static void main (String args []){
        Empilhavel pilha = new Empilhando();

        pilha.empilhar("Pedro");
        pilha.empilhar("Gabigol");
        pilha.empilhar("Carlinhos Aura.");
        pilha.imprimir();
        
        System.out.println();
        pilha.desempilhar();
        pilha.imprimir();

    }
}
