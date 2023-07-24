package ReverseString;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseString {
    public static String stringRevise(String input) {
        char[] ch = input.toCharArray();
        List<Character> charList = new ArrayList<>();
        for (char c : ch) {
            charList.add(c);
        }
        Collections.reverse(charList);

        // Convert the reversed list back to a string
        StringBuilder reversedString = new StringBuilder(charList.size());
        for (Character c : charList) {
            reversedString.append(c);
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter anything to reverse a letter or word:");
        String word = sc.nextLine();
        String reversedWord = stringRevise(word);
        System.out.println("Reversed: " + reversedWord);
    }
}
