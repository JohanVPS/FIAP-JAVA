import java.util.ArrayList;

public class Colecoes_Generics {
    public static void main(String[] args) {
        ArrayList<Cliente> listaCliente = new ArrayList<>(); //tipos primitivos nao sao permitidos para utilizar o generics

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Thiago");
        Cliente cliente2 = new Cliente();
        cliente2.setNome("João");

        listaCliente.add(cliente1);
        listaCliente.add(cliente2);

        for (Cliente cliente : listaCliente) {
            ///Cliente cli = listaCliente.get(i); //Não é necessário o cast
            System.out.println(cliente.getNome());
        }
    }
}
//outros exemplos:

/*HashSet<Cliente> conjunto = new HashSet<Cliente>();

HashMap<String, Cliente> mapa = new HashMap<String, Cliente>(); */
