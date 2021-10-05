package Exercise_Poli;

import javax.swing.*;

public class class_Polymorphism {
    public static void main(String[] args) {
    class_Developer dev = new class_Developer();
    class_Analyst ana = new class_Analyst();
    class_AdminBDA dba = new class_AdminBDA();

    class_DeveloperOver devo = new class_DeveloperOver();
    class_AnalystOver Analo = new class_AnalystOver();
    class_AdminBDAOver admino = new class_AdminBDAOver();

        JOptionPane.showMessageDialog(null, "Here start the polymorphism overload");

    dev.details("Luis","Otoya" );
    dev.salary(24,4000);
    dev.work("Programmer");

    ana.details("Jose","Ramirez","Salesiano 321");
    ana.salary(24,3000,700);
    ana.work("I'm dedicated",8);

    dba.salary(70000);
    dba.details("Fernando");
    dba.work("Manage the BD");

        JOptionPane.showMessageDialog(null, "Here start the polymorphism override");

    devo.details("Pedro");
    devo.salary(2500);
    devo.work("Developer serious");

    Analo.details("Rodrigo");
    Analo.salary(40000);
    Analo.work("Check details ");

    admino.details("Gelacio");
    admino.salary(7000);
    admino.work("Manage the Database");

    }
}
