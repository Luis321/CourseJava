package Classjava;

public class Auto {

    //Create atributes Car(Auto)
    String marca,color;
    int modelo;
    double precio;

    void arrancarAuto(String marca,String color,double precio, int modelo){
        System.out.println("La marca " + marca + " del año "+modelo+ " cuyo color es "+color+ " y su precio es de: $ "+precio+" encendio OK");
    }

    void apagarAuto(String marca){
        System.out.println("El auto " + marca + " no se apago");
    }

    void acelerarAuto(String marca){
        System.out.println("El auto "+marca+" esta acelerado");
    }

    void frenarAuto(String marca){
        System.out.println("El auto "+marca+" ya freno");
    }



}
