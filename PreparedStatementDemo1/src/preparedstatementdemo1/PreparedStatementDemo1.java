package preparedstatementdemo1;

import java.sql.*;
import java.io.*;

public class PreparedStatementDemo1 {

    Connection con;
    PreparedStatement ps;

    public PreparedStatementDemo1() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String addCustomer(String idcliente, String clientenome, String clienteend, String clientefone) {
        String status = "";
        try {
            ps = con.prepareStatement("insert into cliente values(?,?,?,?)");
            ps.setString(1, idcliente);
            ps.setString(2, clientenome);
            ps.setString(3, clienteend);
            ps.setString(4, clientefone);
            int i = ps.executeUpdate();
            if (i != 0) {
                status = "Cliente Inserido com sucesso";
            } else {
                status = "Cliente não inserido";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    public String editCustomer(String idcliente, String clientenome, String clienteend, String clientefone) {
        String status = "";
        try {
            ps = con.prepareStatement("update cliente set clienteend=?,clientefone=? where idcliente=?");
            ps.setString(1, clienteend);
            ps.setString(2, clientefone);
            ps.setString(3, idcliente);
            int i = ps.executeUpdate();
            if (i != 0) {
                status = "Detalhes do cliente atualizado com sucesso";
            } else {
                status = "Detalhes do cliente não atualizados ";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    public void searchCustomer(String idcliente) {
        String sql = "";
        
        sql = "select * from cliente where idcliente= '" + idcliente + "'";
        
        try {
            ps = con.prepareStatement(sql);
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                System.out.println(res.getString(1));
                System.out.println(res.getString(2));
                System.out.println(res.getString(3));
                System.out.println(res.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String deleteCustomer(String idcliente) {
        String status = "";
        try {
            ps = con.prepareStatement("delete from cliente where idcliente=?");
            ps.setString(1, idcliente);
            int i = ps.executeUpdate();
            if (i != 0) {
                status = "Detalhes do cliente deletados do database";
            } else {
                status = "Cliente não deletado do database";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    public void menuDisplay() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int ch = 0;
            while (true) {
                System.out.println("========== Customer Management System ================ \n"
                        + " 1. Add Cliente \n "
                        + "2. Editar cliente details \n "
                        + "3. Deletar Cliente \n "
                        + "4. Mostrar detalhes do cliente \n "
                        + "5. Sair \n"
                        + "Entre com a opção desejada \n");
                String str1 = br.readLine().toString();
                ch = Integer.parseInt(str1);
                switch (ch) {
                    case 1: {
                        System.out.println("Entre com o ID do cliente: ");
                        String idcliente = br.readLine();
                        System.out.println("Enter com o nome do cliente: ");
                        String clientenome = br.readLine();
                        System.out.println("Entre com o endereço do cliente: ");
                        String clienteend = br.readLine();
                        System.out.println("Entre com o telefone do cliente: ");
                        String clientefone = br.readLine();
                        System.out.println(addCustomer(idcliente, clientenome, clienteend, clientefone));

                        break;
                    }
                    case 2: {
                        System.out.println("Endereço do cliente, telefone e nome podem ser alterados usando o ID do cliente");
                        System.out.println("Entre com o ID do cliente: ");
                        String idcliente = br.readLine();
                        System.out.println("Atualizar o nome do cliente: ");
                        String clientenome = br.readLine();
                        System.out.println("Atualizar o novo endereço do cliente: ");
                        String clienteend = br.readLine();
                        System.out.println("Atualizar o novo telefone de contato do cliente");
                        String clientefone = br.readLine();
                        System.out.println(editCustomer(idcliente,clientenome, clienteend, clientefone));
                        break;
                    }
                    case 3: {
                        System.out.println("Entre com o Id do cliente para deletar do database ");
                        String idcliente = br.readLine();
                        System.out.println(deleteCustomer(idcliente));
                        break;
                    }
                    case 4: {
                        System.out.println("Entre com o ID do cliente para mostrar seus registros ");
                        String idcliente = br.readLine();
                        searchCustomer(idcliente);
                        break;
                    }
                    case 5: {
                        System.exit(0);
                    }
                    default:
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PreparedStatementDemo1 obj = new PreparedStatementDemo1();
        obj.menuDisplay();
    }
}
