package Mycontact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Contact> list = new ArrayList<Contact>();
        int count = 0;
        list.add(new Contact(list.size()+1, "Pushpa", 98586));
        list.add(new Contact(list.size() + 1, "Sita", 848594));
        list.add(new Contact(list.size() + 1, "Krishna", 8435));
        list.add(new Contact(list.size() + 1, "Shirisha", 9458));
        list.add(new Contact(list.size() + 1, "Sachita", 34208));

        String yes = "no";
        Operation operation = new Operation();
        while (!yes.equalsIgnoreCase("y")) {
            System.out.println("__________________");
            System.out.println("1) Add Contact");
            System.out.println("2) Show Contact");
            System.out.println("3) Search Contact");
            System.out.println("4) Edit Contact");
            System.out.println("5) Delete Contact");
            System.out.println("6) Exit Application");
            System.out.println("_____________________");

            System.out.println("Enter your choice : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    operation.addContact(list);
                    break;
                case 2:
                    operation.showContact(list);
                    break;
                case 3:
                    operation.searchContact(list);
                    break;
                case 4:
                    operation.editContact(list);
                    break;
                case 5:
                    operation.deleteContact(list);
                    for (Contact ct :
                            list) {
                        System.out.println(list.indexOf(ct));
                    }
                    break;
                case 6:
                    System.out.println("Do you want to quit program (y/n)?");
                    yes = scanner.next();
                    break;
                default:
                    System.out.println("Illegal choice please retry...");
            }
        }

    }

}
