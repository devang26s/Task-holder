import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class Login {
    //Method with working properties
    Login() {
        JFrame J = new JFrame("Login");
        J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                          //Operation to close previous frame
        Image i = Toolkit.getDefaultToolkit().getImage("K:\\Icon.png");
        J.setIconImage(i);
        JLabel l1 = new JLabel("Login");
        l1.setBounds(210, 10, 100, 30);
        JLabel name, number, ps;
        JPasswordField pass;
        JTextField n, no;
        //Name Fields
        name = new JLabel("Name:");
        name.setBounds(10, 40, 100, 20);
        n = new JTextField("");
        n.setBounds(47, 40, 300, 20);
        //Number Fields
        number = new JLabel("Mobile No.:");
        number.setBounds(10, 70, 100, 20);
        no = new JTextField("");
        no.setBounds(76, 70, 273, 20);
        //Password Fields
        ps = new JLabel("Password:");
        ps.setBounds(10, 100, 100, 20);
        pass = new JPasswordField();
        pass.setBounds(70, 100, 275, 20);
        //Submit Button
        JButton sm = new JButton("Log In");
        sm.setBounds(30, 130, 100, 20);
        J.add(l1);
        J.add(name);
        J.add(n);
        J.add(number);
        J.add(no);
        J.add(ps);
        J.add(pass);
        J.add(sm);
        J.setSize(450, 240);
        J.setLayout(null);
        J.setVisible(true);
        //Button's action method
        sm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               //v1 & v2 to get text from text-fields

                String v1 = n.getText();
                String v2 = pass.getText();
                try {

                    //Connection with MySQL database

                    Class.forName("com.sql.jdbc.Driver");
                    Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "Devang@26");
                    Statement st = co.createStatement();
                    ResultSet rs = st.executeQuery("select * from login where ClientName='" + v1 + "' and Password='" + v2 + "'");

                    String uname = "", pass = "";

                    if (rs.next()) {
                        uname = rs.getString("ClientName");
                        pass = rs.getString("Password");
                        /*J.dispose();
                        new Welcom();*/
                    }

                    //Condition for login

                    if (v1.equals("") && v2.equals("")) {
                        JOptionPane.showMessageDialog(null, "Enter Login  info", "Error", JOptionPane.ERROR_MESSAGE);
                    } else if (v1.equals(uname) && v2.equals(pass)) {
                       // UserWelcome page = new UserWelcome();
                       // page.setVisible(true);
                        J.dispose();        //Next Frame opening operation
                        new Welcom(uname);

                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid login name or password", "Error", JOptionPane.ERROR_MESSAGE);
                        name.setText("");
                        ps.setText("");
                    }
                } catch (Exception ex) {
                }
            }
        });
    }
    public static void main(String[] args) {
        new Login();
    }
}

/*class Welcome extends JFrame {
    Welcome(String st) {
        setLayout(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Welcome");/*
        Image i=Toolkit.getDefaultToolkit().getImage("K:\\Help.png");
        setIconImage(i);
        JLabel n = new JLabel("Welcome.. ");
        n.setBounds(5, 10, 200, 30);
        add(n);
        setSize(300, 250);
        setVisible(true);
    }
}*/
/*public class Login {
    public static void main(String[] args) {
        new Log();
    }
}*/
