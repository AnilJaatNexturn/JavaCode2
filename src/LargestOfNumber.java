import java.util.Arrays;
import java.util.Scanner;

public class LargestOfNumber {
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();


        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        Arrays.sort(arr);
        for(int i=n-1;i>n-3;i--){
            System.out.println(arr[i]);
        }


    }
}
