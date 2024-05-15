package repositories;

import java.sql.*;

public interface Dao {
    Connection getConnection();

    ResultSet query(String sql);

    int update(String sql);

    void closeConnection();
}