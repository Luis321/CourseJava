//Subclass
package Herency;

import javax.swing.*;

public class class_Employed extends class_Person {
    double salary;
    String telephone, address;
    public class_Employed(String name, int age, double salary, String telephone, String address){
        super(name, age);
        this.address=address;
        this.salary=salary;
        this.telephone=telephone;

    }
    @Override
    public void viewDetails(){
        JOptionPane.showMessageDialog(null,"Name: "+name+ "\nAge: " + age + "\nSalary: " + salary +
                        "\nTelephone: " + telephone + "\nAddress: "+ address,"Details of Employed",1);
    }

}
