
public class Stack {
    private int top = -1;
    private int[] storage = new int[10];

    public int pop() throws Exception {
        if (top == -1){
            throw new Exception("the stack is empty");
        }
        return storage[top--];

    }
    public boolean isEmpty(){
        return top != -1;

    }
    public void push(int input){

        storage[++top] = input;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(2);
        stack.push(0);
        stack.push(4);
        try {
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(stack.isEmpty());
        try {
            stack.pop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
