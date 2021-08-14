package StackandExceptions;

public class StackClient {

    public static void main(String[] args) throws Exception{

        StackImpl stack = new StackImpl();
//        stack.push(50);
//        stack.push(30);
//        stack.push(70);

        try {
            for (int i = 0; i < 3; i++) {
                System.out.println(stack.pop());
            }
        } catch (ArithmeticException e){
            System.out.println(e);
        } catch(Exception e) {
            System.out.println();
        } finally{
            System.out.println("Hello");
        }
    }

}
