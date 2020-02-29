package mysqlconnect;
import java.sql.*;
/**
 *
 * @author Victor Manuel - 1302
 */
public class MySqlConnect {
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
            System.out.println("Conexão concluida");
            con.close();
            System.out.println("Conexão perdido com  DB");
        }catch(Exception e){
            e.printStackTrace();
        }                   
    }
}
