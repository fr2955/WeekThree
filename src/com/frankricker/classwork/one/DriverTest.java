package com.frankricker.classwork.one;

import java.util.Scanner;

public class DriverTest {
    public static void main(String[] args) {

        String scanIn;

        Scanner scanner = new Scanner(System.in);

        ClassTest test = new ClassTest();
        test.testOne();
        test.testTwo();
        System.out.print("Enter input: ");
        scanIn = scanner.next();
        System.out.println(scanIn + " Is in test method one");
    }
}
