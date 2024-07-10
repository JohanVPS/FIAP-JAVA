import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Lê os dois números
        try (Scanner sc = new Scanner(System.in)) {
            // Lê os dois números
            System.out.println("Primeiro numero: ");
            int numero1 = sc.nextInt();
            System.out.println("Segundo numero: ");
            int numero2 = sc.nextInt();
            try {
                // Realiza a divisão
                int divisao = numero1 / numero2;
                // Exibe o resultado
                System.out.println("O resultado é: " + divisao);
            } catch (ArithmeticException e) {
                System.err.println("Erro ao dividir!");
            }
        }
        catch(NullPointerException e){
            System.err.println("Erro");
        }    
    }
}
