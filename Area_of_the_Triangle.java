import java.util.Scanner;
public class s
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        float s,area;
        s=(float)(a+b+c)/2;
        area=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",area);
    }
}