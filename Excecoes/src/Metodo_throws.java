import java.io.FileNotFoundException;
import java.io.IOException;

public class Metodo_throws {
    public void gravarArquivo(String valor) throws SecurityException, FileNotFoundException, IOException{
		//Código...
    }
}

/*public void depositar(double valor){
  if (valor < 0){
    throw new IllegalArgumentException();
  }
  saldo = saldo + valor;
}

public static void main(String[] args) {
  
  // Cria uma nova instância de Conta
  Conta c = new Conta();
  try {
    // Saca
    c.sacar(100);
  } catch (Exception e) {
    e.printStackTrace();
  }
  // Deposita
  c.depositar(200);

}  

*/