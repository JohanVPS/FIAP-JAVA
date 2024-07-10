import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leitura {
    public static void main(String[] args) {
  
        try {
            //Abre o arquivo
            FileReader stream = new FileReader("arquivo.txt");
            BufferedReader reader = new BufferedReader(stream);

            //Lê uma linha do arquivo
            String linha = reader.readLine();
            while (linha != null){
                System.out.println(linha);
                //Lê a próxima linha do arquivo
                linha = reader.readLine();
            }

            reader.close();
            //Fecha o arquivo
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }
}

/*public static void main(String[] args) {

	File arquivo = new File("arquivo.txt");

	// Verifica se o arquivo existe
	if (arquivo.exists()) {
		System.out.println("O arquivo existe!"+
				"
Pode ser lido: " + arquivo.canRead() +
				"
Pode ser gravado: " + arquivo.canWrite() +
				"
Tamanho: " + arquivo.length() +
				"
Caminho: " + arquivo.getPath());
	} else {
		// Cria o arquivo
		try {
			if (arquivo.createNewFile())
				System.out.println("Arquivo criado!");
			else
        System.out.println("Arquivo não criado!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
} */

/*public static void main(String[] args) {
  File diretorio = new File("fiap");
  
  if (diretorio.exists()){
    System.out.println("Diretório existe!");
  }else{
    if (diretorio.mkdir())
      System.out.println("Diretório criado!");
    else
      System.out.println("Diretório não criado.");
  }
  
  File arquivo = new File(diretorio,"file.txt");
  try {
    if (arquivo.createNewFile())
      System.out.println("Arquivo criado!");
    else
      System.out.println("Arquivo não criado!");
  } catch (IOException e) {
    e.printStackTrace();
  }
} */

/*try {
    //Abre o arquivo para escrita
    FileWriter writer = new FileWriter(arquivo);
    //Abre o arquivo para leitura
    FileReader reader = new FileReader(arquivo);
    //Código...
} catch (IOException e) {
    e.printStackTrace();
} 
//Depois, basta instanciar a classe PrintWriter para escrever no arquivo ou BufferedReader para ler    
*/


