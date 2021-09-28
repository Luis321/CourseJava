package Classjava;

public class Attributes {
    /**
     * Declaring Variables
     */

    //Asignated  initial values
    String mark = "Ford";
    String model = "2014";
    String colour = "Yelow";
    double price = 240.000;

    public static void main(String[] args) {
        //System.out.println("The mark is: " + mark);

        //Other metodo is instanciar the object
     Attributes atrb = new Attributes();
     //Accces at the instance atributes

        System.out.println("Marka: "+ atrb.mark);
        System.out.println("Colour: "+ atrb.colour);
        System.out.println("Model: "+ atrb.model);
        System.out.println("Price: "+ atrb.price);

      //Create instances
        Auto primerAuto = new Auto();
        primerAuto.arrancarAuto();
        primerAuto.acelerarAuto();
        primerAuto.frenarAuto();
        primerAuto.apagarAuto();
    }
}
