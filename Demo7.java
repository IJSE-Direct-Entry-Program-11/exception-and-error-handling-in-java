import java.sql.SQLException;

public class Demo7 {
    public static void main(String[] args) {
        try {

        } catch (Exception e){

        }

        try {

        } catch (Throwable t) {

        }

        try {

        } catch (NullPointerException e){

        }

        try {
            System.out.println("Let's load a class");
            Class.forName("abc");
            System.out.println("Loaded!");
        } catch (ClassNotFoundException exception){
            System.out.println("Class eka natho");
        } 
        // catch (SQLException exception){

        // }
    }
}
