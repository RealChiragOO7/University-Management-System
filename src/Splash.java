import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {
    
    Splash () {
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/tiet.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        setVisible(true);
        setLocation(400,200);
        setSize(1000,700); 
        
        new Timer(5000, e -> {
            setVisible(false);
            new Login();
        }).start();

    }    
    public static void main(String[] args) {
        new Splash();
    }
}
