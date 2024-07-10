public class String_Comparacao {
    public static void main(String[] args) {
        
        String nome = "FIAP";
        String nome2 = "FIAP";
        if (nome == nome2){
            System.out.println("As Strings são iguais");
        }else{
            System.out.println("As Strings são diferentes");
        }
        
        //O mesmo que:
        
        if (nome.equals(nome2)){
            System.out.println("As Strings são iguais");
        }else{
            System.out.println("As Strings são diferentes");
        }

    }
}

//Nao dara certo pois as variaveis foram instanciadas com new, alocando em espacos diferentes de memoria

    /*String nome = new String("FIAP");
    String nome2 = new String("FIAP");
    if (nome == nome2){
        System.out.println("As Strings são iguais");
    }else{
        System.out.println("As Strings são diferentes"); */
    
    
//Para ignorar maiusculas e minusculas - metodo .equalsIgnoreCase
    
    /*String nome = "fiap";
    String nome2 = new String("FIAP");
    if (nome.equalsIgnoreCase(nome2)){
        System.out.println("As Strings são iguais");
    }else{
        System.out.println("As Strings são diferentes ");
    } */
    
//Para verificar se duas strings começam da mesma forma - metodo .startsWith

    /*String facu = "FIAP - A Melhor Faculdade de Tecnologia";
    if (facu.startsWith("FIAP")){
        System.out.println("A string começa com FIAP");
    }else{
        System.out.println("A string não começa com FIAP");
    } */

//Para verificar se as duas strings terminam da mesma forma - metodo .endsWith

    /*String facu = "FIAP - A Melhor Faculdade de Tecnologia";
    if (facu.endsWith("gia")){
        System.out.println("A string termina com gia");
    }else{
        System.out.println("A string não termina com gia");
    } */

//Para contar os caracteres de uma string - metodo .lenght

    /*String facu = "FIAP - A Melhor Faculdade de Tecnologia";
    int caracteres = facu.length();
    System.out.println("A string possui " + caracteres + " caracteres"); */

//Para obter o caractere de uma string - metodo .charAt

    /*String facu = "FIAP - A Melhor Faculdade de Tecnologia";
    char caracter = facu.charAt(1);
    System.out.println("O segundo caracter da string é " + caracter); */

//Para obter o indice da primeira ocorrencia de um caracter ou sequencia deles - metodo .indexOf (caso nao seja encontrado, retornara -1)

    /*String facu = "FIAP - A Melhor Faculdade de Tecnologia";
    int posicao = facu.indexOf('a');
    System.out.println("O índice do caracter 'a' na string é " + posicao); */

    /*String facu = "FIAP - A Melhor Faculdade de Tecnologia";
    int posicao = facu.indexOf("Faculdade");
    System.out.println("O índice da palavra \"Faculdade\" na string é " + posicao); */

//Para obter o indice da ultima ocorrencia - metodo .lastIndexOf

    /*String facu = "FIAP - A Melhor Faculdade de Tecnologia, Faculdade";
    int posicao = facu.lastIndexOf("Faculdade");
    System.out.println("O índice da última palavra \"Faculdade\" na string é " + posicao); */

//Para obter somente uma parte da string - metodo .substring

    /*String facu = "FIAP - A Melhor Faculdade de Tecnologia";
    String nova = facu.substring(16, 25); - é possivel omitir o segundo parametro e tambem utiliar em conjunto com outros metodos
    System.out.println("A nova string é: " + nova); */

//Para modificar de minusculas para maiusculas (toUpperCase) e de maiusculas para minusculas (toLowerCase)

    /*String facu = "FIAP - A Melhor Faculdade de Tecnologia";
    String nova = facu.toUpperCase(); - Se nao houver uma nova variavel para armazenar o retorno do metodo, nao funcionará, pois a funcao nao altera a string original
    System.out.println("A nova string é: " + nova); */

//Para trocar um caracter ou sequencia por outro(a) - metodo .replace

    /*String facu = "FIAP - A Melhor Faculdade de Tecnologia";
    String nova = facu.replace('a', 'x');
    System.out.println("A nova string é: " + nova);
    System.out.println("Valor da variável facu: " + facu); */

//Para separar uma string em varias strings separadas por um delimitador - metodo .split

    /*String facu = "FIAP - A Melhor Faculdade de Tecnologia";
    String[] palavras = facu.split(" ");
    for (String p : palavras) {
        System.out.println(p);
    } */





    