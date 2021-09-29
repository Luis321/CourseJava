package Classjava;

public class Operations {

    int x,y;
    int sum(int x,int y){
       return(x+y);
    }
    int rest(int x, int y){
        return (x-y);
    }

    double areaCirculo(int radio){
        return(3.1416*radio*radio);
    }
    boolean status(int tequilas){
        boolean e= false;

        if (tequilas>=5){
            e=true;
        }else {
            e=false;
        }
        return e;
    }
}
