 public class yesorno
{ 
  static boolean EqualNumbers(int a[], int n) 
  { 
        for (int i = 0; i < n; i++)  
         { 
          while (a[i] % 2 == 0)  
              { 
                a[i] /= 2; 
              } 
           while (a[i] % 3 == 0) 
            { 
                a[i] /= 3; 
         } 
    } 
  // Remaining numbers  
        for (int i = 1; i < n; i++)  
        { 
            if (a[i] != a[0]) 
            { 
                return false; 
            } 
        } 
  
        return true; 
    } 
   public static void main(String[] args)  
    { 
        int a[] = {50, 75, 100}; 
  
        int n = a.length; 
  
        if (EqualNumbers(a, n))  
        { 
            System.out.println("Yes"); 
        }  
        else 
        { 
            System.out.println("No"); 
        } 
    } 
}  
  
