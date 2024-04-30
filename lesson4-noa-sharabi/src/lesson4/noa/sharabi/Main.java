package lesson4.noa.sharabi;
import java.util.Scanner;
public class Main {
    private static Scanner scanner=new Scanner(System.in);
    public static String encrypt(String text,int key){
        StringBuilder sb=new StringBuilder();
        char currentLetter;
        for (int i = 0; i < text.length(); i++) {
            currentLetter=(char) (text.charAt(i)+key%26);
            if (currentLetter>'z')
                currentLetter=(char) ('a'+(currentLetter-'z'-1));
            else if(currentLetter>'Z'&&currentLetter<'a'-key%26)
                currentLetter=(char) ('A'+(currentLetter-'Z'-1));
            sb.append(currentLetter);
        }
        return sb.toString();
    }
    public static String decrypt(String text,int key){
        StringBuilder sb=new StringBuilder();
        char currentLetter;
        for (int i = 0; i < text.length(); i++) {
            currentLetter=(char) (text.charAt(i)+key%26);
            if(currentLetter<'A')
                currentLetter=(char) ('Z'-('A'-currentLetter-1));
            else if(currentLetter>'Z'+key%26&&currentLetter<'a')
                currentLetter=(char) ('z'-('a'-currentLetter-1));
            sb.append(currentLetter);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str="";
        int  key;
        System.out.println("Enter your text");
        str=scanner.next();
        System.out.println("Enter your key");
        key=scanner.nextInt();
        if (key>0)
            System.out.println(encrypt(str,key));
        else
            System.out.println(decrypt(str,key));
    }
}
