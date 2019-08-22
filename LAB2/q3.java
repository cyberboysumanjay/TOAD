//Reverse Array Elements

import java.util.*;
class q3 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
    for (int i=0;i<n;i++){
      a[i]=s.nextInt();
    }
    int rev[]=new int[n];
    for(int i=a.length-1, j=0;j<n;i--,j++){
      rev[j]=a[i];
    }
    System.out.println("Reversed Array is:");
    for (int i=0;i<n;i++){
      System.out.println(rev[i]);
    }
  }
}
