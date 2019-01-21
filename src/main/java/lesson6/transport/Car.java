package lesson6.transport;

public class Car implements Transport{

    private String fuel = "Car fuel";
    private Integer wheels;

    public Car(Integer wheels) {
        this.wheels = wheels;
    }

    public void fuel() {
        System.out.println(fuel);
                  }

    public void colour() {
        System.out.println();
    }

    public void speed() {

    }

    public void wheels(){
        System.out.println("Car with 4 wheels");
    }
}
