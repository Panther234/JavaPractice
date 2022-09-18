package exceptiondemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//either throws exception or with try and catch block

public class Account {
    public Connection getConnection() {
        String url  = "jdbc:msql://localhost:3606/";
        String user = "Prime";
        String password = "code";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public void withdraw(int amount) {
        getConnection();
        System.out.println("Withdraw: " +amount);
    }

    public static void main(String[] args) {
        Account a = new Account();
        a.withdraw(10);
    }
}
