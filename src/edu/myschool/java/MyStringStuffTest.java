package edu.myschool.java;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *  TODO - Build at least 1 additional test case per method and add them below.
 *  TODO - Change the last 3 test cases to your own tests, based on your implementations.
 *  Note:
 *  Do not import third-party libraries (other than JUNIT as provided)
 *  Starting out -> without changing anything this should pass 3 of 17 tests
 */
class MyStringStuffTest {

    private MyStringStuffInterface customStringHelper;

    @BeforeEach
    void setUp() {
        customStringHelper = new MyStringStuff();
    }

    @AfterEach
    void tearDown() {
        customStringHelper = null;
    }

    @Test
    void countDigits() {
        customStringHelper.setLetters("Now is the time for 30 good students to come to the aid of their instructor.");
        assertEquals(2, customStringHelper.countDigits());
    }

    @Test
    void countDigits2() {
        assertThrows(NullPointerException.class,
                ()->{
                    customStringHelper.countDigits();
                });
    }

    @Test
    void countDigits3() {
        customStringHelper.setLetters("3Now is the time for 30 good students to come to the aid of their instructor.3");
        assertEquals(4, customStringHelper.countDigits());
    }

    // characters are counted as 1,2,3,4... (not starting with 0)
    @Test
    void getEvenCharacters() {
        customStringHelper.setLetters("Now is the time for ALL good students to come to the aid of their instructor.");
        assertEquals("o stetm o L odsuet ocm oteado hi ntutr", customStringHelper.getEvenCharacters().toString());
    }

    @Test
    void getEvenCharacters2() {
        assertThrows(NullPointerException.class,
                ()->{
                    customStringHelper.getEvenCharacters();
                });
    }

    // characters are counted as 1,2,3,4... (not starting with 0)
    @Test
    void getOddCharacters() {
        customStringHelper.setLetters("Now is the time for ALL good students to come to the aid of their instructor.");
        assertEquals("Nwi h iefrALgo tdnst oet h i fterisrco.", customStringHelper.getOddCharacters().toString());
    }

    @Test
    void getOddCharacters2() {
        assertThrows(NullPointerException.class,
                ()->{
                    customStringHelper.getOddCharacters().toString();
                });
    }

    @Test
    void numbersDroppedString() {
        customStringHelper.setLetters("Now is the time for 30 good students to come to the aid of their instructor.");
        assertEquals("Now is the time for  good students to come to the aid of their instructor.", customStringHelper.numbersDroppedString().toString());
    }

    @Test
    void commasDroppedString() {
        customStringHelper.setLetters("Now, is the time for ALL good students, to come to the aid of their instructor.");
        assertEquals("Now is the time for ALL good students to come to the aid of their instructor.", customStringHelper.commasDroppedString().toString());
    }

    @Test
    void spacesDroppedString() {
        customStringHelper.setLetters("Now is the time for ALL good students to come to the aid of their instructor.");
        assertEquals("NowisthetimeforALLgoodstudentstocometotheaidoftheirinstructor.", customStringHelper.spacesDroppedString().toString());
    }

    @Test
    void sortedAscendingString() {
        customStringHelper.setLetters("abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        assertEquals("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", customStringHelper.sortedAscendingString());
    }

    @Test
    void sortedDescendingString() {
        customStringHelper.setLetters("abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        assertEquals("zyxwvutsrqponmlkjihgfedcbaZYXWVUTSRQPONMLKJIHGFEDCBA9876543210", customStringHelper.sortedDescendingString());
    }

    @Test
    void getReverseString() {
        customStringHelper.setLetters("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
        assertEquals("zyxwvutsrqponmlkjihgfedcbaZYXWVUTSRQPONMLKJIHGFEDCBA9876543210", customStringHelper.getReverseString());
    }

    @Test
    void getReverseString2() {
        customStringHelper.setLetters("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmn");
        assertEquals("nmlkjihgfedcbaZYXWVUTSRQPONMLKJIHGFEDCBA9876543210", customStringHelper.getReverseString());
    }

    // TODO - change the next 3 to your own tests
    @Test
    void convertDigitsToStrings() {
        customStringHelper.setLetters("10 20");
        assertEquals("ten twenty", customStringHelper.convertDigitsToStrings());
    }

    @Test
    void convertWordNumbersToDigits() {
        customStringHelper.setLetters("ten & twenty");
        assertEquals("10 & 20", customStringHelper.convertWordNumbersToDigits());
    }

    @Test
    void convertDigitsToRomans() {
        customStringHelper.setLetters("25");
        assertEquals("XXV", customStringHelper.convertDigitsToRomans());
    }
}