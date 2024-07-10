import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;//consulta
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;//inserçao de dados

//base:

// public class TesteView {
// 	public static void main(String[] args) throws SQLException {
// 		Connection conexao;
// 		try {
// 			//Registra o Driver
// 			Class.forName("com.mysql.cj.jdbc.Driver");

// 			//Abre uma conexão
// 			conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/teste-fiap", "root", "");
			
// 			System.out.println("Conectado!");
			
// 			Statement stmt = conexao.createStatement();
// 			stmt.executeUpdate("INSERT INTO TAB_COLABORADOR(NOME, EMAIL, SALARIO, DATA_CONTRATACAO) VALUES ('Leandro', 'leandro@gmail.com', 1500, STR_TO_DATE('17/01/2005','%d/%m/%Y'))");
				
// 			//stmt.executeUpdate("UPDATE TAB_COLABORADOR SET SALARIO = 5000 WHERE CODIGO_COLABORADOR = 1");
	
// 			ResultSet rs = stmt.executeQuery("SELECT * FROM TAB_COLABORADOR");
// 			System.out.println(rs);

// 			//stmt.executeUpdate("DELETE FROM TAB_COLABORADOR WHERE CODIGO_COLABORADOR = 1");	
	

// 			//Fecha a conexão
// 			conexao.close();
			
// 		//Tratamento de erro	
// 		} catch (SQLException e) {
// 			System.err.println("Não foi possível conectar no Banco de Dados");
// 			e.printStackTrace();
// 		} catch (ClassNotFoundException e) {
// 			System.err.println("O Driver JDBC não foi encontrado!");
// 			e.printStackTrace();
// 		}
// 	}
// }

//Consulta:

public class TesteView {
	public static void main(String[] args) {
		try {
			//Registra o Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//Abre uma conexão
			Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/teste-fiap", "root", "");
					
			System.out.println("Conectado!");
					
			PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM TAB_COLABORADOR WHERE NOME = ?");
			stmt.setString(1, "Leandro");
			ResultSet result = stmt.executeQuery();
				
			//Percorre todos os registros encontrados
			while (result.next()){
				//Recupera os valores de cada coluna
				int codigo = result.getInt("CODIGO_COLABORADOR");
				String nome = result.getString("NOME");
				String email = result.getString("EMAIL");
				double salario = result.getDouble("SALARIO");
				java.sql.Date data = result.getDate("DATA_CONTRATACAO");
				//Exibe as informações do registro
				System.out.println(codigo + " " + nome + " " + email + " " + salario + " " + data);
			}
				
			//Fecha a conexão
			conexao.close();
				
			//Tratamento de erro	
		} catch (SQLException e) {
			System.err.println("Não foi possível conectar no Banco de Dados");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("O Driver JDBC não foi encontrado!");
			e.printStackTrace();
		}
	}
}