//Sort String Array
import java.util.*;

class q2 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    String a[]=new String[n];
    for (int i=0;i<n;i++){
      a[i]=s.next();
    }
    Arrays.sort(a);
    System.out.println("Sorted String Array is:");
    for (int i=0;i<n;i++){
      System.out.println(a[i]);
    }
  }
}
