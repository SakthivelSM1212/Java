import java.util.*;
public class missingno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
             count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(i==arr[j])
                {
                    count++;
                }
            }
            if(count==0)
            {
                System.out.println(i);
            }
           
        }
    }
}
