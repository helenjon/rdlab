package Lesson2;

public class Flower {

    String name;
    String colour;
    Boolean isAlive;

    Flower() {
    }

    Flower(String name, String colour) {
        this.name = name;
        this.colour = colour;
        this.isAlive = true;
    }


    public void setIsAlive(Boolean isAlive) {
        this.isAlive = isAlive;
    }

    public String getColour() {
        return colour;
    }
}
