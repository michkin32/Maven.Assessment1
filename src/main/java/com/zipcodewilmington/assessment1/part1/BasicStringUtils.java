package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        char firstLetter = Character.toUpperCase(str.charAt(0));
        String capitalLetter = firstLetter + str.substring(1);
        return capitalLetter;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String reversedString = "";
        for (int i = str.length() - 1; i >= 0; i--){
            reversedString += str.charAt(i);
        }
        return reversedString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reversedString = reverse(str);
        String camelCased = camelCase(reversedString);
        return camelCased;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String cutString = str.substring(1, str.length() - 1);
        return cutString;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String invertedWord = "";
        for (int i = 0; i <= str.length() - 1; i++){
            Character letter = str.charAt(i);
            if (letter == letter.toUpperCase(letter)){
                invertedWord += letter.toLowerCase(letter);
            }else{
                invertedWord += letter.toUpperCase(letter);
            }
        }
        return invertedWord;
    }
}
