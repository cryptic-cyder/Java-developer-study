import java.util.EmptyStackException;

public class ArrayStack<T> {

    private T[] array;
    private int top;
    private int capacity;

    public ArrayStack(int capacity){
        this.capacity = capacity;
        top = 0;
        array = (T[]) new Object[capacity+1];
    }

    public void push(T data){

        if(top == capacity){
            throw new StackOverflowError("Stack is full...Cannot push");
        }

        top++;
        array[top] = data;
    }


    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        top--;
        return array[top];
    }


    public T peek(){

        if(isEmpty())
            throw  new EmptyStackException();

        return array[top];
    }

    public boolean isEmpty(){

        if(top==0)
            return true;

        return false;
    }

    public int returnSize(){

        return top;
    }

}
