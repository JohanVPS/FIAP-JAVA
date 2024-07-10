public class String_Inicializacao_concatenacao {
    public static void main(String[] args) {
        //String nome = new String();
        //nome = "FIAP";              //o mesmo que: String nome = new String("FIAP");   ou   String nome = "FIAP";

        String nome = "FIAP";    
        String slogan = "A melhor faculdade de tecnologia";

        String faculdade = nome;
        faculdade += " - ";
        faculdade += slogan;

        System.out.println(faculdade);

        //O mesmo que:
        /*String nome = "FIAP";
        String slogan = "A melhor faculdade de tecnologia";
        String faculdade = nome.concat(" - ").concat(slogan);   ou   String faculdade = nome.concat(" - ") + slogan;
        System.out.println(faculdade);*/

    }
}
