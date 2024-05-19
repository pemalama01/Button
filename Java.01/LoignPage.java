import java.awt.*;
import javax.swing.*;

public class LoignPage
{
    public static void main(String[] args)
    {
        JFrame frame =new JFrame ("Loign page");
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT,50,50));
        JButton b1= new JButton("Button1");
        JButton b2= new JButton ("Button2");
        JButton b3= new JButton ("Button3");
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.setVisible(true);
        

        



    }
    
}
