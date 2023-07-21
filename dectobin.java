import java.util.*;
public class dectobin {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       String s="";
       int count=0,count1=0;
        while(n!=0)
        {
            int rem=n%2;
            if(rem==0)
            {
                count++;
            }
            else
            {
                count1++;
            }
            s=rem+s;
            n/=2;
        }  
        System.out.println("The count of one is"+ count1+ " "+"The count of zero is"+ count);
    }
}
