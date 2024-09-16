import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class lcm implements ActionListener,MenuListener
{
    JFrame jfm2;
    JPanel jp,jp2,jp3;
    JTextField jt1,jt2;
    JButton jb;
    JLabel jl,jla;
    JMenuBar mb;
    JMenu m1;
    lcm()
    {
        jfm2= new JFrame("Primary Mathematics");
        jfm2.setSize(460,500);
        jfm2.setResizable(false);
        jfm2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfm2.setLocationRelativeTo(null);
        jfm2.setLayout(new GridLayout(2,1));
        mb=new JMenuBar();
        m1=new JMenu("Home");
        m1.addMenuListener(this);
        mb.add(m1);
        jfm2.setJMenuBar(mb);
        jp=new JPanel();
        jl=new JLabel("<html><h1 style=\"color:blue;text-align:center;\">Welcome</h1><h1 style=\"color:blue;text-align:center;\">To</h1><h1 style=\"color:red;text-align:center;\">Least Common Multiple</h1></html>");
        jp.add(jl);
        jfm2.add(jp);
        
        jp=new JPanel();
        jp.setLayout(new GridLayout(4,1));
        jla=new JLabel("");
        jp.add(jla);
        jl=new JLabel("<html><h3>Enter two Integer number:</h3></html>",jl.CENTER);
        jp.add(jl);
        jp2=new JPanel();
        jp2.setLayout(new GridLayout(2,1));
        jp3=new JPanel();
        jp3.setLayout(new FlowLayout());
        jt1=new JTextField();
        jt1.setColumns(6);
        jt2=new JTextField();
        jt2.setColumns(6);
        jp3.add(jt1);
        jl=new JLabel("   ");
        jp3.add(jl);
        jp3.add(jt2);
        jp2.add(jp3);
        jp3=new JPanel();
        jp3.setLayout(new GridLayout(1,5));
        jl=new JLabel("   ");
        jp3.add(jl);
        jl=new JLabel("   ");
        jp3.add(jl);
        jl=new JLabel("   ");
        jp3.add(jl);
        jb=new JButton("Answer");
        jb.addActionListener(this);
        jp3.add(jb);
        jl=new JLabel("   ");
        jp3.add(jl);
        jp2.add(jp3);
        jp.add(jp2);
        jl=new JLabel(" ");
        jp.add(jl);
        
            
        jfm2.add(jp);
        jfm2.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==jb)
        {
            String str1=jt1.getText().trim();
            String str2=jt2.getText().trim();
            if(str1.equals("") || str2.equals(""))
            {
                JOptionPane.showMessageDialog(jfm2, "Please fill up with integer!!!","Message", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                try
                {
                    int num1=Integer.parseInt(str1);
                    int num2=Integer.parseInt(str2);
                    int i,hcf = 0;
                    for(i=1; i<=num1 || i<=num2; ++i)
                    {
                        if(num1%i==0 && num2%i==0)   
                            hcf=i;
                    }
                    int lcm = (num1*num2)/hcf;
                    JOptionPane.showMessageDialog(jfm2, "LCM of these numbers is: "+lcm,"Answer", JOptionPane.INFORMATION_MESSAGE);
                }catch(NumberFormatException ime)
                {
                   JOptionPane.showMessageDialog(jfm2, "Please enter integer!!!","Message", JOptionPane.INFORMATION_MESSAGE); 
                }
            }
        }
    }

    @Override
    public void menuSelected(MenuEvent e) {
        
        jfm2.setVisible(false);
        landingPage ob=new landingPage();
    }

    @Override
    public void menuDeselected(MenuEvent e) {
        
    }

    @Override
    public void menuCanceled(MenuEvent e) {
        
    }
}
