import java.util.HashSet;

public class Colecoes_Set {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        HashSet cursos = new HashSet<>();
        cursos.add("Java");
        cursos.add(".NET");
        cursos.add("Android");

        cursos.add("Java"); //Repetido!

        //Imprime todos os elementos
        System.out.println(cursos);
    }
}

//Colecoes set nao pode conter valores repetidos