package Herency;

import javax.swing.*;

public class class_Herencia {
    public static void main(String[] args) {
        class_Son cs = new class_Son();
        class_Father cf = new class_Father();
        cs.doCookie();
        JOptionPane.showMessageDialog(null, "Ofice Class Son: "+ cs.job);
        cf.doCookie();

    }
}
