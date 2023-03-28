import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class databaseHandler implements ActionListener {
        private  JFrame frame;
        private  JTextField username;
        private  JTextField password;
        private   JLabel success;
        public databaseHandler(JFrame frame,JTextField username,JTextField password,JLabel success) {
            this.frame = frame;
            this.username=username;
            this.password=password;
            this.success=success;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            String jdbcUrl = "jdbc:mysql://localhost:3306/'your database name'";
            String dbname = 'your username';
            String dbpass = 'your password';
         try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection(jdbcUrl,dbname, dbpass);
         PreparedStatement stmt = con.prepareStatement("select * from users where name = ? and password = ?");
         stmt.setString(1,username.getText());
         stmt.setString(2, password.getText());
         ResultSet result = stmt.executeQuery();
         if (result.next()) {
            frame.setVisible(false);
            new homePage();
        }
         else {
            success.setText("you should sign up first");
        }
    
         } catch (Exception a) {
            System.out.println("error");
            System.out.println(a.getMessage());
         }
        }
    }


