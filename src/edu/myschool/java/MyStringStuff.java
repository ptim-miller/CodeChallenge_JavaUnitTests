package edu.myschool.java;

import java.util.Arrays;

/**
 *
 *  TODO - Complete each method below so all existing test cases pass.
 *  Do not hard code results. Will be graded with different test cases.
 *  TODO - Build at least 1 additional test case per method and add them all to MyStringStuffTest.
 *
 *  Note:
 *  Do not import third-party libraries (other than JUNIT as provided)
 *
 * TODO - Submit MyStringStuff.java and MyStringStuffTest.java to D2L upon completion.
 */

public class MyStringStuff implements MyStringStuffInterface {

    private String myLetters;

    @Override
    public void setLetters(String inputString) {
        this.myLetters = inputString;
    }

    @Override
    public String getLetters() {
        return this.myLetters;
    }

    // Returns total count of individual digits in a String (done for you)
    @Override
    public int countDigits() throws NullPointerException  {
        int counter = 0;
        for(int i = 0; i < myLetters.length(); i++){
            if(Character.isDigit(myLetters.charAt(i))){
                counter++;
            }
        }
        return counter;
    }

    // Returns just the even items from a string (start counting with 1)
    @Override
    public StringBuilder getEvenCharacters() throws NullPointerException  {
        return new StringBuilder(); //wrong!
    }

    // Returns just the odd items from a String (start counting with 1)
    @Override
    public StringBuilder getOddCharacters() throws NullPointerException  {
        return new StringBuilder(); //wrong!
    }

    // Removes digits from a String
    @Override
    public StringBuilder numbersDroppedString()  {
        return new StringBuilder(); //wrong!
    }

    // Removes commas from a String
    @Override
    public StringBuffer commasDroppedString()  {
        return new StringBuffer(); //wrong!
    }

    // Removes spaces from a String
    @Override
    public StringBuilder spacesDroppedString() {
        return new StringBuilder(); //wrong!
    }

    // Sorts a String in ascending order
    @Override
    public String sortedAscendingString()  {
        return this.myLetters; //wrong!
    }

    // Sorts a String in descending order
    @Override
    public String sortedDescendingString()  {
        return this.myLetters; //wrong!
    }

    // Reverses a String
    @Override
    public String getReverseString()  {
        return this.myLetters; //wrong!
    }

    /* (max conversion val 99 -> ninety-nine) - use dash as shown
     * Converts digits in a string to words, 9 converts to nine or 90 to ninety.
     * These may occur in a sentence or by themselves.
     * Write your own test cases.
     */
    @Override
    public StringBuilder convertDigitsToStrings() {
        return new StringBuilder();  //wrong!
    }

    /* (max conversion val ninety-nine -> 99)  - assume dash is always used as shown
     * Converts word representations of numbers, like nine to 9, or ninety to 90
     * These may occur in a sentence or by themselves.
     * 	Write your own test cases.
     */
    @Override
    public StringBuilder convertWordNumbersToDigits() {
        return new StringBuilder(); //wrong!
    }

    /* (max conversion val 1050)
     * Converts numbers in a string to Roman Numerals,
     * 25 converts to XXV and 1025 converts to MXXV
     * These may occur in a sentence or by themselves.
     * Write your own test cases
     */
    @Override
    public StringBuilder convertDigitsToRomans() {
        return new StringBuilder(); //wrong!
    }
}