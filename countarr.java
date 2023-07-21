import java.util.*;

public class hello_maama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String str = sc.next();
        char arr[] = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = '0';
                }
            }
            if (arr[i] != '0') {
                System.out.println(arr[i] + " " + count);
            }
        }
    }
}
