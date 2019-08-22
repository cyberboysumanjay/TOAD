//Find common elements from 2 Strings

import java.util.*;
class q4 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    String a[]=new String[n];
    for (int i=0;i<n;i++){
      a[i]=s.next();
    }
    String b[]=new String[n];
    for (int i=0;i<n;i++){
      b[i]=s.next();
    }

    String c[]=new String[n];
    for(int i=0; i<n; i++){
      for (int j=0;j<n;j++){
        if(a[i].equals(b[j])){
          System.out.println(a[i]);
        }
      }
    }

  }
}
