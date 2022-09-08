public class Soal5 {
    public static void main(String arg[])
    {
        for (int i=1; i<=20; i++)
        {
            if(i%2==0)
            {
                if(i%6==0)
                continue;
                System.out.println(i);
            }else{
                continue;
            }
        }
    }
}