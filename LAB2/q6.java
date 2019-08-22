//Add 2 Matrices

import java.util.Scanner;

class q6 {
  public static void main(String[] args) {
    System.out.println("Enter n and m of n x m Matrix");
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int m=s.nextInt();
    System.out.println("Enter First Matrix Elements");
    int a[][]=new int[n][m];
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        a[i][j]=s.nextInt();
      }
    }
    System.out.println("Enter Second Matrix Elements");
    int b[][]=new int[n][m];
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        b[i][j]=s.nextInt();
      }
    }
    int c[][]=new int[n][m];
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        c[i][j]=a[i][j]+b[i][j];
      }
    }

    System.out.println("Sum of Matrix is: ");
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        System.out.print(c[i][j]+" ");
      }
       System.out.println();
    }

  }
}
