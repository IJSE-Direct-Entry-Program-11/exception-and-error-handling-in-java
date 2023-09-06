import java.io.IOError;
import java.sql.SQLException;

public class Demo10 {
    public static void main(String[] args) {
        try {
            invoker();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    static void invoker() throws ClassNotFoundException, SQLException, 
                            Exception, Throwable {
        //try {
            myMethod1();
            myMethod2();
            myMethod3();
            myMethod4();
            myMethod5();
            myMethod6();
            myMethod7();
        //}catch(ClassNotFoundException|SQLException e){
            // Only catch ClassNotFoundException and SQLException
        //}
    }

    static void myMethod1() throws ClassNotFoundException{} // Risky

    static void myMethod2() throws SQLException {} // Risky

    static void myMethod3() throws NullPointerException {} 
    
    static void myMethod4() throws ArrayIndexOutOfBoundsException {}  
    
    static void myMethod5() throws IOError {}
    
    static void myMethod6() throws Exception {} // Risky

    static void myMethod7() throws Throwable {} // Risky

}
