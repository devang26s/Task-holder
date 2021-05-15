import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Welcom {
    Welcom(String s1) {
        //Frame Creation
        JFrame J=new JFrame("Welcom");
        J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setTitle("Welcome");
        Image i=Toolkit.getDefaultToolkit().getImage("K:\\Icon.png");
        J.setIconImage(i);
        //Lables
        JLabel n1,m,o,p;
        //Menu Content
        JMenuBar mb;
        JMenu CC;
        JMenuItem Net,help;
        int Plan=699;
        int date=26,month=12,y=2020;
        Net=new JMenuItem("Network Issue");
        help=new JMenuItem("Contact help-centre");

        Net.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                J.dispose();
                new Net();
            }
        }));

        help.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                J.dispose();
                new help();
            }
        });
        mb=new JMenuBar();
        CC=new JMenu("Support");
        CC.add(Net); CC.add(help);
        mb.add(CC);
        n1=new JLabel("Welcome.. "+s1);
        n1.setFont(new Font("Times New Roman",Font.BOLD,25));
        n1.setBounds(70,10,300,40);
        m=new JLabel("Current Plan:  ₹"+Plan);
        m.setBounds(70,50,300,20);
        o=new JLabel("Validity: "+date+"/"+month+"/"+y);
        o.setBounds(70,70,300,20);
        p=new JLabel("   ");
        p.setBounds(70,100,300,20);
        J.add(mb);
        J.setJMenuBar(mb);
        J.add(n1); J.add(m); J.add(o); J.add(p);
        J.setSize(300,200);
        J.setVisible(true);
        J.setLayout(null);
    }

}
/*public class UserWelcome{ }*/