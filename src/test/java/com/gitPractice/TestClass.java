package com.gitPractice;

public class TestClass {

    public static void main(String[] args) {
        System.out.println("some code goes here");
            int n=10; int a = 1; int b = 2;
        for (int i = 0; i < n; i++) {
           int sum = a+b;
            b = a; b= sum;
            System.out.println(sum);

            System.out.println("Jamil's code");
        }
    }
}
