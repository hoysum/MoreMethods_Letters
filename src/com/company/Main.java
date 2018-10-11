package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Get 5 letters from the user, output them sorted (Hint: Use ArrayList and Collections.sort())
public class Main {

    static ArrayList<String> lettersArray = new ArrayList<>();

    public static void main(String[] args) {
        // write your code here
        promptUser();

    }

    public static void promptUser() {
        for (int index = 1; index <= 5; index++) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter 5 letters");
            String yourLetter = keyboard.next();
            lettersArray.add(yourLetter);
        }
        printArrayList();  //calls printArrayList method
    }


    public static void printArrayList() {
        Collections.sort(lettersArray);
        for (String s : lettersArray)
            System.out.println(s);
    }

}
