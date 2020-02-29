package inserirtabela;
import java.sql.*;
/**
 *
 * @author Victor Manuel - 1302
 */
public class InserirTabela {
    public static void main(String[] args) {
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "javadb";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url+dbName,userName,password);
            try {
               Statement st = conn.createStatement();
               String table = "INSERT employee VALUES(13,'Aman')";
               st.executeUpdate(table);
               System.out.println("Inserido com sucesso");
            } catch(SQLException s) {
                s.printStackTrace();
               System.out.println("Falha ao inserir");
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
