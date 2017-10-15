package com.nikos;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private ArrayList<Contacts> contacts = new ArrayList<Contacts>();
    private Scanner scanner = new Scanner(System.in);


    public void printAllContacts() {
        if (contacts.size() == 0) {
            System.out.println("No contacts yet!");
        } else {
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println((i + 1) + ". " + contacts.get(i).getName() + "-" + contacts.get(i).getPhoneNumber() + ".");
            }
        }
    }

    public void storeContact() {
        System.out.println("Give the contact's name");
        String name = scanner.nextLine();
        System.out.println("Give the contact's number");
        String phoneNumber = scanner.nextLine();
        contacts.add(new Contacts(name, phoneNumber));
        System.out.println("Contact added!");
    }

    public void modifyContact() {
        System.out.println("Give the contact's name");
        String oldName = scanner.nextLine();
        boolean found = false;
        int position = 0;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(oldName)) {
                found = true;
                position = i;
            }
        }
        if (found) {
            System.out.println("Give new name");
            String newName = scanner.nextLine();
            System.out.println("Give new number");
            String newPhoneNumber = scanner.nextLine();
            contacts.set(position, new Contacts(newName, newPhoneNumber));
        } else {
            System.out.println("Contact not found");
        }
    }

    public void deleteContact() {
        System.out.println("Give the contact's name");
        String oldName = scanner.nextLine();
        boolean found = false;
        int position = 0;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(oldName)) {
                found = true;
                position = i;
            }
        }
        if (found) {
            contacts.remove(position);
            System.out.println("Contact removed");
        } else {
            System.out.println("Contact not found");
        }
    }

    public void findContact() {
        System.out.println("Give the contact's name");
        String oldName = scanner.nextLine();
        boolean found = false;
        int position = 0;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(oldName)) {
                found = true;
                position = i;
            }
        }
        if (found) {
            System.out.println("Found in position " + (position + 1));
            System.out.println("Name: " + contacts.get(position).getName() + " Phone number: " + contacts.get(position).getPhoneNumber() + ".");
        } else {
            System.out.println("Contact not found");
        }
    }


}
