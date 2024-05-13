package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
    private Connection connection;

    public DAO(String user, String password, String database, String server) {
        try {
            String url = "jdbc:mysql://" + server + "/" + database;
            this.connection = DriverManager.getConnection(url, user, password);

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    public Connection getConnection() {
        return this.connection;
    }

    public void closeConnection(){
        try{
            if (this.connection != null){
                this.connection.close();
            }
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
    }
}