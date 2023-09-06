public class Demo3 {

    /*  try...catch statment:

        uni-catch clause:
        try {



        } catch (Exception e){

        } 

        multi-catch clause:
        NumberFormatException|ArrayIndexOutOfBoundException|FormatException:= union type
        try {



        } catch (NumberFormatException|ArrayIndexOutOfBoundException|FormatException e){ 

        }         

        multiple-catch clauses:
        try {

        } catch (RuntimeException e){

        } catch (Exeception e){

        } catch (Throwable e){
            
        }
     */

    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler((t, e)->{
            System.out.println("Ahuuna...!");
        });
        System.out.println("Enter into the main");
        try {
            myMethod1();
        } catch (Throwable t){
            System.out.println("I got it my man...!");
        }
        System.out.println("Exit from the main");
    }

    static void myMethod1(){
        System.out.println("Enter into myMethod1");
        try {
            myMethod2();
        } catch (NumberFormatException e){
            System.out.println("I got it");
        } catch (NullPointerException e){
            System.out.println("I caught the null");
        }
        System.out.println("Exit from myMethod1");
    }

    static void myMethod2(){
        System.out.println("Enter into myMethod2");
        try {
            int[] numbers = new int[5];
            System.out.println(numbers[5]);
            System.out.println("Finalized");
        }catch(ArithmeticException exp){
            System.out.println("Yes I can handle this");
        }
        System.out.println("Exit from myMethod2");
    }    
}

// Enter into the main
// Enter into the myMethod1
// Enter into the myMethod2
// I got it my man...!
// Exit from the main