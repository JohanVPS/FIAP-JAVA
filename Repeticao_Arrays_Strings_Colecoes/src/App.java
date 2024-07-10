import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        //int notas[] = new int[]{10,9,8,2}; - Modelo de declaracao e inicializacao

        Scanner sc = new Scanner(System.in);
        float notas[] = new float[10];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota do aluno");
            notas[i] = sc.nextFloat();
        }
        for (float nota : notas) {//outra forma de acessar os elementos de um vetor primitivo - <tipo> <variavel> : <vetor>
            System.out.println(nota);
        }
        sc.close();
    }
}

/*for (Carro carro : carros) {
  System.out.println(carro.getModelo());
} */

/*
Carro[] carros = new Carro[5];
Carro carro = new Carro();
carro.setModelo("Gol");
carros[0] = carro;
*/

//------------------------------------------STRINGS-----------------------------------------------------------------


