package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        System.out.printf("%s\n",new Exception("fd").getStackTrace()[1].getMethodName());
    }
}