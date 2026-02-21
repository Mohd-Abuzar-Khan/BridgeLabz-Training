package com.bankingsysetm;

import java.sql.*;

public class ManagementSystem implements AutoCloseable {

    private Connection connection;

    private PreparedStatement addAccountStmt;
    private CallableStatement transferMoneyStmt;
    private PreparedStatement checkBalanceStmt;
    private PreparedStatement transactionHistoryStmt;

    public ManagementSystem() throws SQLException {

        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/banking_system",
                "Z4RY",
                "ABmysql14"
        );

        addAccountStmt = connection.prepareStatement(
                "INSERT INTO accounts (holder_name, balance) VALUES (?, ?)"
        );

        transferMoneyStmt = connection.prepareCall(
                "{CALL transfer_money(?, ?, ?)}"
        );

        checkBalanceStmt = connection.prepareStatement(
                "SELECT holder_name, balance FROM accounts WHERE account_id = ?"
        );

        transactionHistoryStmt = connection.prepareStatement(
                "SELECT txn_id, from_account, to_account, amount, txn_time, status " +
                "FROM transactions WHERE from_account = ? OR to_account = ?"
        );
    }

    public void addAccount(String holderName, double initialBalance)
            throws SQLException {

        addAccountStmt.setString(1, holderName);
        addAccountStmt.setDouble(2, initialBalance);
        addAccountStmt.executeUpdate();
    }

    public void transferFunds(int senderId, int receiverId, double amount)
            throws SQLException {

        transferMoneyStmt.setInt(1, senderId);
        transferMoneyStmt.setInt(2, receiverId);
        transferMoneyStmt.setDouble(3, amount);

        transferMoneyStmt.execute();
        return true;
    }

    public void checkBalance(int accountId)
            throws SQLException {

        checkBalanceStmt.setInt(1, accountId);

        ResultSet rs = checkBalanceStmt.executeQuery();

        if (rs.next()) {
            System.out.println(
                    "Holder: " + rs.getString("holder_name") +
                    ", Balance: ₹" + rs.getDouble("balance")
            );
        } else {
            System.out.println("Account not found.");
        }
    }

    public void viewTransactionHistory(int accountId)
            throws SQLException {

        transactionHistoryStmt.setInt(1, accountId);
        transactionHistoryStmt.setInt(2, accountId);

        ResultSet rs = transactionHistoryStmt.executeQuery();

        while (rs.next()) {
            System.out.println("--------------------------------------------------");
            System.out.println(
                    "Txn ID: " + rs.getInt("txn_id") +
                    "\nFrom: " + rs.getInt("from_account") +
                    "\nTo: " + rs.getInt("to_account") +
                    "\nAmount: ₹" + rs.getDouble("amount") +
                    "\nTime: " + rs.getTimestamp("txn_time") +
                    "\nStatus: " + rs.getString("status")
            );
            System.out.println("--------------------------------------------------");
        }
    }

    @Override
    public void close() throws SQLException {

        addAccountStmt.close();
        transferMoneyStmt.close();
        checkBalanceStmt.close();
        transactionHistoryStmt.close();
        connection.close();
    }
}