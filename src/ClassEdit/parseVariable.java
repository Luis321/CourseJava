package ClassEdit;

public class parseVariable {

    public static void main(String[] args) {
        //Convert Integer to String
            int alfa = 20;
            float beta = 23.5F;
            beta = alfa;

            alfa = (int) beta;
            alfa = (char) 'b';
        System.out.println(alfa);

        char caracter = (char) alfa;
        System.out.println(caracter);

        int numero = Integer.parseInt("10");//Pasamos de cadena a entero.

        System.out.println(numero*4);
        String cadena  = Integer.toString(10); // Pasamos de entero a cadena.
        System.out.println(cadena + " " + "potatos");






    }

}
