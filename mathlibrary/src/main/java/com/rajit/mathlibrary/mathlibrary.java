package com.rajit.mathlibrary;

public class mathlibrary {

    public static float Plus(float a, float b){

        return a+b;
    }

    public static float Minus(float a, float b){

        return a-b;
    }

    public static float Multiply(float a, float b){

        return a*b;
    }

    public static float Division(float a, float b){

        if(b == 0)
            throw new IllegalArgumentException("Denominator cannot be zero.");
        else
        return a/b;
    }

    public static float Modulus(float a, float b){

        if(b == 0)
            throw new IllegalArgumentException("Denominator cannot be zero.");
        else
            return a%b;
    }

}
