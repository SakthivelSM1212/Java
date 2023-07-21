import java.util.*;
public class findthediff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String res="";
        int count=0;
        String str=sc.next();
        String str1=sc.next();
        char arr[]=str.toCharArray();
        char arr1[]=str1.toCharArray();
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr1[i]==arr[j])
                {
                  count++;
                }
            }
            if(count==0)
            {
                res+=arr1[i];
            }
        }
        System.out.println(res);
    }
}
