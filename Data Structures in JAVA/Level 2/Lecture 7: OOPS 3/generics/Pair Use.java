package generics;

public class pairuse {
    public static void main(String[] args) {
        pair <String,String> p= new pair<String,String>("ab","cd");
        p.setFirst("def");
        String s=p.getFirst();

        pair<Integer,String> p1=new pair<Integer,String>(1,"Temp");
        pair<Character,Character> p2= new pair<>('a','c');

        int a=10;
        int b=12;
        int c=23;

        pair<Integer,Integer>internalpair= new pair<>(a,b);
        pair<pair<Integer,Integer>,Integer>p3=new pair<>(internalpair,c);

        System.out.println(p3.getSecond());
        System.out.println(p3.getFirst().getFirst());

    }
}
