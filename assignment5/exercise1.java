package assignment5;

import java.util.Scanner;
import java.util.Random;

public class exercise1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int Rdnum = random.nextInt(50) + 1;

        int doan = 0;

        while (doan != Rdnum) {
            System.out.print("nhap so ban doan((tu 1 den 50): ");
            doan = scanner.nextInt();
            if (doan < Rdnum) {
                System.out.println("so cua ban doan nho hon so da cho");
            } else if (doan > Rdnum) {
                System.out.println("so cua ban doan lon hon so da cho");
            } else {
                System.out.println("ban da doan dung so " + Rdnum + "!");
            }
        }

        scanner.close();

    }
}
