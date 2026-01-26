package com.testing.databaseconnections;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DatabaseConnectionTest {
    private DatabaseConnection dbConnection;
    
    @BeforeEach
    void setUp() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();
    }
    
    @AfterEach
    void tearDown() {
        dbConnection.disconnect();
    }
    
    @Test
    void testConnection() {
        assertTrue(dbConnection.isConnected());
    }
    
    @Test
    void testConnectionAfterSetup() {
        assertTrue(dbConnection.isConnected());
    }
}
