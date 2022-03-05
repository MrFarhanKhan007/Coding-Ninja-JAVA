package Stacks;

public class StackUsingArray2 {
    private  int data[];
    private  int top; //is the index of the topmost element of the stack

    public StackUsingArray2(){
        data= new int [10];
        top=-1;
    }
    public StackUsingArray2(int capacity){
        data= new int[capacity];
        top=-1;
    }

    public boolean isEmpty(){
//        if (top==-1){
//            return true;
//        }
//        else {
//            return false;
//        }
        return (top==-1);
    }

    public int size(){
        return top+1;
    }
    public int top() throws StackEmptyException {
        if (size()==0){
            //Stack Empty
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        return data[top];
    }
    public void push(int elem) throws StackFullException {
        if (size()== data.length){
            DoubleCapacity();
        }
        top++;
        data[top]=elem;

    }

    private void DoubleCapacity() {
        int temp[]=data;
        data= new int[2*temp.length];
        for (int i=0;i<=top;i++){
            data[i]=temp[i];
        }
    }

    public int pop() throws StackEmptyException {
        if (size()==0){
            StackEmptyException e= new StackEmptyException();
            throw e;
        }
        int temp= data[top];
        top--;
        return temp;
    }
}
