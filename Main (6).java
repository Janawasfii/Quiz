package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //EX1 Write a Java program that accept three numbers from the user and print the largest number .
        Scanner s = new Scanner(System.in);
       /* System.out.println("Please enter a first number:");
         int n1= s.nextInt();
        System.out.println("Please enter a second number:");
        int n2= s.nextInt();
        System.out.println("Please enter a third number:");
        int n3= s.nextInt();

        if(n1>n2){
            System.out.println("The largest number is:"+ n1);
        }
        else if(n2>n3){
            System.out.println("The largest number is:"+ n2);
        }
        else{
            System.out.println("The largest number is:"+n3);
        }*/
//EX2 Write a Java program that accept a String and a number from the user,then print the character in the given index .
        /*System.out.println("Please enter a String:");
        String word = s.nextLine().toLowerCase();
        System.out.println("Please enter a number");
        int num = s.nextInt();
        System.out.println("The char is: "+word.charAt(num));*/

//EX3 Write a program to enter the numbers till the user wants and at the end it should display the sum entered
        /*int sum = 0;
        System.out.println("Please enter a number");
        // int num = s.nextInt();
        do {
            int num = s.nextInt();
            if (num == 0) {
                break;
            } else {
                sum += num;
            }

       }while (true);
        System.out.println("The sum is:" + sum);*/

//EX4 Write a Java program to find positive and negative numbers of a given array:
       /* ArrayList <Integer> list= new ArrayList();
        list.add(10);
        list.add(-21);
        list.add(30);
        list.add(31);
        list.add(-25);
        for(int n: list){
            if(n>0){
                System.out.println(n+" "+"is a positive number");
            }else{
                System.out.println(n+" "+"is a negative number");*/

//EX5 Write a Java program to find a shortest word of a given array:
        ArrayList <String> list= new ArrayList();
        list.add("Tuwaiq"); //length 5 index 0-4
        list.add("Bootcamp");//length 8
        list.add("Student");// length 7
        list.add("JAVA");// length 4/index= length()-1

        for(String n:list){
            if(n.indexOf(0))


    }}