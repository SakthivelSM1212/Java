import java.util.*;
public class countstr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int count=0;
        while(t-->0)
        {
            String str=sc.next();
            count=0;
            char ch=sc.next().charAt(0);
            char arr[]=str.toCharArray();
            for(int i=0;i<arr.length;i++)
            {
               if(arr[i]==ch)
               {
                count++;
               }
            }
            System.out.println(count);

        }
    }
}
