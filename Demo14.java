public class Demo14 {
   public static void main(String[] args) {
        try{
            throw new MyCustomException1("My Custom Exception 1");
        } catch (MyCustomException1 e){
            e.printStackTrace();
        }

        if (true) throw new MyCustomException2("Something went wrong!");
   } 
}

class MyCustomException1 extends Exception {

    public MyCustomException1(){}

    public MyCustomException1(String message){
        super(message);
    }

}

class MyCustomException2 extends ArithmeticException {

    public MyCustomException2(){}

    public MyCustomException2(String message){
        super(message);
    }
}


