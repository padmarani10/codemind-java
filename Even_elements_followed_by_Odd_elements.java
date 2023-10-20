import java.util.Scanner;
public class sample
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int oddElements[]=new int[a.length];
        int evenElements[]=new int[a.length];
        int oddelement=0,evenelement=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                evenElements[evenelement]+=a[i];
                evenelement++;
            }
            else
            {
                oddElements[oddelement]+=a[i];
                oddelement++;
            }
        }
            for(int i=0;i<evenelement;i++)
            {
                System.out.print(evenElements[i]+" ");
            }
            for(int i=0;i<oddelement;i++)
            {
                System.out.print(oddElements[i]+" ");
            }
        
    }
    
}