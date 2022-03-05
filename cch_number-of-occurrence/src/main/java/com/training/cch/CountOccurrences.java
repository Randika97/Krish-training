package com.training.cch;

import java.util.*;

public class CountOccurrences {

    public static HashMap<Character, Integer> characterCount(String inputString)
    {
        // Creating a HashMap to store the character and its count
        HashMap<Character, Integer> countChar = new HashMap<Character, Integer>();
        char arr[] = inputString.toLowerCase().toCharArray();
        //Sort Array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //loop through each character and count char
        for (char c : arr) {
            if (countChar.containsKey(c)) {
                countChar.put(c, countChar.get(c) + 1); //increase the char count by one
            }
            else {
                countChar.put(c, 1); //put the character and count as 1 if character doesn't exist
            }
        }
        //Loop through the hashmap and print the key and its value
        for (Map.Entry entry : countChar.entrySet()) {
            System.out.println(entry.getKey() + " count is : " + entry.getValue());
        }
        return countChar;//get the hashmap as a return for Junit testing.
    }

    // Main class
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter the word you want count :");
        String word = str.nextLine();
        characterCount(word);
    }
}
