public class App {
    public static void main(String[] args) throws Exception {

        int total = AcessoCatraca.recuperarTotal();
        System.out.println("Total " + total);
        
        long numero = Math.round(2.9);
        System.out.println("Número arredondado: " + numero);

        AcessoCatraca a1 = new AcessoCatraca();
        a1.entrar("Thiago"); //metodo estatico -> naa sefere ao objeto mas a classe, portanto, compartilhara o mesmo valor em todos os objetos
        
        AcessoCatraca a2 = new AcessoCatraca();
        a2.entrar("Leandro");
        
        total = AcessoCatraca.recuperarTotal();
        System.out.println("Total " + total); //como o metodo entrar foi chamado duas vezes, sera totalizado duas vezes, independente dos objetos que chamaram o metodo serem diferentes

        System.out.println(Constantes.JANEIRO);
        System.out.println(Constantes.TAXA_RETIRADA);//para chamar uma constante, basta utilizar <classe>.<constante>
        
    }
}
