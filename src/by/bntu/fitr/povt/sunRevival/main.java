package by.bntu.fitr.povt.sunRevival;

import by.bntu.fitr.povt.sunRevival.login.ConnectionProvider;
import by.bntu.fitr.povt.sunRevival.login.Customer;

import java.sql.*;

public class main {
    static Connection connection;
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ConnectionProvider cd = new ConnectionProvider();
        System.out.println(cd.login(new Customer("qweqwe","qwegb")));
    }
}

