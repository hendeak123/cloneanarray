package com.alyssa;

public class Main {

    public static void main(String[] args) {
	    String[] newArray = {"dog", "cat", "bird"};
        for (int number = 0; number < newArray.length; number++) {
            System.out.println(newArray[number]);
        }
	    cloneAnArray(newArray);
    }

    private static void cloneAnArray(String newArray[]) {
        String[] arrayClone = newArray.clone();
        for (int number = 0; number < arrayClone.length; number++) {
            System.out.println(arrayClone[number] + " clone.");
        }
    }


}
