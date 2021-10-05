package Varia_Polymorphics;

public class class_VariaPoly {
    public static void main(String[] args) {
        /*Variable polymorphistic is that contained at object */

        class_Optimist objOptimist = new class_Optimist();
        class_Pessimistic objPessimistic = new class_Pessimistic();
        class_Extroverted objExtroverted = new class_Extroverted();
        class_Introverted objIntroverted = new class_Introverted();

        //Creating my variable polymorphic
        class_Personality objPersonality [] = new class_Personality[4];
        objPersonality[0]=objOptimist;
        objPersonality[1]=objPessimistic;
        objPersonality[2]=objExtroverted;
        objPersonality[3]=objIntroverted;

        //Call our variable polymorphic
        objPersonality[0].talk();
        objPersonality[1].talk();
        objPersonality[2].talk();
        objPersonality[3].talk();

    }
}
