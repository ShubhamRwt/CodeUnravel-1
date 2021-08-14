package Queue;

public class CircularQueue {

    int[] data;
    int rear;
    int front;
    int DEFAULT_SIZE;
    int size;

    public CircularQueue() {
        this.DEFAULT_SIZE = 3;
        this.data = new int[DEFAULT_SIZE];
        this.rear = 0;
        this.front = 0;
        this.size = 0;
    }

    public void insert(int element){

        if(isFull()){
            return;
        }

        rear = rear % data.length;
        this.data[rear++] = element;
        size++;
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int delete(){

        if(isEmpty()){
            return 0;
        }

        front = front % data.length;
        size--;
        return data[front++];
    }

//    public void display(){
//
//        for (int i = front; i <= rear ; i++) {
//            System.out.println(data[i]);
//        }
//    }

    public int peek(){
        return data[0];
    }
}
