import java.util.*;
public class panagram
 {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.next();
        
        str=str.replace(" ","");//replacing blank spaces with null ,means blank spaces will be removed

        str=str.toUpperCase();
        char y[]=str.toCharArray(); //coverting string into array of characters elements
        int size=y.length;//remember in char array in length we dont use()
        int a[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};//this we will change to 1 when a-z char will be present in string ,
        // if all becomes 1 it means there are albhabets from a-z

        int i=0;
        while(i!=size){
            int index=y[i]-65;//will get what capital albhabet is present,let H, ascii value for h is 72,72-65=7,and H is 7 th albhabet
            // we will then update 7 th position value of array a to 1 from 0 meaning H is present in the string
            a[index]=1;
            ++i;
        }
        int ctr=0;
        for(i=0;i<26;i++)
        {
       if(a[i]==1) //here checkng if all the values in the array a is 1 or not,if yes then it is panagram
            {
                ctr++;
            }
        }
            if(ctr==26)
            {

            
                System.out.println("panagram");
                
            }
        else{
        System.out.println(" not panagram");

    
}
 }
}
