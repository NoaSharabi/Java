package lesson1.noa.sharabi;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.indexOf;
import static jdk.nashorn.internal.objects.NativeString.substring;
public class Main {
private static Scanner scanner=new Scanner(System.in);
public static boolean method1(int number){
    int index=2;
    while (index<=Math.sqrt(number)){
            if(number%index==0)
                return false;
            index++;
        }
        return true;
    }

    public static int method2(int number){
        int newNumber=0;
        while (number>0){
            newNumber*=10;
            newNumber+=number%10;
            number/=10;
        }
        return newNumber;
    }
    public static boolean method3(int[] arr){
        int start=0,end=arr.length-1;
        while (end>start)
        {
            if (arr[start]!=arr[end])
                return false;
            start++;
            end--;
        }
        return true;
    }
    public static void method4(int[] arr){
        int temp;
        boolean wasUsed=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    wasUsed=true;
                }
            }
            if (!wasUsed)
                return;
            wasUsed=false;
        }
    }
    public static int method5(String str,String subStr){
        int index=indexOf(str,subStr),count=0;
        while (index!=-1)
        {
            str= substring(str,index+subStr.length());
            count++;
            index=indexOf(str,subStr);
        }
        return count;
    }
    public static void method6(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if ((i+j)%2==0)
                    mat[i][j]=0;
                else
                    mat[i][j]=1;
            }
        }

    }
    public static int[][] method7(int[][] mat){
        int temp;
        for (int i = 0; i < (mat.length)/2; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                temp=mat[i][j];
                mat[i][j]=mat[mat.length-i-1][j];
                mat[mat.length-i-1][j]=temp;
            }
        }
        return mat;
    }


    public static void main(String[] args) {
        int[] arr={7,5,7,8,9,8,7,5,7};
        System.out.println(method1(79));
        System.out.println(method2(1234));
        System.out.println(method3(arr));
        method4(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println();

        System.out.println(method5("gegege","ge"));
        System.out.println();

        int[][] mat=new int[8][8];
        method6(mat);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j]=i+j;
            }
        }
        System.out.println();

        method7(mat);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}


