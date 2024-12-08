package service;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Bill;

public class BillingService {

    // Add a new bill
    public boolean addBill(Bill bill) {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "INSERT INTO bill (customer_name, customer_address, units, amount, status) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, bill.getCustomerName());
            stmt.setString(2, bill.getCustomerAddress());
            stmt.setInt(3, bill.getUnits());
            stmt.setDouble(4, bill.getAmount());
            stmt.setString(5, bill.getStatus());
            return stmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // View all bills
    public void viewBills() {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT * FROM bill";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            System.out.println("Bill Details:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("bill_id") +
                        ", Name: " + rs.getString("customer_name") +
                        ", Units: " + rs.getInt("units") +
                        ", Amount: " + rs.getDouble("amount") +
                        ", Status: " + rs.getString("status"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Pay a bill
    public boolean payBill(int billId) {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "UPDATE bill SET status = 'PAID' WHERE bill_id = ? AND status = 'UNPAID'";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, billId);
            return stmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
