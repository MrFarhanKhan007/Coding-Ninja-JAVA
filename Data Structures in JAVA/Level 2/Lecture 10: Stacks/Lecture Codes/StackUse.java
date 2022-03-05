package Stacks;

public class StackUse {
    public static void main(String[] args) throws StackFullException {
        StackUsingArray s1= new StackUsingArray();
        for (int i=0;i<=5;i++){
            s1.push(i);
        }
        while (!s1.isEmpty())
        try{
            System.out.println(s1.pop());
        }
        catch (StackEmptyException e){
            // never reach here
        }
    }
}
