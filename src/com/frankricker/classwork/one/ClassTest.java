package com.frankricker.classwork.one;

import java.util.Scanner;

public class ClassTest {
    private String scanIn;
    public void testOne(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter input: ");
        this.scanIn = scanner.next();
        System.out.println(this.scanIn + " Is in test method one");
    }
    public void testTwo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        this.scanIn = scanner.next();
        System.out.println(" Is in test method two" + this.scanIn);
    }
}
