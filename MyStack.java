import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack {
    private ArrayList<Integer> stackList;
    private int size=0;

    public MyStack(){
        stackList=new ArrayList<>();
    }

    public void push(int integer){
        if(!isFull()){
        stackList.add(0,integer);
        size++;}
    }

    public int pop() {
        if (!stackList.isEmpty()) {
            int removed = stackList.get(0);
            stackList.remove(0);
            return removed;
        }
        throw new EmptyStackException();
    }
    public int top(){
        if(!stackList.isEmpty()){
            return stackList.get(0);
        }
        throw new EmptyStackException();

    }
    public boolean isEmpty(){
        return stackList.size() == 0;
    }

    public boolean isFull() {
        return stackList.size() == 10;
    }

    public int size(){
        return size;
    }
}
