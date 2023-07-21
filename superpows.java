import java.math.BigInteger;
import java.util.*;
public class superpows {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        int number=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
           number=number*10+arr[i];
        }
        double res=(Math.pow(a, number) % 1337);
    
      System.out.println(res);
        
    }
}
