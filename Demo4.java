import java.io.Closeable;
import java.io.InputStream;

public class Demo4 {
    public static void main(String[] args) throws Throwable {
        
        // 1. try..catch..
        try{

        }catch(Exception e){

        }

        // 2. try..catch..finally..
        try {

        } catch (Exception e){

        } finally {

        }

        // 3. try..finally..
        try {

        } finally {

        }

        // 4. try with resource
        try (InputStream resource = Demo4.class.getResourceAsStream("resourcePath")){

        }

        // 4.1 try with resource(s)
        try (Closeable resource1 = ()-> {}; Closeable resource2 = ()-> {};
            Closeable resource3 = ()-> {}; Closeable resource4 = ()-> {}){

        }

        // 4.2 try with resource(s)..catch..
        try (Closeable resource1 = ()-> {}; Closeable resource2 = ()-> {};
            Closeable resource3 = ()-> {}; Closeable resource4 = ()-> {}){

        } catch (Exception e) {

        }

        // 4.3 try with resource(s)..catch..finally..
        try (Closeable resource1 = ()-> {}; Closeable resource2 = ()-> {};
            Closeable resource3 = ()-> {}; Closeable resource4 = ()-> {}){

        } catch (Exception e) {
            
        } finally {

        }
        
        // 4.4 try with resource(s)..finally..
        try (Closeable resource1 = ()-> {}; Closeable resource2 = ()-> {};
            Closeable resource3 = ()-> {}; Closeable resource4 = ()-> {}){

        } finally {

        }

    }
}
