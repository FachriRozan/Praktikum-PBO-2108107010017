public class Soal4 {
    public static void main(String arg[])
    {
        for (int i=1; i<=20; i++)
        {
            if(i%2==0){
            System.out.println(i);
            }else{
                continue;
            }
        }
    }
}