import java.util.Scanner;

public class Vigenere extends Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Value        :");
        String message = scn.next();

        System.out.print("Enter Key          :");
        String key = scn.next();

        char[] messageArr = message.toCharArray();
        char[] keyArr = key.toCharArray();
        char[] fullKeyArr = new char[messageArr.length];

        for (int i = 0; i < messageArr.length; i++) {
            fullKeyArr[i] = keyArr[(i % keyArr.length)];
        }

        System.out.println("The full key is    :" + String.valueOf(fullKeyArr));

        System.out.print("Character Value    :");

        for (int i = 0; i < messageArr.length; i++) {
            messageArr[i] = (char) (((((int)((messageArr[i])) - 97) + (((int)(fullKeyArr[i])) - 97)) % 26) + 97);
            System.out.print(((int)((messageArr[i])) - 97) + (((int)(fullKeyArr[i])) - 97) + ", ");
        }

        System.out.println();

        System.out.println("Encrypted String   :" + String.valueOf(messageArr));
        System.out.print("Character Value    :");

        for (int i = 0; i < messageArr.length; i++) {
            messageArr[i] = (char) (Math.floorMod((((int)((messageArr[i])) - 97) - (((int)(fullKeyArr[i])) - 97)), 26) + 97);
            System.out.print(((int)((messageArr[i])) - 97) - (((int)(fullKeyArr[i])) - 97) + ", ");
        }

        System.out.println();

        System.out.println("Decrypted String   :" + String.valueOf(messageArr));
    }
}
