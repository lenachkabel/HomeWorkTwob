import java.util.Scanner;
public class ZadanieOne
{
    public static void main(String[] args)
    {
        Scanner v=new Scanner (System.in);
        int a=v.nextInt();
        int b=v.nextInt();
        if (a>b) System.out.print("Большее "+a);
        else if (b>a) System.out.print("Большее "+b);
        else System.out.print("Числа равны");
    }
}

