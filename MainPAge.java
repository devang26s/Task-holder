import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
//load class defines working
class Load{
    Load()
    {
        JFrame j=new JFrame(":Virtual Assistant:");                     //frame creation
        Image i=Toolkit.getDefaultToolkit().getImage("K:\\Icon.png");//Icon Setting
        j.setIconImage(i);
        //creating welcome msg...
        JLabel l1,l2,l3;
        l1=new JLabel("Welcome to VA Telecom");
        l1.setFont(new Font("Times New Roman",Font.BOLD,25));
        l1.setBounds(40,10,500,40);
        //Button for login and signup
        JButton l,s;
        //login
        l=new JButton("Login");
        l.setBounds(150,70,100,30);
        //SignUp
        s=new JButton("SignUp");
        s.setBounds(150,110,100,30);
        j.add(l1); j.add(l);
        j.add(s);
        j.setSize(450,200);
        j.setLayout(null);
        j.setVisible(true);
        //Login Action Response
        l.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                j.dispose();
                new Login();
            }
        });
        //Signup Action Response
        s.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                j.dispose();
                new SignUp();
            }
        });
    }

}
public class MainPAge {
    public static void main(String[] args) {
        new Load();
    }
}