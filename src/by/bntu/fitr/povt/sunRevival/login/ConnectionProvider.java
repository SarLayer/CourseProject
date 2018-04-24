package by.bntu.fitr.povt.sunRevival.login;

import java.sql.*;

public class ConnectionProvider {
    static Connection connection;
    static PreparedStatement ps;
    static String url = "jdbc:mysql://localhost:3306/logindb?autoReconnect=true&useSSL=false";
    static String username = "root";
    static String password = "rootmyroot";
    
    public static boolean login(Customer c) throws ClassNotFoundException, SQLException {
        int status=0;

       
        try {
            Class.forName("com.mysql.jdbc.Driver");
        
        
        } catch (ClassNotFoundException e) {

            System.out.println("124235123");
        }
        try {
            connection = DriverManager.getConnection(url, username, password);
            
    
        } catch (SQLException e) {
            
        
        }


        
        try{


            Statement statement = connection.createStatement();

            ResultSet resultSet =statement.executeQuery("SELECT * FROM customer");

    
            while (resultSet.next()){

                if(resultSet.getString(1).equals(c.getLogin()) && resultSet.getString(2).equals(c.getPassword())){
               return true;}
            }
        }catch (Exception e){
        
        
        }
        return false;
    }
    public int insertCustomer(Customer c) throws ClassNotFoundException, SQLException {
        
        
            Class.forName("com.mysql.jdbc.Driver");

       
        try {
            connection = DriverManager.getConnection(url, username, password);
            
            
        } catch (SQLException e) {

        }
        try{
    
            Statement statement = connection.createStatement();

    
            ps=connection.prepareStatement("INSERT  INTO customer(login, password) VALUES (?,?)");

            ps.setString(1,c.getLogin());
            ps.setString(2,c.getPassword());
            ps.executeUpdate();

            
        }catch (Exception e){
            System.out.println("wertre");
        }
        return 0;
    }
    }
    
    

        
        
