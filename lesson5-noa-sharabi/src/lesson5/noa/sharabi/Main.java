package lesson5.noa.sharabi;

import java.util.Date;
import java.util.Scanner;

public class Main {
    Scanner scanner=new Scanner(System.in);
    private static SortedArray<Integer>arr1=new SortedArray<>();
    private static SortedArray<String>arr2=new SortedArray<>();
    private static SortedArray<Date>arr3=new SortedArray<>();
    private static SortedArray<Pupil>arr4=new SortedArray<>();
    public static void initArr1(){
        arr1.addItem(4555);
        arr1.addItem(5);
        arr1.addItem(444);
        arr1.addItem(355);
    }
    public static void initArr2(){
        arr2.addItem("hello");
        arr2.addItem("my");
        arr2.addItem("NOA");
        arr2.addItem("hello");
        arr2.addItem("HELLO");
        arr2.addItem("name");

    }
    public static void initArr3(){
        arr3.addItem(new Date(100,5,5));
        arr3.addItem(new Date(120,3,7));
        arr3.addItem(new Date(100,3,7));
        arr3.addItem(new Date(122,5,5));
    }
    public static void initArr4(){
        arr4.addItem(new Pupil(1,"Shosha"));
        arr4.addItem(new Pupil(2,"Rivka"));
        arr4.addItem(new Pupil(3,"Chana"));
        arr4.addItem(new Pupil(4,"Matilda"));
        arr4.addItem(new Pupil(5,"leah"));
        arr4.addItem(new Pupil(6,"clara"));
        arr4.addItem(new Pupil(7,"sara"));
    }

    public static void main(String[] args) {
        initArr1();
        initArr2();
        initArr3();
        initArr4();
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr3);
        System.out.println(arr4);
    }
}
