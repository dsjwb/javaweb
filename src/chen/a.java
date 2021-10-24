package chen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class a extends JFrame {


    public a() throws HeadlessException {
        setTitle("abc") ;
        Container c=getContentPane();
        setBounds(100,100,300,400);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton btn =new JButton("按纽");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(c,"Hello Information Message","abc",2);

            }
        });
        setLayout(new FlowLayout());
        c.add(btn);

        setVisible(true);




    }

    public static void main(String[] args) {
        new a();
    }
}
