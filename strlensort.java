import java.util.*;
public class strlensort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1[]=str.split(" ");
        String array[]=new String[str1.length];
        int arr[]=new int[str1.length];
        int len;
        for(int i=0;i<str1.length;i++)
        {
            len=str1[i].length();
            arr[i]=len;    
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
        System.out.print(arr[i]+" ");
        }
        for(int k=0;k<str1.length;k++)
        {
            for(int j=0;j<arr.length;j++)
            {
              if(str1[k].length()==arr[j])
              {
               array[j]=str1[k];
              }
            }
        }
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
