public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Enter into the main");
        myMethod1();
        System.out.println("Exit from the main");
    }

    static void myMethod1(){
        System.out.println("Enter into myMethod1");
        myMethod2();
        System.out.println("Exit from myMethod1");
    }

    static void myMethod2(){
        System.out.println("Enter into myMethod2");
        myMethod3();
        System.out.println("Exit from myMethod2");
    }

    static void myMethod3(){
        System.out.println("Enter into myMethod3");
        System.out.println(5 / 0);
        System.out.println("Exit from myMethod3");
    }
}