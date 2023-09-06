public class Demo9 {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Enter into the main");
        myMethod1();
        System.out.println("Exit from the main");
    }

    static void myMethod1() throws ClassNotFoundException{
        System.out.println("Enter into the myMethod1");
        myMethod2();
        System.out.println("Exit from the myMethod1");
    }

    static void myMethod2() throws ClassNotFoundException{
        System.out.println("Enter into the myMethod2");
        Class.forName("crazy");     // <- Risky Method
        System.out.println("Exit from the myMethod2");
    }
}
