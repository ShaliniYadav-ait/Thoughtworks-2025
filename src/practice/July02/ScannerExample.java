package practice.July02;

import java.sql.*;
import java.util.Scanner;

public class ScannerExample {

        public static void main(String[] args){
            login userDetails = getLogin();
            Result result = getResult();

            try{
                updateDB(userDetails, result);
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

    private static void updateDB(login userDetails, Result result) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(userDetails.url(), userDetails.username(), userDetails.password());

        String sql = "INSERT INTO testdb.Persons (PersonID,LastName, FirstName,Address,City) VALUES (?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);

        setData(ps, result);
        int rows = ps.executeUpdate();
        if (rows > 0){
            System.out.println("Update successful.");
        }
        ps.close();
        con.close();
    }

    private static login getLogin() {
        String url = "jdbc:mysql://localhost:3306/";
        String username = "root";
        String password = "";
        return new login(url, username, password);
    }

    private record login(String url, String username, String password) {
    }

    private static void setData(PreparedStatement ps, Result result) throws SQLException {
        ps.setInt(1, result.id());
        ps.setString(2, result.lastName());
        ps.setString(3, result.firstName());
        ps.setString(4, result.address());
        ps.setString(5, result.city());
    }

    private static Result getResult() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID : ");
        int id = sc.nextInt();

        System.out.println("Enter last name : ");
        String lastName = sc.next();

        System.out.println("Enter first name : ");
        String firstName = sc.next();

        System.out.println("Enter Address : ");
        String address = sc.next();

        System.out.println("Enter City : ");
        String city = sc.next();

        Result result = new Result(id, lastName, firstName, address, city);
        return result;
    }

    private record Result(int id, String lastName, String firstName, String address, String city) {
    }

}

