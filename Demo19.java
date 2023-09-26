import java.io.Closeable;
import java.io.IOException;

public class Demo19 {

    public static void main(String[] args) throws Exception {
        // MyResource1 resource1 = new MyResource1();
        // MyResource2 resource2 = new MyResource2();
        // MyResource3 resource3 = new MyResource3();
        // // Let's use these three resources here
        // resource1.close();
        // resource2.close();
        // resource3.close();

        try(MyResource1 resource1 = new MyResource1();
            MyResource2 resource2 = new MyResource2();
            /* MyResource3 resource3 = new MyResource3() */){
            System.out.println("Let's use these three resources here");
        }

        // Since Java 9
        MyResource1 resource1 = new MyResource1();
        MyResource2 resource2 = new MyResource2();
        try(resource1; resource2){
            System.out.println("Let's use these three resources here");
        } finally {
            // I can't use resource1 or resource2 here
            // Because they have been already closed
            System.out.println("Finally Block");
        }
    }
}

class MyResource1 implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("My Resource 1 is about to close");
    }

}

class MyResource2 implements Closeable{

    @Override
    public void close() throws IOException {
        System.out.println("My Resource 2 is about to close");
    }

}

class MyResource3 {
    public void close(){
        System.out.println("My Resource 3 is about to close");
    }
}
