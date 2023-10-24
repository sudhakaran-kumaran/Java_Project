package B_Class;

public class B_Class {
    void run(){
        System.out.println("run");
    }
    public static void main(String[] args) {
        B_Class object=new B_Class();
        object.run();
        Dummy object1=new Dummy();
        object1.dance();
    }
}

