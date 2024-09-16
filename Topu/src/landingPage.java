import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class landingPage implements ActionListener
{
    JFrame jfm;
    JPanel jp,jpb,jpb2;
    JButton jb1,jb2,jb3;
    JLabel jl;
    ImageIcon img;
    landingPage()
    {
        jfm= new JFrame("Primary Mathematics");
        jfm.setSize(460,500);
        jfm.setResizable(false);
        jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfm.setLocationRelativeTo(null);
        jfm.setLayout(new GridLayout(3,1));
        
        
        jp=new JPanel();
        img=new ImageIcon("image/logo.jpg");
        jl= new JLabel();
        jl.setIcon(img);
        jp.add(jl);
        
        
        jfm.add(jp);
        
        
       
        jp=new JPanel();
        jl=new JLabel("<html><h1 color=\"blue\" style=\"text-align:center;\">Welcome </h1><h1 color=\"blue\" style=\"text-align:center;\"> To</h1><h1 color=\"red\" style=\"text-align:center;\"> Primary Mathematics </h1></html>");
        jp.add(jl);
       
        jfm.add(jp);
        
        
        jp=new JPanel();
        jp.setLayout(new GridLayout(2,1));
        jl=new JLabel("<html><h2 style=\"text-align:center;\">Choose one item in below:</h2></html>",jl.CENTER);
        jp.add(jl);
        jpb2=new JPanel();
        jpb2.setLayout(new GridLayout(2,1));
        jpb=new JPanel();
        jpb.setLayout(new GridLayout(1,7));
        jl=new JLabel("");
        jpb.add(jl);
        jb1=new JButton("GCD");
        jb1.addActionListener(this);
        jpb.add(jb1);
        jb2=new JButton("LCM");
        jb2.addActionListener(this);
        jl=new JLabel("");
        jpb.add(jl);
        jpb.add(jb2);
        jl=new JLabel("");
        jpb.add(jl);
        jb3=new JButton("TIME");
        jb3.addActionListener(this);
        jpb.add(jb3);
        jl=new JLabel("");
        jpb.add(jl);
        jpb2.add(jpb);
        jl=new JLabel("");
        jpb2.add(jl);
        jp.add(jpb2);
        jfm.add(jp);
        
        jfm.setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==jb1)
        {
            jfm.setVisible(false);
            gcd ob=new gcd();
        }
        if(e.getSource()==jb2)
        {
            jfm.setVisible(false);
            lcm ob=new lcm();
        }
        if(e.getSource()==jb3)
        {
            jfm.setVisible(false);
            leap ob=new leap();
        }
    }
    public static void main(String args[])
    {
        landingPage ob=new landingPage();
    }
    
}