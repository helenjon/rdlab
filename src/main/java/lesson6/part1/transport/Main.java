package lesson6.part1.transport;

import java.util.ArrayList;

public class Main {

    public static void main(String [] args){

        Car audi = new Car(4);
        Train UV = new Train();
        Ship cargo = new Ship();

        audi.fuel();
        audi.wheels();
        cargo.ship();

        ArrayList<Transport> transportPark = new ArrayList<Transport>();
        transportPark.add(audi);
        transportPark.add(UV);
        transportPark.add(cargo);


    }
}
