package Queue;

public class OptimizedQueue {

    int[] data;
    int rear;
    int front;
    int DEFAULT_SIZE;

    public OptimizedQueue() {
        this.DEFAULT_SIZE = 10;
        this.data = new int[DEFAULT_SIZE];
        this.rear = -1;
        this.front = 0;
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

        return data[front++];
    }

    public void display(){

        for (int i = front; i <= rear ; i++) {
            System.out.println(data[i]);
        }
    }

    public int peek(){
        return data[0];
    }
}
