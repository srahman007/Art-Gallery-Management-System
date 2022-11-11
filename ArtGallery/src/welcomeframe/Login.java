
package welcomeframe;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Login extends JFrame{
    
       private JLabel userLabel, passLabel, bLabel;
    private JTextField tf;
    private JPasswordField pf;
    private JButton loginButton, clearButton;
    private Container c;
 
    
    Login(){
    
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(440,160,420,350);
        this.setTitle("ART Exhibition 2020");
        
         
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        
   
    
   
    
 
userLabel = new JLabel("UserName : ");
userLabel.setBounds(50,50,150,50);

c.add(userLabel);


tf = new JTextField();

tf.setBounds(170,50,200,50);
c.add(tf);


passLabel = new JLabel("Password : ");
passLabel.setBounds(50,120,150,50);

c.add(passLabel);


pf = new JPasswordField();
pf.setBounds(170,120,200,50);
c.add(pf);

bLabel = new JLabel("Login first to attend the exhibition ");
bLabel.setBounds(50,10,200,30);
c.add(bLabel);


loginButton = new JButton ("Login");
loginButton.setBounds(170,190,90,50);

c.add(loginButton);

clearButton = new JButton ("Clear");
clearButton.setBounds(280,190,90,50);

c.add(clearButton);

clearButton.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent ae) {
                tf.setText("");
                pf.setText("");
            }



});

loginButton.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent ae) {
               String userName = tf.getText();
               String password = pf.getText();
               
               if(userName.equals("user") && password.equals("123")){
                   
                   JOptionPane.showMessageDialog(null,"You logged in Successfully...!!!","Login Successful...!!!",-1);
                   dispose();
                 SlideShow frame = new SlideShow();
                 frame.setVisible(true);
               }
               else{
                   JOptionPane.showMessageDialog(null,"Invalid username or password","Wrong userName or password...!!!",0);
               }
            
            
            
            }



});


    
    }
    public static void main(String[] args) {
        
         Login frame = new Login();
       frame.setVisible(true);
        
        
    }
    
    
}
