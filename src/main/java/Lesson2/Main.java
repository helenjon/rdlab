package Lesson2;

public class Main {

    public static void main(String [] args) {
        Flower margarita = new Flower("margarita", "pink");
        System.out.println(margarita.isAlive);
        margarita.setIsAlive(false);
        System.out.println(margarita.isAlive);
        System.out.println(margarita.colour);
    }

}
