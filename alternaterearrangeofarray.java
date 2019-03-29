import java.util.* ; 
  
 public class GFG 
{ 
  
   public  static void AlternateRearrange(int arr[], int n)  
    {  
    
          
  
         
        Arrays.sort(arr) ; 
          
        Vector v1 = new Vector();// for even values
        Vector v2 = new Vector(); //for odd values  
      
        for (int i = 0; i < n; i++)  
            if (arr[i] % 2 == 0)  
                v1.add(arr[i]);  
            else
                v2.add(arr[i]);  
      
        int index = 0, i = 0, j = 0;  
      
        boolean flag = false;  
      
       
        if (arr[0] % 2 == 0)// checking for the first eelement is even or not  
            flag = true;  
      
        //  rearranging array  
        while (index < n)  
        {  
      
            if (flag == true)  
            {  
                arr[index] = (int)v1.get(i);  
                i += 1 ; 
                index += 1 ; 
                flag = !flag;  
            }  
      
           
            else
            {  
                arr[index] = (int)v2.get(j) ;  
                j += 1 ; 
                index += 1 ; 
                flag = !flag;  
            }  
        }  
      
        for (i = 0; i < n; i++)  
            System.out.print(arr[i] + " ");  
    }  
      
 
    public static void main(String []args)  
    {  
        int arr[] = { 9, 8, 13, 2, 19, 14 };  
        int n = arr.length ; 
      
        AlternateRearrange(arr, n);  
    }  
} 