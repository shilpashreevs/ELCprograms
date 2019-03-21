public class lsnum{
public static void main (String[] args){
int num[] = new int[]{11,13,44,96,82,7,77,33,59};

int small = num[0];
int large = num[0];

for(int i=1;i<num.length;i++)
{
if (num[i]>large)
large=num[i];
else if(num[i]<small)
small=num[i];
}
System.out.println("The largest number is:"+large);
System.out.println("The smallest number is:"+small);
}
}