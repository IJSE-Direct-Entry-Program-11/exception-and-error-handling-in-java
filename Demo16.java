public class Demo16 {
    public static void main(String[] args) {
        try {
            System.out.println("Entering into the try block");
            String abc = null;
            System.out.println(abc.toUpperCase());
            System.out.println(5 / 0);
            System.out.println(5 / 1);
            System.out.println("Exiting from the try block");


        } catch (ArithmeticException exp){
            System.out.println("Caught the arthimatic exception");


        } finally {
            System.out.println("Let's exit from the try construct");
        }

    }
}
