import javax.swing.*;
import java.awt.*;
//Class Creation
public class SignUp{
    //SignUp method with working properties
    SignUp()
    {
        JFrame J=new JFrame("Create Account");
        J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                   //Operation to close previous frame
        Image i=Toolkit.getDefaultToolkit().getImage("K:\\Icon.png");//Icon
        J.setIconImage(i);
        //welcome
        JLabel l1=new JLabel("Welcome...");
        l1.setBounds(210,10,100,30);
        //Objects to be needed
        JLabel name,number,ps,note;
        JPasswordField pass;
        JTextField n,no;
        //Name Fields
        name=new JLabel("Name:");
        name.setBounds(10,40,100,20);
        n=new JTextField("");
        n.setBounds(47,40,300,20);
        //Number Fields
        number=new JLabel("Mobile No.:");
        number.setBounds(10,70,100,20);
        no=new JTextField("");
        no.setBounds(76,70,273,20);
        note=new JLabel("(Written on purchased voucher)");
        note.setBounds(10,100,200,20);
        //Password Fields
        ps=new JLabel("Set Password:");
        ps.setBounds(10,130,130,20);
        pass=new JPasswordField();
        pass.setBounds(90,130,265,20);
        //Submit Button
        JButton sm=new JButton("Create this");
        sm.setBounds(30,160,100,20);
        J.add(l1);
        J.add(name); J.add(n);
        J.add(number); J.add(no); J.add(note);
        J.add(ps); J.add(pass);
        J.add(sm);
        J.setSize(500,350);
        J.setLayout(null);
        J.setVisible(true);
    }
    public static void main(String[] args) {
        new SignUp();
    }
}
/*
public class SignUp {
    public static void main(String[] args) {
        new sign();
    }
}*/
