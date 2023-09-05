public class Demo5 {
    public static void main(String[] args) {
        try {

            System.out.println("Hello");
            System.out.println(5 / 0);
            System.out.println("World");

        } catch (ArithmeticException e) {
            System.out.println("Kawuda yako 0 en beduwea...!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bound Exception ekak aawo!");
        } catch (Exception e) {
            System.out.println("Exception ekak aawoo..!");
        } catch (Throwable t) {
            System.out.println("Error Ekak aawo...!");
        }

        System.out.println("I am about to exit");
    }
}
