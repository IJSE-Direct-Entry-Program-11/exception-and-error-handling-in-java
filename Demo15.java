public class Demo15 {
    public static void main(String[] args) {
        try {
            System.out.println("Entering into the try block");
            // System.out.println(5 / 0);
            System.out.println(5 / 1);
            System.out.println("Exiting from the try block");
        } finally {
            System.out.println("Nawa gilunath ban choon");
        }
    }
}
