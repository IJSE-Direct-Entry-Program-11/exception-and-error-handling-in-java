import java.lang.Thread.UncaughtExceptionHandler;

public class Demo2 {
    public static void main(String[] args) {
        // Thread.currentThread().setDefaultUncaughtExceptionHandler(
        //                              new UncaughtExceptionHandler() {

        //     @Override
        //     public void uncaughtException(Thread t, Throwable e) {
        //         System.out.println("Mata athi mama yanawa yanna!");
        //     }
            
        // });

        Thread.setDefaultUncaughtExceptionHandler((t, e) -> {
            // Logging
            System.out.println("Menna meya yanawa: " + t.getName());
            System.out.println("Mata athi mama yanawa yanna!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        });

        System.out.println("Enter into the main");
        myMethod1();
        System.out.println("Exit from the main");
    }

    public static void myMethod1(){
        System.out.println("Enter into myMethod1");
        myMethod2();
        System.out.println("Exit from myMethod1");
    }

    public static void myMethod2(){
        System.out.println("Enter into myMethod2");
        String something = null;
        System.out.println(something.toUpperCase());
        System.out.println("Exit from myMethod2");
    }
}
