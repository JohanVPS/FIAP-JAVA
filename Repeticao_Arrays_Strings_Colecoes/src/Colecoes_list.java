import java.util.ArrayList;

public class Colecoes_list {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        ArrayList lista = new ArrayList();
        lista.add("LTP");
        lista.add("Web");
        lista.add("Algoritmos");

        System.out.println(lista);

        lista.set(1, "Set");

        System.out.println(lista);

        lista.remove(1);

        System.out.println(lista);
        System.out.println(lista.get(1));

        lista.add("Web");
        System.out.println("");
        for(int i = 0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }

        int indice = lista.indexOf("Web"); // .lastIndexOf() funcina de forma parecida

        System.out.println("O valor \"Web\" está na posição: " + indice);
    }
}
