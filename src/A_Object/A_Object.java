package A_Object;

public class A_Object {
    String firstName="Siva";

    public static void main(String[] args) {
        A_Object object1=new A_Object();
        System.out.println(object1.firstName);
        System.out.println(object1);
        A_Object object2=new A_Object();
        System.out.println(object2.firstName);
        System.out.println(object2);
        String str= object2.firstName;
        System.out.println(str);
        System.out.println(str.hashCode());
    }
}
