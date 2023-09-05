public class Demo6 {
    public static void main(String[] args) {
        try {

            System.out.println("Hello");
            System.out.println(5 / 0);
            System.out.println("World");

        } catch (ArithmeticException|ArrayIndexOutOfBoundsException exception) {
            //exception = null;
            System.out.println("Kawuda yako 0 en beduwea...!");
        } catch (final Exception exception) {
            // exception = null;
            System.out.println("Exception ekak aawoo..!");
        } catch (Throwable t) {
            System.out.println("Error Ekak aawo...!");
        } 
        // catch (Exception | Throwable e){         // This can't be done

        // }
        // catch (Exception | Error e){             // This can be done

        // }

        System.out.println("I am about to exit");
    }
}
