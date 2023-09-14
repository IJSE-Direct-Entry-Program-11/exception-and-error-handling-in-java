public class Demo17 {
    public static void main(String[] args) {
        System.out.println(divide(5, 0));
    }

    private static int divide(int num1, int num2){
        try {
            String abc = null;
            System.out.println(abc.toUpperCase());
            return num1 / num2;
        } catch (ArithmeticException ex){
            System.out.println("Caught the exception");
            throw ex;
        } finally {
            System.out.println("Entering into the final block");
            System.out.println(5 / 0);
            System.out.println("Exiting from the finally block");
        }
    }
}
