import javax.swing.*;
import java.awt.*;

public class help
{
    help()
    {
        JFrame f= new JFrame("24*7 Help center");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Image i = Toolkit.getDefaultToolkit().getImage("K:\\Icon.png");
        f.setIconImage(i);
        JLabel l1,l2;
        l1=new JLabel("Contact to nearest office: 0261-xyz90");
        l1.setBounds(50,50, 250,30);
        l2=new JLabel("Home support: 0261-abc98");
        l2.setBounds(50,80, 250,30);
        f.add(l1); f.add(l2);
        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);
    }
}

/*public class help
{

}*/