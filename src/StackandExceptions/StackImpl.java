package StackandExceptions;

public class StackImpl {

    int[] stack;
    int top;
    int DEFAULT_SIZE;

    public StackImpl() {
        this.DEFAULT_SIZE = 10;
        this.stack = new int[DEFAULT_SIZE];
        this.top = 0;
    }


    public void push(int element){

        if(isFull()){
            return;
        }

        stack[top++] = element;

    }

    private boolean isFull() {

        return top == stack.length;
    }

//    public void peek(){
//
//    }

    public int pop() throws MyException {

        if(isEmpty()){
            throw new MyException("Khaali hu be");
        }
        return stack[--top];
    }

    private boolean isEmpty() {

        return top ==0;
    }

}
