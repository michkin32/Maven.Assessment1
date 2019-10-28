package com.zipcodewilmington.assessment1.part2;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
        String[] fullString = sentence.split(" ");
        return fullString;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        String[] sentenceArray = getWords(sentence);

        return sentenceArray[0];
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String firstWord = getFirstWord(sentence);
        String reversedWord = BasicStringUtils.reverse(firstWord);
        return reversedWord;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        String reverseFirstWord = reverseFirstWord(sentence);
        String camelCaseWord = BasicStringUtils.camelCase(reverseFirstWord);
        return camelCaseWord;
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        String newString = "";

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != str.charAt(index)){
                newString += str.charAt(i);

            }
        }
        return newString;
    }

}
