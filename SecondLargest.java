import java.util.*;
public class SecondLargest{
    public static int[] SecondOrder(int a[]) {
int large=Integer.MIN_VALUE,secondLarge=Integer.MIN_VALUE;
int small=Integer.MAX_VALUE,secondSmall=Integer.MAX_VALUE;
for(int i=0;i<a.length;i++){
if(a[i]>large){
    secondLarge=large;
    large=a[i];
}else if(a[i]>secondLarge && a[i]!=large){
    secondLarge=a[i];
}
//smallest
if(a[i]<small){
    secondSmall=small;
    small=a[i]; 

}else if(a[i]<secondSmall && a[i]!=small){
    secondSmall=a[i];
}
}
if(secondLarge == Integer.MIN_VALUE || secondSmall == Integer.MAX_VALUE) {
    return new int[]{-1, -1}; // Return -1 if second largest or second smallest doesn't exist
}
return new int[]{secondLarge, secondSmall};
    }

  

    public static void main(String args[]){
        int a[]={4,6,4,8,9,4,2,5};
        int result[]=SecondOrder(a);
        System.out.println("Second Largest Element is: "+result[0]);
        System.out.println("Second Smallest Element is: "+result[1]);

    }
}