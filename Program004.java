//004. Write a Program which updates a record of employee by using Prepared Statement.

import java.sql.*;

public class Program004 {
    public static void main(String[] args) {
        Connection conn = null;

        String url = "jdbc:mysql://localhost:3306/employee";
        try {
            conn = DriverManager.getConnection(url, "root", "tnrao");

            String sql = "UPDATE emp SET firstname = ? WHERE lastname = ?";
            PreparedStatement pt = conn.prepareStatement(sql);

            pt.setString(1, "nirav");
            pt.setString(2, "kundra");

            int val = pt.executeUpdate();
            if (val > 0) {
                System.out.println("updated...");
            }
            pt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
