package Task_01;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */

import java.util.*;

// Дана строка. Разделить строку на фрагменты по три подряд идущих символа.
// В каждом фрагменте средний символ заменить на случайный символ, не совпадающий ни с одним из символов этого фрагмента.
// Показать фрагменты, упорядоченные по алфавиту.


public class Main {
    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static final int STEP_SIZE = 3;
    static final int INITIAL_STRING_SIZE = 100;
    static final boolean ALLOWS_REPEATS = true;

    public static void main(String[] args) {
        String initialString = getRandomString(INITIAL_STRING_SIZE);
        TreeSet<String> tripletsSet = new TreeSet<String>();
        System.out.println("INITIAL STRING: ");
        System.out.println(initialString);
        System.out.println("TRIPLETS: ");

        for (int i = initialString.length()-3; i >=INITIAL_STRING_SIZE%STEP_SIZE ; i -= STEP_SIZE) {
            System.out.println(initialString.substring(0, i+STEP_SIZE));
            String triplet = new String(initialString.substring(i, i+STEP_SIZE).toCharArray());
            System.out.print("("+triplet+")=>");
            triplet = triplet.substring(0,1)+randomCharGenerator(triplet.toCharArray())+triplet.substring(2,STEP_SIZE);
            System.out.println("("+triplet+")");

            if(ALLOWS_REPEATS)
                if (tripletsSet.contains(triplet))
                    triplet = triplet+" ";
            tripletsSet.add(triplet);
        }

        System.out.println("SORTED TRIPLETS: ");
        for (String triplet : tripletsSet)
            System.out.println("("+triplet+")");
    }

    private static char randomCharGenerator(char[] exceptForCharacter) {
        char[] alphabetChar = ALPHABET.toCharArray();
        Character[] availableAlphabet = setDifference(alphabetChar, exceptForCharacter);
        return availableAlphabet[new Random().nextInt(availableAlphabet.length)];
    }

    private static String getRandomString(int capacity) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < capacity; i++)
            sb.append(randomCharGenerator("".toCharArray()));
        return sb.toString();
    }

    private static Character[] setDifference(char[] arr1, char[] arr2) {
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        for (char ch :arr1 )
            set1.add(ch);
        for (char ch :arr2 )
            set2.add(ch);
        set1.removeAll(set2);
        return set1.toArray(new Character[0]);
    }
}
