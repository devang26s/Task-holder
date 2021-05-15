import javax.swing.*;
import java.awt.*;

class Net
{
    Net()
    {
        JFrame f= new JFrame("Network Issue");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Image i = Toolkit.getDefaultToolkit().getImage("K:\\Icon.png");
        f.setIconImage(i);
        JLabel l1,l2;
        l1=new JLabel("Please Restart Your Phone");
        l1.setBounds(50,50, 200,30);
        l2=new JLabel("Insert Sim card Again");
        l2.setBounds(50,80, 200,30);
        f.add(l1); f.add(l2);
        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);
    }
}

/*public class Network
{
}*/