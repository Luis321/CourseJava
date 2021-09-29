package Classjava;

public class class_Car {
    public static void main(String[] args) {
        //Create objects
        Auto primerAuto = new Auto();
        Auto segundoAuto = new Auto();
        Auto tercerAuto = new Auto();
        Auto cuartoAuto = new Auto();
        Auto quintoAuto = new Auto();

        //Arrancar
        primerAuto.arrancarAuto("BMW","Plata",120.25,2015);
        segundoAuto.arrancarAuto("Audi","Rojo", 45.764,2020);
        tercerAuto.arrancarAuto("Volvo","Azul",67.425,2021);
        cuartoAuto.arrancarAuto("Kia","Blanco",14.575,2017);
        quintoAuto.arrancarAuto("Hyundai","Negro",17.082,2017);

        //Apagar
        primerAuto.apagarAuto("BMW");
        segundoAuto.apagarAuto("Audi");
        tercerAuto.apagarAuto("Volvo");
        cuartoAuto.apagarAuto("Kia");
        quintoAuto.apagarAuto("Hyundai");

        //Acelerar
        primerAuto.acelerarAuto("BMW");
        segundoAuto.acelerarAuto("Audi");
        tercerAuto.acelerarAuto("Volvo");
        cuartoAuto.acelerarAuto("Kia");
        quintoAuto.acelerarAuto("Hyundai");

        //Frenar
        primerAuto.frenarAuto("BMW");
        segundoAuto.frenarAuto("Audi");
        tercerAuto.frenarAuto("Volvo");
        cuartoAuto.frenarAuto("Kia");
        quintoAuto.frenarAuto("Hyundai");
    }
}
