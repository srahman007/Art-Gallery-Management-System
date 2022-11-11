
package welcomeframe;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Favourite extends JFrame {
    
    private JLabel aLabel, bLabel, cLabel, dLabel, eLabel, fLabel, gLabel, hLabel, iLabel, jLabel, kLabel;
    private Container c;
    private JCheckBox aCheckBox, bCheckBox, cCheckBox;
    private JTextField tf; 
    private JButton aButton;
    private JRadioButton cashButton, DebitCardButton, MasterCardButton;
     private ButtonGroup grp;
    
    
    Favourite(){
        initComponents();
    }
    public void initComponents(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,700,600);
        this.setTitle("Choose your favourite ART");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        aLabel = new JLabel ("The ART details are given below");
        aLabel.setBounds(250,20,250,50);
        c.add(aLabel);
        //10,100,50,30
        bLabel = new JLabel ("Name of ART");
        bLabel.setBounds(70,50,250,50);
        c.add(bLabel);
        
        cLabel = new JLabel ("The colour of Eye");
        cLabel.setBounds(60,80,150,70);
        c.add(cLabel);
        
        dLabel = new JLabel ("Name of Artist");
        dLabel.setBounds(300,50,250,50);
        c.add(dLabel);
        
        eLabel = new JLabel ("(Alex Benzo Eron)");
        eLabel.setBounds(290,90,250,50);
        c.add(eLabel);
        
        fLabel = new JLabel ("Price of ART(in Dollars)");
        fLabel.setBounds(510,50,250,50);
        c.add(fLabel);
        
        gLabel = new JLabel ("Classical Thoughts");
        gLabel.setBounds(60,190,250,50);
        c.add(gLabel);
        
        hLabel = new JLabel ("(Justin Alika Suwen)");
        hLabel.setBounds(290,190,250,50);
        c.add(hLabel);
        
        iLabel = new JLabel ("Colourful Environment");
        iLabel.setBounds(60,290,250,50);
        c.add(iLabel);
        
        jLabel = new JLabel ("(Ostin Tringun Esha)");
        jLabel.setBounds(290,290,250,50);
        c.add(jLabel);
        
        kLabel = new JLabel ("Select a payment method from below");
        kLabel.setBounds(10,350,250,50);
        c.add(kLabel);
        
        aCheckBox = new JCheckBox();
        aCheckBox.setBounds(10,100,50,30);
        aCheckBox.setBackground(Color.PINK);
        c.add(aCheckBox);
        
        bCheckBox = new JCheckBox();
        bCheckBox.setBounds(10,200,50,30);
        bCheckBox.setBackground(Color.PINK);
        c.add(bCheckBox);
        
        cCheckBox = new JCheckBox();
        cCheckBox.setBounds(10,300,50,30);
        cCheckBox.setBackground(Color.PINK);
        c.add(cCheckBox);
        
        tf = new JTextField("$40,000");
        tf.setBounds(500,90,150,50);
        c.add(tf);
        
        tf = new JTextField("$120,000");
        tf.setBounds(500,190,150,50);
        c.add(tf);
        
        tf = new JTextField("$55,000");
        tf.setBounds(500,290,150,50);
        c.add(tf);
        
                aButton = new JButton("Finish");
                aButton.setBounds(530,400,100,50);
                c.add(aButton);
                
                aButton.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent ae) {
              JOptionPane.showMessageDialog(null,"  Have a nice day","Thank you",-1);
              dispose();
            
            }
        });
                grp = new ButtonGroup();
                
                
cashButton = new JRadioButton("Cash");
cashButton.setBounds(10,400,100,50);
cashButton.setBackground(Color.WHITE);
c.add(cashButton);

DebitCardButton = new JRadioButton("DebitCard");
DebitCardButton.setBounds(120,400,160,50);
DebitCardButton.setBackground(Color.YELLOW);
c.add(DebitCardButton);

MasterCardButton = new JRadioButton("MasterCard");
MasterCardButton.setBounds(290,400,160,50);
MasterCardButton.setBackground(Color.BLACK);
c.add(MasterCardButton);

grp.add(cashButton);
grp.add(DebitCardButton);
grp.add(MasterCardButton);
                
    }
    public static void main(String[] args) {
        Favourite frame = new Favourite();
        frame.setVisible(true);
    }
}
