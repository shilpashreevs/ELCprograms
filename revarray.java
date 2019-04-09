
import java.util.Scanner;

public class revarray {
    public static int[] reverse(int[] ar)
    {
        for(int i=0;i<ar.length/2;i++)
        {
            int temp=ar[i];
            ar[i]=ar[ar.length-1-i];
            ar[ar.length-1-i]=temp;
        }
            return ar;
    }
public static void main(String args[]) {
       Scanner sc=new Scanner (System.in);
       System.out.println("Enter size of array");
       int size=sc.nextInt();
       int[] ar=new int[size];
       System.out.println("Enter Array Elements");
		   for(int i=0;i<size;i++)
			   {
				   ar[i]=sc.nextInt();
			   }
       System.out.println("The array elements are:");
		   for(int i=0;i<size;i++)
		   {
			  System.out.println( ar[i]);
		   }
		   
       int[] res=reverse(ar);
       System.out.println("The Reverse array is:");
       for(int i=0;i<size;i++)
       {
           System.out.println(res[i]);
       }
        
    }
}
