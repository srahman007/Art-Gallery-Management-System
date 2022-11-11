
package welcomeframe;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class WelcomeFrame extends JFrame{
    private Container c;
    private JLabel aLabel;
    private JButton aButton;
    WelcomeFrame(){
    
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(440,160,420,350);
        this.setTitle("Art Exhibition 2020");
        
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
    
        aLabel = new JLabel ("WELCOME TO ART EXHIBITION 2020 ");
        aLabel.setBounds(90,100,260,100);
    
       
         
        
        aButton = new JButton("Next");
        aButton.setBounds(270,250,90,40);
        
        aButton.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                 JOptionPane.showMessageDialog(null,"Welcome to todays exhibition...Press ok to continue","Welcome...!!!",-1);
               dispose();
               Login frame = new Login();
               frame.setVisible(true);
        
            }
        
        
        
        });
       
       
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        c.add(aLabel);
        c.add(aButton);
        
    }
        

   
    public static void main(String[] args) {
       WelcomeFrame frame = new WelcomeFrame();
       frame.setVisible(true);
    }
    
}
