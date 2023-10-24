package C_Method;

public class C_Method {
    void method(){
        System.out.println("this is my method");
    }
    static int add(){
        int a=10,b=20;
        return a+b;
    }
    static String Name(String msg){
        return msg;
    }
    void Name1(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        C_Method object=new C_Method();
        object.method();
        object.Name1("sanjay");
        int sum=C_Method.add();
        System.out.println("the sum is "+sum);
        System.out.println(C_Method.Name("siva"));
    }
}
