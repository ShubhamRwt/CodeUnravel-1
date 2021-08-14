package Queue;

public class Queue {

    private int[] data;
    private int rear;
    private int DEFAULT_SIZE;

    public Queue() {
        this.DEFAULT_SIZE = 3;
        this.data = new int[DEFAULT_SIZE];
        this.rear = -1;
    }

    public void insert(int element){

        if(isFull()){
            return;
        }

        this.data[++rear] = element;
    }

    public boolean isFull(){
        return rear == data.length - 1;
    }

    public boolean isEmpty(){
        return rear == -1;
    }

    public int delete(){

        if(isEmpty()){
            return 0;
        }
        int ele =  this.data[0];

        for (int i = 1; i <=rear ; i++) {

            this.data[i-1] = this.data[i];
        }

        return ele;
    }

    public int peek(){
        return data[0];
    }
}
