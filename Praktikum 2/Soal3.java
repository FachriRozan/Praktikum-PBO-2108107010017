public class Soal3 {
    public static void main(String arg[])
    {
        for (int i=0; i<5; i++)
        {
        for (int j=5; j>=i+1; j--)
            System.out.print('*');
        System.out.println();
        }
    }
}