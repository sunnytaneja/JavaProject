package com.corejavaproject.jdbc;

import com.corejavaproject.jdbc.DBConnection.DBConnection;
import lombok.extern.log4j.Log4j2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@Log4j2
public class BankMain {

    public static void main(String[] args) {
        try {
            Connection connection = DBConnection.getConnection();
            log.info(connection);
        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
