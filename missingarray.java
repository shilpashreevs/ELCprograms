public class missingarray
{
    static int ar[]={10,20,30,40,50,60,70,80,90,100};
    
    public static void main(String[] args) 
    {
           displayMissing();       
    }
    
    
    static public void displayMissing()
    {
       System.out.print("given array(already sorted): ");
           for (int j = 0; j < ar.length; j++)
       System.out.print(ar[j] +" "); 
           
           System.out.print("\nNumbers missing between 1 to 100 in array :  ");
           
           int j=0;
           for(int i=1;i<=100;i++)
           {
                  if(j<ar.length && i==ar[j])
                        j++;
                  else
                        System.out.print(i+" ");
            }
     }
}
