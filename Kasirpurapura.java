import java.util.Scanner;
public class Kasirpurapura
{
    public static void main(String arg[]){
    Scanner s= new Scanner(System.in);
    int unit1;
    int barang1;
    int barang2;
    int unit2;
    int harga;
    System.out.println("Selamat datang di toko");
    System.out.println("Harga barang: ");
    System.out.print("Barang 1: ");
    barang1= s.nextInt();
    System.out.print("Masukkan jumlah unit barang 1: ");
    unit1= s.nextInt();
    System.out.print("Barang 2: ");
    barang2= s.nextInt();
    System.out.print("Masukkan jumlah unit barang 2: ");
    unit2= s.nextInt();
    harga= ((unit1*barang1)+(unit2*barang2));
    harga=harga-(harga*15/100);
    System.out.println("Harga seluruh barang adalah: "+harga);
    }
}