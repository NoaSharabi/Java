package lesson2.noa.sharabi;
import java.util.Scanner;
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public  static Double calculate(Integer num1,char op,Integer num2){
        Integer num=1;
        if(num2==null){
            for (int i = 2; i <=num1; i++) {
                num*=i;
            }
            return (double)num;
        }
        switch (op){
            case '+':
                return (double)(num1+num2);
            case '-':
                return (double)(num1-num2);
            case '*':
                return (double)(num1*num2);
            case '/':
            {
                if (num2 != 0)
                    return (double)(num1) / (double)(num2);
                System.out.println("Invalid Operation");
                return null;
            }
            case '^':
                return Math.pow(num1,num2);
            default:
                System.out.println("Invalid Operator");
        }
        return (double)-1;
    }
    public static void main(String[] args) {
        Integer num1,num2;
        char op = 0;
        String str;
        System.out.println("Enter drills");

        num1= scanner.nextInt();
        op=scanner.next().charAt(0) ;
        if(op=='!')
            num2=null;
        else
            num2= scanner.nextInt();
        while (num1!=0||op!='X'||num2!=0)
        {
            if ((calculate(num1,op,num2)!=null)&&( calculate(num1,op,num2) % calculate(num1,op,num2).intValue() == 0)){
                System.out.println((int)(calculate(num1,op,num2).intValue()));
            }
            else
                System.out.println(calculate(num1,op,num2));
            num1= scanner.nextInt();
            op=scanner.next().charAt(0);
            if(op=='!')
                num2=null;
            else
                num2= scanner.nextInt();
        }
    }
}