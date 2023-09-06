import java.sql.SQLException;

public class Demo13 {

    static void myMethod1() throws Exception{
        throw new Exception();
    }

    // catch hell
    static void myMethod2(){
        try {
            throw new ClassNotFoundException();
        }catch (ClassNotFoundException e){
            try {
                throw e;
            } catch (ClassNotFoundException e1) {
                try {
                    throw e1;
                } catch (ClassNotFoundException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    static void myMethod3() throws ClassNotFoundException{
        throw new ClassNotFoundException();
    }

    static void myMethod4()throws Throwable{
        throw new Exception();
    }

    public static void main(String[] args) {
        try {
            myMethod5();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch(SQLException e){

        } catch (Throwable t){}
    }

    static void myMethod5() throws ClassNotFoundException, SQLException{
        try{
            if (true) throw new ClassNotFoundException();
            if (true) throw new SQLException();
            if (true) throw new RuntimeException();
        }catch (Exception e){
            throw e;
        }
    }

    static void myMethod6() throws Exception{
        try{
            if (true) throw new ClassNotFoundException();
            if (true) throw new SQLException();
            if (true) throw new RuntimeException();
        }catch (Exception e){
            throw new Exception(e);
        }
    }

    static void myMethod() throws ClassNotFoundException, SQLException {
        System.out.println("Hello World!");
    }

    static {
        try {
            myMethod();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
