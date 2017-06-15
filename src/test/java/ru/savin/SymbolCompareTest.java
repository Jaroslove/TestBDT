package ru.savin;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;


public class SymbolCompareTest {
    private final String ONE = "Abc D";
    private final String TWO = "d bC";

    @Test
    public void CompareStringCharacterAndGetArrayCharacter() {
        String expected = " bcd";
        SymbolCompare symbolCompare = new SymbolCompare();
        List<Character> listChar = symbolCompare.CompareString(ONE, TWO);
        StringBuilder actualBuilder = new StringBuilder();
        for (Character item : listChar) {
            actualBuilder.append(item);
        }
        String actual = actualBuilder.toString();
        assertEquals(expected, actual);
    }
}