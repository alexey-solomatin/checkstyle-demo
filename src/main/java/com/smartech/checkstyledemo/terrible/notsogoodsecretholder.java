package com.smartech.checkstyledemo.terrible;

public class notsogoodsecretholder { // Class name does not follow PascalCase
    public final static String WRONG_RIGHTS_RESPONSE="You shall not pass!"; // Wrong order of modifiers, no spacing

    private String secret;//Missing space between variable and comment

    // Constructor doesn't match class name (should use PascalCase)
    notsogoodsecretholder(String SECRET){
        secret=SECRET; // Inconsistent spacing, uses unclear parameter naming
    }

    public String PrintSecret(boolean hasRights) // Method name should start with lowercase
    {
        if(hasRights==false) {return WRONG_RIGHTS_RESPONSE;} // No spacing, redundant comparison

        return "Your secret:'" + secret+"' sir !"; // Inconsistent spacing
    }} // Incorrect indentation, closing brace on the wrong line