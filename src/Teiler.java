import java.util.Scanner;

public class Teiler {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while(true) {
            int i = scn.nextInt() % 26;

            for (int j = 0; j <= 100; j++) {
                if (j % 26 == i) {
                    System.out.print(j + " ,");
                }
            }
        }
    }
}
