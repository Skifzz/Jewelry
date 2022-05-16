package Jewcalc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class Graf extends JFrame {

        private JButton button = new JButton("Start");
        private JTextField field1 = new JTextField("", 5);
        private JLabel label1 = new JLabel("Enter the name");
        private JTextField field2= new JTextField("", 5);
        private JLabel label2 = new JLabel("Enter the name");
        private JTextField field3 = new JTextField("", 5);
        private JLabel label3 = new JLabel("Enter the name");



        public Graf (){
            super("Party Info");
            this.setBounds(1, 1, 200, 800);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Container container = this.getContentPane();
            container.setLayout(new GridLayout(20, 1, 2, 2));
            container.add(label1);
            container.add(field1);
            container.add(label2);
            container.add(field2);
            container.add(label3);
            container.add(field3);
            button.addActionListener(new ButtonEventListener());
            container.add(button);


        }
        class ButtonEventListener implements ActionListener {
            public void actionPerformed (ActionEvent e){

                Integer name1 = Integer.valueOf(field1.getText());

                int name2 = Integer.parseInt(field2.getText());
                int name3 = Integer.parseInt(field3.getText());
                float name4;
                name4 = name1 - name2;
                name4 /= name3;

                String message = "Name is: " +"("+ name1 + "-" + name2 + ")" + "/" + name3 +"\n";
                message += name4;



                        JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);

            }

        }
    }


