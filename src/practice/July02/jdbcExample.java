package practice.July02;

import java.sql.*;

public class jdbcExample {
    public static void main(String[] args){
    String url = "jdbc:mysql://localhost:3306/";
    String username = "root";
    String password = "";

    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,password);

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM testdb.Persons");

        while (rs.next()){
            System.out.println(rs.getInt("PersonID") + "||" +
                    rs.getString("LastName") + "||" +
                    rs.getString("FirstName") + "||" +
                    rs.getString("Address") + "||" +
                    rs.getString("City"));
        }
        rs.close();
        st.close();
        con.close();
    }catch (Exception e) {
       e.printStackTrace();
    }
    }

}
