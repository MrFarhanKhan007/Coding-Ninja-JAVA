package generics;

import final_keyword.Vehicle;

public class print {
    public static <T extends PrintInterface> void printArray(T a[]) {
        for (int i = 0; i < a.length;i++){
            a[i].print();
        }
    }

    public static void main(String[] args) {
        Integer a[]= new Integer[10];
        for (int i=0;i<10;i++){
            a[i]=i+1;
        }
        String s[]= new String[10];
        for (int i=0;i<10;i++){
            s[i]="abc";
        }
        //printArray(a);
        System.out.println();
       // printArray(s);

        Vehicle v[]= new Vehicle[10];
        for (int i=0;i<10;i++){
            v[i]=new Vehicle(10);
        }
        System.out.println();
        printArray(v);

        Student s1[]= new Student[10];
        for (int i=0;i<10;i++){
            s1[i]=new Student();
        }
        System.out.println();
        printArray(s1);
    }

}
