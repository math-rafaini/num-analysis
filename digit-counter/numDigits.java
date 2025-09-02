public class numDigits
{
    public static void main(String [] args)
    {
        double n, p;
        int i;

        i = 0;
        n = 234.22;
        p = n;

        while(n != (int)n)
        {
            n = n * 10;
            i++;
        }

        p = p * 100;

        System.out.println(p);

        if(p == (int)p)
        {
            System.out.println("YES!");
        }
        else
        {
            System.out.println("NO! Wrong answer");
        }

        System.out.println(i);
    }
}
