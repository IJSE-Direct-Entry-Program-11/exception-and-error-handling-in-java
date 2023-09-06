import java.sql.SQLException;

public class Demo12 {
    public static void main(String[] args) {
        // myMethod1();
        // myMethod2();
        // myMethod3();
    }

    static void myMethod1(){
        System.out.println("Enter into the myMethod1");
        System.out.println(5 / 0);
        System.out.println("Exit from the myMethod1");
    }

    static void myMethod2(){
        System.out.println("Enter into the myMethod2");
        if (true) throw new ArithmeticException();
        System.out.println("Exit from the myMethod2");
    }

    static void myMethod3() throws ClassNotFoundException{
        System.out.println("Enter into the myMethod3");
        throw new ClassNotFoundException();
    }

    static void myMethod4() throws ClassNotFoundException, SQLException{
        System.out.println("Enter into the myMethod4");
        if (true) throw new ClassNotFoundException();
        if (true) throw new SQLException(null, null, 0);
    }

    static void myMethod5() throws Exception{
        System.out.println("Enter into the myMethod5");
        if (true) throw new ClassNotFoundException();
        if (true) throw new SQLException(null, null, 0);
    }
}
