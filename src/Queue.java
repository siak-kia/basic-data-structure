

public class Queue {
    private int end = -1;
    private int[] storage = new int[10];

    public int dequeue() throws Exception {
        if (end == -1){
            throw new Exception("the queue is empty");
        }
        int result = storage[0];
       // shifting all the elements to the left
       for (int i = 1; i <= end ; i++){
           storage[i -1] = storage[i];
       }
       end--;
       return result;
    }

    public boolean isEmpty(){
        return end != -1;

    }



    public void enqueue(int input){

        storage[++end] = input;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(2);
        queue.enqueue(0);
        queue.enqueue(4);

        try {
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println(queue.isEmpty());
//        try {
//            queue.dequeue();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

}
