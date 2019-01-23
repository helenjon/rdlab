package lesson6.part1.transport;

public class Car implements Transport{

    private String fuel = "Car fuel";
    private Integer wheels;

    public Car(Integer wheels) {
        this.wheels = wheels;
    }

    @Override
    public void fuel() {
        System.out.println(fuel);
                  }

    @Override
    public void colour() {
        System.out.println();
    }
    @Override
    public void speed() {

    }

    public void wheels(){
        System.out.println("Car with " + wheels + " wheels");
    }
}
