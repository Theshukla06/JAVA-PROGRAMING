import javax.swing.*;
public class SwingExample {
public static void main(String [] args){
    
    JFrame f = new JFrame();
    JButton b = new JButton("Click To Shukla Zone");
    b.setBounds(150,200,200,80);
    
    f.add(b);
    f.setSize(400,500);
    f.setLayout(null);
    f.setVisible(true);
}
    
}