import java.util.Scanner;
public class NextGreater{
public static void greater(int arr[])
{
int next;
       for (int i=0; i<arr.length; i++)
       {
           next = -1;
           for (int j = i+1; j<arr.length; j++)
           {
               if (arr[i] < arr[j])
               {
                   next = arr[j];
                   break;
               }
           }
           System.out.println(arr[i]+" = "+next);
       }
}
public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
              System.out.println("enter the array size:");
              int size=sc.nextInt();
             
              System.out.println("enter the array :");
               int[] arr=new int[size];
               for(int i=0;i<size;i++)
               {
                   arr[i]=sc.nextInt();
               }
               System.out.println("Next greater elements are :");
greater(arr);
}
}
