import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws SQLException {
        try (Connection conexao = conectar()) {
            int op = -7, confirm = -7;
            ResultSet result;
            Statement stmt = conexao.createStatement();
            PreparedStatement preStmt;
            int codigo;
            String inputNome, inputEmail, inputDataContratacao;

            do {
                try {
                    op = Integer.parseInt(JOptionPane.showInputDialog(null, "1. CREATE\n2. READ ALL\n3. UPDATE\n4. DELETE\n5. EXIT", "Menu", 1));
    
                    
                    switch(op){
                        case 1:
                            Double inputSalario;
                            
                            inputNome = JOptionPane.showInputDialog(null, "Insira o nome do colaborador!", "Nome", 1);
                            inputEmail = JOptionPane.showInputDialog(null, "Insira o email do colaborador!", "Email", 1);
                            inputDataContratacao = JOptionPane.showInputDialog(null, "Insira a data de contratação do colaborador!", "Data de Contratação", 1);
                            inputSalario = Double.valueOf(JOptionPane.showInputDialog(null, "Insira o salario do colaborador!", "Salario", 1));

                            stmt.executeUpdate("INSERT INTO TAB_COLABORADOR(NOME, EMAIL, SALARIO, DATA_CONTRATACAO) VALUES ('" + inputNome + "', '" + inputEmail + "', " + inputSalario + ", STR_TO_DATE('" + inputDataContratacao + "','%d/%m/%Y'))");

                            JOptionPane.showMessageDialog(null, "Dados inseridos no BD!");
                        break;
    
                        case 2:
                            preStmt = conexao.prepareStatement("SELECT * FROM TAB_COLABORADOR");
                            result = preStmt.executeQuery();
                            String str = "DADOS DA TABELA\n\n";

                            while(result.next()){
                                codigo = result.getInt("CODIGO_COLABORADOR");
                                String nome = result.getString("NOME");
                                String email = result.getString("EMAIL");
                                double salario = result.getDouble("SALARIO");
                                java.sql.Date data = result.getDate("DATA_CONTRATACAO");
                                str += "Codigo: " + codigo + " | Nome: " + nome + " | Email: " + email + " | Salario:" + salario + " | Data de contratacao: " + data + "\n\n";
                            }

                            JOptionPane.showMessageDialog(null, str);
                        break;
    
                        case 3:
                            codigo = Integer.parseInt(JOptionPane.showInputDialog("Insira o codigo do colaborador que deseja alterar a informacao:"));
                            inputEmail = JOptionPane.showInputDialog("Insira o novo email do colaborador ou repita o email ja existente:");
                            inputSalario = Double.valueOf(JOptionPane.showInputDialog("Insira o novo salario ou repita o salario ja existente:"));
                            try{
                                preStmt = conexao.prepareStatement("UPDATE TAB_COLABORADOR SET SALARIO = ?, EMAIL = ? WHERE CODIGO_COLABORADOR = ?");
                                preStmt.setDouble(1, inputSalario);
                                preStmt.setString(2, inputEmail);
                                preStmt.setInt(3, codigo);

                                preStmt.executeUpdate();
                                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!", "Alteracao bem sucedida", 1);
                            } catch (Exception e){
                                JOptionPane.showMessageDialog(null, e.getMessage());
                            }
                        break;
    
                        case 4:
                            codigo = Integer.parseInt(JOptionPane.showInputDialog("Insira o codigo do colaborador que deseja excluir do banco de dados:"));
                            preStmt = conexao.prepareStatement("DELETE FROM TAB_COLABORADOR WHERE CODIGO_COLABORADOR = ?");
                            preStmt.setInt(1, codigo);

                            preStmt.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Colaborador excluido do banco de dados com sucesso!", "Alteracao bem sucedida", 1);
                        break;

                        case 5:
                            confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Selecione uma opcao!", 1);
                            if(confirm != JOptionPane.YES_OPTION){
                                JOptionPane.showMessageDialog(null, "Voltando ao menu!");
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Saindo!");
                            }
                        break;
    
                        default:
                            JOptionPane.showMessageDialog(null, "Insira uma opção válida!", "Opcao inválida", 1);
                        break;
                    }
                    
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Para sair, escolha a opcao 5. Opcao de cancelar será considerada inválida!", "ERRO - OPCAO INVALIDA", 1);
                }
                

            } while (confirm != JOptionPane.YES_OPTION);

            conexao.close();
        } catch (NullPointerException e){
            JOptionPane.showMessageDialog(null, "Variavel conexao é null", "Erro - NullPointerException", 1);
        }

    }

    public static Connection conectar(){
        Connection conexao = null;
        final String driver = "com.mysql.cj.jdbc.Driver";
        final String conn = "jdbc:mysql://localhost:3306/teste-fiap";
        final String user = "root";
        final String password = "";
        try {
            Class.forName(driver);

            conexao = DriverManager.getConnection(conn, user, password);

            JOptionPane.showMessageDialog(null, "Conectado!", "Conexão - status", 1);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Nao foi possível se conectar ao Banco de Dados!", "Conexão - status", 1);
            erro.printStackTrace();
        } catch (ClassNotFoundException erro){
            JOptionPane.showMessageDialog(null, "O Driver JDBC não foi encontrado!", "Conexão - status", 1);
            erro.printStackTrace();
        }

        return conexao;
    }
}
