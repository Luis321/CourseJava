package Varia_Polymorphics;

import javax.swing.*;

//This is subclase
public class class_Pessimistic extends class_Personality{

    @Override
    public void talk() {
        JOptionPane.showMessageDialog(null,"Today is "
                +"Bad day","I'm pessimistic",1);

    }
}
