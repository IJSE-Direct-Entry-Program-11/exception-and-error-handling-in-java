public class Demo8 {
    public static void main(String[] args) {
        System.out.println("Enter into the main");
        myMethod1();
        System.out.println("Exit from the main");
    }

    static void myMethod1(){
        System.out.println("Enter into the myMethod1");
        myMethod2();
        System.out.println("Exit from the myMethod1");
    }

    static void myMethod2() {
        System.out.println("Enter into the myMethod2");
        try {
            Class.forName("crazy");     // <- Risky Method
        }catch (ClassNotFoundException e){
            System.out.println("Mehama class ekak ne...!");
        }
        System.out.println("Exit from the myMethod2");
    }
}
