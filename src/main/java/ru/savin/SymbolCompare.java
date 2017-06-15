package ru.savin;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SymbolCompare {

    public List<Character> CompareString(String one, String two) {
        List<Character> result = new ArrayList<>();
        char[] oneChar = one.toLowerCase().toCharArray();
        char[] twoChar = two.toLowerCase().toCharArray();
        Arrays.sort(oneChar);
        Arrays.sort(twoChar);
        for (char item : oneChar) {
            for (int i = 0; i < twoChar.length; i++) {
                if (item == twoChar[i]) {
                    result.add(item);
                    continue;
                }
            }
        }
        return result;
    }
}
