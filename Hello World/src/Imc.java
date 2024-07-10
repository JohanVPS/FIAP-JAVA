
import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        float peso, altura, imc;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a altura: ");
        altura = sc.nextFloat();
        System.out.println("Insira o peso: ");
        peso = sc.nextFloat();

        imc = peso / (altura * altura);
        
        System.out.println("IMC = " + imc);

        sc.close();
    }
}
