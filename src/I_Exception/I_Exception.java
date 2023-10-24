package I_Exception;

public class I_Exception {
    public static void main(String[] args) {
        //custom Exception
        try {
            Test.add();
        }catch (Exception e){
            throw new RuntimeException(e);
        }

        //Exception
        try{
            int a=12/0;
            System.out.println("Exception");

        }catch (Exception e){
            if(e instanceof ArithmeticException){
                System.out.println("Error");
            }
            else {
                System.out.println(e);
            }
        }
    }
}
