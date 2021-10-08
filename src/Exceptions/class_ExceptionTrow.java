package Exceptions;

import javax.swing.*;

public class class_ExceptionTrow {
    static int a,b;
    public static void main(String[] args) {
        try {
            sumar();
            dividir(5,0);
        }catch (ArithmeticException are ){
            System.out.println(are.getMessage());
            are.printStackTrace();
        }catch (NumberFormatException nb){
            System.out.println(nb.getMessage());
            nb.printStackTrace();
        }
        int x, y;


        try {
            x = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an integer", 3));
            y = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter other an integer", 3));

            //Making exceptions with Throw

            if (y==0){
                //Creating a Throw Exception
                throw new ArithmeticException("Error en  Y = " + y);
            }else{
                JOptionPane.showMessageDialog(null, "The division of " + x + "/" + y + " is "
                        + (x / y), "Showing result", 1);
            }

        }catch (ArithmeticException ar){
            System.out.println(ar.getMessage()+ " Isn't divide between zero");
            ar.printStackTrace();

        }
    }

    public static void sumar() throws NumberFormatException{
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a: ","Requesting data", 3));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter b: ","Requesting data", 3));

        JOptionPane.showMessageDialog(null,"The result of "+ a +" + " +b+" is: "+(a+b),"Showing result",1);
    }
    public static  void dividir(int a, int b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Error : Isn't divide between zero");
        }else {
            JOptionPane.showMessageDialog(null, "The division of " + a + "/" + b + " is "
                    + (a / b), "Showing result", 1);
        }
    }
}
