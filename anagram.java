import java.util.*;
public class anagram {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str=sc.next();
       String str2=sc.next();
       char arr[]=str.toCharArray();
       char arr1[]=str2.toCharArray();
       Arrays.sort(arr);
       Arrays.sort(arr1); 
       System.out.println(Arrays.equals(arr, arr1));
       } 
    }

