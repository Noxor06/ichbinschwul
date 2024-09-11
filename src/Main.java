import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(0%26);
        final Character[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        Scanner scn = new Scanner(System.in);

        String word = scn.next();
        int key = scn.nextInt() % 26;

        char[] wordArr = word.toCharArray();

        for (int i = 0; i < wordArr.length; i++){
            int j;
            for (j = 0; j < arr.length; j++){
                if (arr[j] == wordArr[i]){
                    break;
                } else if (j == arr.length - 1 && i < wordArr.length - 1) {
                    System.out.print("?");
                    wordArr[i] = '?';
                    i++;
                    j = -1;
                }
            }

            System.out.print(arr[(key + j) % 26]);

            wordArr[i] = arr[(key + j) % 26];
        }

        System.out.println(); // decryption after here

        StringBuilder s = new StringBuilder();

        for (char c : wordArr) {
            if (c != '?') {
                s.append((char)(arr[(getIndex(arr, c) + Math.floorMod(-key, 26)) % 26]));
            } else {
                s.append('?');
            }
        }

        System.out.println(s);
    }

    public static <T> int getIndex(T[] arr, T key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }


}