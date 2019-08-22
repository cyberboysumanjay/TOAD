//Get Kth Smallest Element of Array

import java.util.*;
class q5 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
    for (int i=0;i<n;i++){
      a[i]=s.nextInt();
    }
    Arrays.sort(a);
    int k=s.nextInt();
    System.out.println(a[k-1]);
  }
}
