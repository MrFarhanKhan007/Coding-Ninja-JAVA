package Stacks;

public class StackUse2 {
    public static void main(String[] args) throws StackFullException {
        StackUsingArray2 s2= new StackUsingArray2(3);
        for (int i=0;i<=5;i++){
            s2.push(i);
        }
        while (!s2.isEmpty())
            try{
                System.out.println(s2.pop());
            }
            catch (StackEmptyException e){
                // never reach here
            }
    }
}
