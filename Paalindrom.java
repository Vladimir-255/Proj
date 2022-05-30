package collectrionPackage;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.BufferedReader;

public class Paalindrom {
    public static void main(String[] args) {
       String x ="madam";
      palindrom("madama");
    }
     public static void palindrom(String word) {
       // Scanner scan = new Scanner(System.in);
        //String word = scan.nextLine();
        List<Character> set = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            set.add(word.charAt(i));
        }
        int x = word.length() - 1;
        int z = 0;

        for (int i = 0; i < word.length(); i++) {
            if (set.get(i) == set.get(x)) {
                z++;
            } else {
                z--;
            }
            x--;
        }
        if (z == word.length()) {
            System.out.print("Палиндром");
        } else {
            System.out.println("Не палиндром");

        }
    }
}