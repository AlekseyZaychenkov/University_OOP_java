package Task_01;

import Task_01.GUI.GUI_Task_01;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

/**
 * Created by Aleksey Zaychenkov on 19.12.2019.
 */
public class StringHandler {
    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static int STEP_SIZE;
    static int INITIAL_STRING_SIZE;
    static final boolean ALLOWS_REPEATS = true;

    public static void run(int INITIAL_STRING_SIZE, int STEP_SIZE ) {
        String initialString = getRandomString(INITIAL_STRING_SIZE);
        TreeSet<String> tripletsSet = new TreeSet<String>();
        GUI_Task_01.getMyStringBuilder().append("INITIAL STRING: "+"\n");
        GUI_Task_01.getMyStringBuilder().append(initialString+"\n");
        GUI_Task_01.getMyStringBuilder().append("TRIPLETS: "+"\n");

        for (int i = initialString.length()-STEP_SIZE; i >=INITIAL_STRING_SIZE%STEP_SIZE ; i -= STEP_SIZE) {
            GUI_Task_01.getMyStringBuilder().append("LEFT IN STRING:  "+initialString.substring(0, i+STEP_SIZE)+"\n");
            String triplet = new String(initialString.substring(i, i+STEP_SIZE).toCharArray());
            GUI_Task_01.getMyStringBuilder().append("("+triplet+")=>");

            triplet = triplet.substring(0,1)+randomCharGenerator(triplet.toCharArray())+triplet.substring(2,STEP_SIZE);
            GUI_Task_01.getMyStringBuilder().append("("+triplet+")"+"\n");

            if(ALLOWS_REPEATS)
                if (tripletsSet.contains(triplet))
                    triplet = triplet+" ";
            tripletsSet.add(triplet);
        }

        GUI_Task_01.getMyStringBuilder().append("SORTED TRIPLETS: "+"\n");

        for (String triplet : tripletsSet)
            GUI_Task_01.getMyStringBuilder().append("("+triplet+")"+"\n");

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
