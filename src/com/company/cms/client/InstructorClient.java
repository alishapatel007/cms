package com.company.cms.client;

import com.company.cms.controller.InstructorController;

import java.util.Scanner;

public class InstructorClient {
    static Scanner sc = new Scanner(System.in);
    static Integer choice;

    public static void instructorMenuDetails(){
        System.out.println("Hi Instructor!! What do you want to do");
        System.out.println("1.Login");
        System.out.println("2.Register");
        System.out.println("3.Back to Main Menu");
        choice = sc.nextInt();
        sc.nextLine();
    }

    public void instructorMainMenu(){
        Integer mainMenu = 0;
        InstructorController controller = new InstructorController();
        while(mainMenu != 3){
            instructorMenuDetails();
            switch (choice){
                case 1:
                    System.out.println("----------------------------------------------------");
                    System.out.println("Enter your username");
                    String username = sc.next();
                    System.out.println("Enter your password");
                    String password = sc.next();
                    Boolean result = controller.isValidUser(username,password);
                    if(result){
                        System.out.println("----------------------------------------------------");
                        System.out.println("You are successfully logged in.");
                        this.instructorSubMenu(username);
                    }else {
                        System.out.println("Invalid credentials!! Try again or register");
                        System.out.println("----------------------------------------------------");
                    }
                    break;
                case 2:
                    System.out.println("----------------------------------------------------");
                    System.out.println("Start with registration process");
                    System.out.println("Enter your username");
                    String newUsername = sc.next();
                    System.out.println("Enter your password");
                    String newPassword = sc.next();
                    Boolean isRegistrationSuccess = controller.registerUser(newUsername,newPassword);
                    if(isRegistrationSuccess){
                        System.out.println("----------------------------------------------------");
                        System.out.println("Your registration was successful. Please login");
                    }else{
                        System.out.println("----------------------------------------------------");
                        System.out.println("Registration was unsuccessful. Username exists. Try again!!");
                    }
                    break;
                case 3:
                    System.out.println("Exiting Instructor flow");
                    System.out.println("----------------------------------------------------");
                    mainMenu = 3;
                    break;
                default:
                    System.out.println("Wrong Input! Please Try Again");
                    System.out.println("----------------------------------------------------");
            }
        }
    }

    public void instructorSubMenu(String username){
        Integer mainMenu = 0;

        while(mainMenu != 4){
            System.out.println("Hi "+ username);
            System.out.println("----------------------------------------------------");
            System.out.println("1.View courses");
            System.out.println("2.View Students Enrolled");
            System.out.println("3.Add course");
            System.out.println("4.Go back to previous menu");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("----------------------------------------------------");
                    System.out.println("1.View courses");
                    break;
                case 2:
                    System.out.println("----------------------------------------------------");
                    System.out.println("2.View Students Enrolled");
                    break;
                case 3:
                    System.out.println("----------------------------------------------------");
                    System.out.println("3.Add course");
                    break;
                case 4:
                    mainMenu = 4;
                    System.out.println("Going back");
                    break;
                default:
                    System.out.println("Wrong Input! Please Try Again");
                    System.out.println("----------------------------------------------------");

            }
        }

    }
}
