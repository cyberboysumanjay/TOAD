//Sort Numeric Array 
import java.util.*;

class q1 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
    for (int i=0;i<n;i++){
      a[i]=s.nextInt();
    }
    Arrays.sort(a);
    System.out.println("Sorted Array is:");
    for (int i=0;i<n;i++){
      System.out.println(a[i]);
    }
    
  }
}
