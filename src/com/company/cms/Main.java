package com.company.cms;

import com.company.cms.client.InstructorClient;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Integer choice;

    public static void menu(){
        System.out.println("Who are you");
        System.out.println("1.Instructor");
        System.out.println("2.Student");
        System.out.println("99.Exit");
        choice = sc.nextInt();
        sc.nextLine();

    }
    public static void main(String[] args) {
	// write your code here
        while(true){
            menu();
            switch (choice){
                case 1:
                    System.out.println("----------------------------------------------------");
                    InstructorClient instructorClient = new InstructorClient();
                    instructorClient.instructorMainMenu();
                    break;
                case 2:
                    System.out.println("----------------------------------------------------");
                    System.out.println("Student");
                    break;
                case 99:
                    System.out.println("Exiting the Application");
                    System.exit(0); // Do not use in enterprise application
                default:
                    System.out.println("Wrong Input! Please Try Again");
            }

        }
    }
}
