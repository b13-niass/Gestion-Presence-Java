package repositories.impl;

import repositories.Dao;

import java.sql.*;

public class DaoImpl implements Dao {
    private Connection connection;

    // singleton
    public DaoImpl(String user, String password, String database, String server) {
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

    public ResultSet query(String sql) {
        ResultSet resultSet = null;
        try {
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return resultSet;
    }

    @Override
    public int update(String sql) {
        int result = 0;
        try {
            Statement statement = connection.createStatement();
            result = statement.executeUpdate(sql);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return result;
    }

    public void closeConnection() {
        try {
            if (this.connection != null) {
                this.connection.close();
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
