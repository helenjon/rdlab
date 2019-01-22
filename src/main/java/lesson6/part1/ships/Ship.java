package lesson6.part1.ships;

public interface Ship {
    default void ship(){
        System.out.println("Ship interface using" );
    };

}
