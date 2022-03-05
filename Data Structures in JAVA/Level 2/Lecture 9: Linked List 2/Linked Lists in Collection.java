package LinkedLists;
import java.util.LinkedList;
public class LinkedListsinCollection {
    public static void main(String[] args) {
        LinkedList <Integer> l1= new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.addFirst(40);
        l1.addFirst(70);
        l1.set(2,100);
        System.out.println(l1.size());
        for (int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+ " ");
        }
    }
}
