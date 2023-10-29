import java.util.*;
public class roman1 {

    public static int getval(char ch)
    {
        switch(ch)
        {
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default:return 0;
        }
    }
    
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.next();
        int n=str.length();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            char ch1=str.charAt(i);
            if((i+1)<n && getval(ch1) < getval(str.charAt(i+1)))
            sum=sum-getval(ch1);
            else
            sum=sum+getval(ch1);
        }
        System.out.println(sum);
    }
}
