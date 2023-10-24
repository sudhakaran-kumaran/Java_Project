package D_Override;

public class D_Override {
    public static void main(String[] args) {
        Vehicle obj1 = new Vehicle();
        obj1.getWheels();
        obj1.getColor();


        Car obj2 = new Car();
        obj2.getWheels();
        obj2.getColor();

        //Up Casting
        Vehicle obj3=new Car();
        obj3.getColor();
        obj3.getWheels();

        //Down Casting
        Vehicle obj4=new Car();
        Car obj5=(Car) obj4;
        obj5.getColor();
        obj5.getWheels();
    }
}
