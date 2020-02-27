package com.kakarotamasu.Database;
import java.sql.*;
import java.util.logging.Logger;

public class Database  {

    private String url = "jdbc:mysql://localhost:3306/bukhsh_petroleum";
    private String username = "root";
    String password = "root";
    private Connection connection = DriverManager.getConnection(url, username, password);
    private Statement statement = connection.createStatement();
    Logger logger = Logger.getLogger(Database.class.getName());

    public Database() throws SQLException { }


    public float getDipFromDatabase(int id) throws SQLException {
        String dbId = "";
        float dipValue = 0;

        String sql = "SELECT id,value FROM `15k_litre_diesel` WHERE id = " + id;
        ResultSet resultSet = statement.executeQuery(sql);
        ResultSetMetaData md = resultSet.getMetaData();
        while (resultSet.next()) {
            dbId = resultSet.getString(1);
            dipValue = Float.parseFloat(resultSet.getString(2));
        }
        return dipValue;
    }
}

