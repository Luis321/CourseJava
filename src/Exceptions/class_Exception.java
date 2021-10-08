package Exceptions;

import javax.swing.*;

public class class_Exception {

    /*Exceptions are problems or bugs(failures)  that occur during execution of  our application */
    public static void main(String[] args) {

        int x, y, i = 0;
        int vector[] = {1, 4, 6, 3, 2};
        boolean errores = false;

        try {
            x = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an integer", 3));
            y = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter other an integer", 3));

            JOptionPane.showMessageDialog(null, "The division of " + x + "/" + y + " is "
                    + (x / y), "Showing result", 1);

            for (i = 0; i <= 5; i++) {
                System.out.print("[" + vector[i] + "]");
            }
        } catch (NumberFormatException num) {
            errores = true;
            System.out.println(num.getMessage() + "Isn't an Number");
            num.printStackTrace();

        } catch (ArithmeticException ar) {
            errores = true;
            System.out.println(ar.getMessage() + "The division is not possible");
            ar.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException aout) {
            errores = true;
            System.out.println(aout.getMessage() + "The index" + i + "not exist");
            aout.printStackTrace();
        } finally {
            if (errores == false) {
                System.out.println();
                System.out.println("All concluded ok");
            } else {
                System.out.println("All concluded with failures");
            }
        }

    }
}