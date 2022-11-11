
package welcomeframe;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class SlideShow extends JFrame implements ActionListener{
    private Container c;
    private JPanel panel;
    private JButton prevButton, nextButton, finishButton;
    private ImageIcon icon;
    private JLabel label;
    private CardLayout card;
    
    
    
    SlideShow(){
    
    initComponents();
    ShowImage();
    }
    
    public void ShowImage(){
    
    String [] imageNames = {"1.jpg","2.jpg","45.jpg"};
    
    for (String n: imageNames){
        icon = new ImageIcon ("src/image/"+n);
        
        Image img = icon.getImage();
        Image newImage = img.getScaledInstance(panel.getWidth(),panel.getHeight(),Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImage);
        label = new JLabel(icon);
        panel.add(label);
        
    }
    }
    
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,600,500);
        this.setTitle("Slideshow of Arts");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        
        card = new CardLayout();
        
        panel = new JPanel(card);
                panel.setBounds(10,10,560,380);
                c.add(panel);
                
                prevButton = new JButton("Previous");
                prevButton.setBounds(10,400,100,50);
                c.add(prevButton);
                
                nextButton = new JButton("Next");
                nextButton.setBounds(120,400,100,50);
                c.add(nextButton);
                
                finishButton = new JButton("Finish");
                finishButton.setBounds(470,400,100,50);
                c.add(finishButton);
                
                
                prevButton.addActionListener(this);
                nextButton.addActionListener(this);
                
        
    }
      @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==prevButton){
        card.previous(panel);
    }
        if(e.getSource()==nextButton){
        card.next(panel);
        }
    
        finishButton.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent ae) {
              JOptionPane.showMessageDialog(null,"Press OK to see the next steps","We hope you like those paintings...!!!",-1);
              dispose();
            Favourite frame = new Favourite();
            frame.setVisible(true);
            }
        });
           
                }

    public static void main(String[] args) {
        SlideShow frame = new SlideShow();
        frame.setVisible(true);
    }

  
}
