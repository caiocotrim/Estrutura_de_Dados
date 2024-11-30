public class TesteLista {

    public static void main(String[] args) {
        Listavel lista = new Listando();

        lista.anexar("Caio");
        lista.anexar("Cotrim");
        lista.inserir(1, "Pereira");
        System.out.println(lista.imprimir());

        lista.anexar("Pereira");
        lista.apagar(0);
        lista.inserir(0, "Cotrim");
        lista.inserir(2, "Caio");
        System.out.println(lista.imprimir());

        System.out.println(lista.selecionar(1));

        lista.atualizar(1, "G");
        System.out.println(lista.imprimir());
    }
}
