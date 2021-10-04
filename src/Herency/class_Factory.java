//Principal Class
package Herency;

import javax.swing.*;

public class class_Factory {
    public static void main(String[] args) {
        String nam, tel, adr;
        double sal;
        int ag;
        nam =JOptionPane.showInputDialog(null,"Enter employed name:  ","Requesting details :",3);
        ag = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter employed age:  ","Requesting details :",3 ));
        sal = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter employed salary:  ","Requesting details :",3 ));
        tel = JOptionPane.showInputDialog(null,"Enter employed telephone:  ","Requesting details :",3 );
        adr = JOptionPane.showInputDialog(null,"Enter employed address:  ","Requesting details :",3 );


        class_Employed emp1 = new class_Employed(nam,ag,sal,tel,adr);
        class_Employed emp2 = new class_Employed("Rodrigo Alamos",21,7000,"962523992","Calle Vallejo 216");
        class_Employed emp3 = new class_Employed("Lorena Casas",33,1000,"923453992","El Panteón 465");

        emp1.viewDetails();
        emp2.viewDetails();
        emp3.viewDetails();

    }

}
