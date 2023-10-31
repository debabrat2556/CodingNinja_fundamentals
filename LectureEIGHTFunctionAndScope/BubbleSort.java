import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter size of the array");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=1;j<n;j++)
            {
                 int temp=0;
                if(arr1[j]>arr1[i])
                {
                    temp=arr1[i];
                    arr1[j]=arr1[i];
                    arr1[i]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
             System.out.print(arr1[i]);
        }
    }
}
