
package assignment5;

import java.util.Scanner;
public class exercise4 {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.print("nhap 1 so tu nhien: ");
          int n = scanner.nextInt();
          for(int i=1;i<=n;i++){
              for(int j=1;j<=i;j++)
                  System.out.print(j+" ");
              System.out.println();
          }
      } 
      }

