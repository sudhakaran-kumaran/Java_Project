package D_Override;

public class Car extends Vehicle {
    @Override
    void getColor() {
        System.out.println("child-Red");
    }
}
