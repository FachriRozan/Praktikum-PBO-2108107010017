import java.util.Scanner;

public class Soal1{
    public static void main (String arg[]){
        Scanner s= new Scanner(System.in);
        int num1, num2;
        System.out.print("Masukkan nilai Num1: ");
        num1= s.nextInt();
        System.out.print("Masukkan nilai Num2: ");
        num2= s.nextInt();
        System.out.println("num1+num2=  "+ (num1+num2));
        System.out.println("num1-num2=  "+ (num1-num2));
        System.out.println("num1*num2=  "+ (num1*num2));
        System.out.println("num1/num2=  "+ ((double)num1/num2));
        System.out.println("num1%num2=  "+ (num1%num2));
    }
}