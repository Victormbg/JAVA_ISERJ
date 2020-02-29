package createTable;
import java.sql.*;
/**
 *
 * @author Victor Manuel - 1302
 */
public class CreateTable {
    public static void main(String[] args) {
        System.out.println("MySQL exemplo de conexão.");
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "javadb";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        try{
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url+dbName,userName,password);
            try{
                Statement st = con.createStatement();
                String table = "create table employee(Emp_code integer, Emp_name varchar(10))";
                st.executeUpdate(table);
                System.out.println("A tabela foi criada com sucesso");
            }catch(SQLException s){
                System.out.println("A tabela já existe");
            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }                   
    }
}
