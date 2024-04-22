package miu.mpp.lab7.jdbc;

import java.sql.*;

public class DBConnection {
    private static final String URL = "jdbc:ucanaccess://src/miu/mpp/lab7/jdbc/Student_info.mdb";
    private Connection con = null;
    public void connect() {
        try {
            con = DriverManager.getConnection(URL);  //used for java 8
        } catch (SQLException ex) {
            System.err.println("SQLConnectException: " + ex.getMessage());
        }
    }

    public void close() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            System.err.println("SQLCloseException: " + ex.getMessage());
        }
    }

    public ResultSet doQuery(String query) {
        ResultSet rs = null;
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            System.err.println("SQLQueryException: " + ex.getMessage());
        }
        return rs;
    }

    public int doUpdate(String query) {
        int rowsAffected = 0;
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            rowsAffected = stmt.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("SQLUpdateException: " + ex.getMessage());
        }
        return rowsAffected;
    }
}
