
package assignment5;

import java.util.Scanner;
public class exercise2 {
    public static void main(String[] args ){
            Scanner scanner= new Scanner(System.in);
           System.out.print("nhap so fibonacci can tim: ");
           
            int n =scanner.nextInt();
            int a=0, b=1, c=0, i=2;
            if(n==1) System.out.println("so fibonacchi can tim la: 0 ");
            else if(n==2) System.out.println("so fibonacchi can tim la: 1");
            else{ while (i<n){
                c=a+b;
                a=b;
                b=c;
                i=i+1;
            }
            System.out.println("so fibonacchi can tim la:"+b);
            }
    
                    }
}
