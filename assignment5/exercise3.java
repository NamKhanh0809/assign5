package assignment5;

public class exercise3 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + "*" + i + "=" + i * j);
                if (i == 10) {
                    System.out.print("  ");
                } else if (i * j >= 10) {
                    System.out.print("   ");
                } else {
                    System.out.print("    ");
                }

            }
            System.out.println();
        }
    }
}
