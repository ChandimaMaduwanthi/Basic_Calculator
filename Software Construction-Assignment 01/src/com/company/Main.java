package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File myFile = new File("textFile.txt");
        myFile.createNewFile();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number1:");
        int n1 = input.nextInt();

        System.out.println("Enter number2:");
        int n2 = input.nextInt();

        System.out.println("Which operation do you want to perform(add/sub/mul/div)?");
        String ans = input.next();

        switch (ans){
            case "add" :
                add(n1,n2);
                break;

            case "sub" :
                sub(n1,n2);
                break;

            case "mul" :
                mul(n1,n2);
                break;

            case "div" :
                div(n1,n2);
                break;

            default:
                System.out.println("Invalid operation...");
        }
    }

    static void add(int a,int b){
        System.out.println(a+b);
    }

    static void sub(int a,int b){
        System.out.println(Math.max(a,b)-Math.min(a,b));
    }

    static void mul(int a,int b){
        System.out.println(a*b);
    }

    static void div(int a,int b){
        double res= (double) a/b;
        System.out.println(res);
    }
}
