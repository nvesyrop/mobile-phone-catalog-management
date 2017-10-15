package com.nikos;

import java.util.Scanner;

public class Main {

    static Scanner scanner  = new Scanner(System.in);
    static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {

        boolean flag=true;

        while(flag){
            printMenu();
            int option = scanner.nextInt();

            switch(option){
                case 0:
                    break;
                case 1:
                    mobilePhone.printAllContacts();
                    break;
                case 2:
                    mobilePhone.storeContact();
                    break;
                case 3:
                    mobilePhone.modifyContact();
                    break;
                case 4:
                    mobilePhone.deleteContact();
                    break;
                case 5:
                    mobilePhone.findContact();
                    break;
                case 6:
                    flag=false;
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }

        }

    }

    public static void printMenu(){
        System.out.println("Main Menu:");
        System.out.println("Press one of the following options to enable an action");
        System.out.println("0 - Reprint your options");
        System.out.println("1 - Show all contacts");
        System.out.println("2 - Add a new contact");
        System.out.println("3 - Modify an existing contact");
        System.out.println("4 - Remove a contact");
        System.out.println("5 - Search for a contact");
        System.out.println("6 - Exit the application");
        System.out.println("Give your option");
    }


}
