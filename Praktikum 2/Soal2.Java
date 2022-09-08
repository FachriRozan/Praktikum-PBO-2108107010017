import java.util.Scanner;

public class Soal2{
    public static void main (String arg[]){
        Scanner s= new Scanner(System.in);
        int nilai;
        // String Nilaihuruf;
        System.out.print("Masukkan nilai: ");
        nilai=s.nextInt();
        if(nilai>=0 && nilai <41){
        System.out.println("E grade");
        }
        else if(nilai>=41 && nilai<51){
        System.out.println("D grade");
        }
        else if(nilai>=51 && nilai<60){
        System.out.println("C grade");
        }
        else if(nilai>=60 && nilai<69){
        System.out.println("BC grade");
        }
        else if(nilai>=69 && nilai<78){
        System.out.println("B grade");
        }
        else if(nilai>=78 && nilai<87){
        System.out.println("B grade");
        }
        else if(nilai>=87 && nilai<100){
        System.out.println("A grade");
        }else{
        System.out.println("Invalid!");
        } 
    }
}