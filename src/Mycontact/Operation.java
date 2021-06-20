package Mycontact;

import java.util.List;
import java.util.Scanner;

class Operation {
    Scanner sc = new Scanner(System.in);

    void addContact(List<Contact> list) {
        System.out.println("How many contact do you want to add ?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name : ");
            String name = sc.next();
            System.out.println("Enter contact : ");
            int number = sc.nextInt();
            Contact addContact = new Contact(list.size() + 1, name, number);
            list.add(addContact);
        }
    }

    void showContact(List<Contact> list) {
        System.out.println("List of contact list.");
        for (Contact ct : list) {
            System.out.println(ct.getContactInfo());
        }
    }

    void searchContact(List<Contact> list) {
        System.out.println("Search Contact by name");
        String inputName = sc.next();
        boolean isFound = false;
        for (Contact ct : list) {
            if (ct.getName().equalsIgnoreCase(inputName) || ct.getName().contains(inputName)) {
                isFound = true;
                System.out.println(ct.getContactInfo());
            }

        }
        if (!isFound)
            System.out.println("Record Not Found !");
    }

    void editContact(List<Contact> list) {
        System.out.println("Which record do you want to edit by (name) ?");
        String inputName = sc.next();
        System.out.println("Enter id : ");
        int id = sc.nextInt();

        System.out.println("Enter name : ");
        String name = sc.next();

        System.out.println("Enter contact : ");
        int number = sc.nextInt();

        for (Contact ct : list) {
            if (ct.getName().equalsIgnoreCase(inputName) || ct.getName().contains(inputName)) {
                ct.setId(id);
                ct.setName(name);
                ct.setContact(number);
            }
        }
    }

    private void updateId(List<Contact> list) {
        int count = 1;
        for (Contact contact : list) {
//            contact.setId(list.size() - list.lastIndexOf(contact));
            contact.setId(count++);
        }
    }

    void deleteContact(List<Contact> list) {
        System.out.println("Which contact do you want to delete enter id ?");
        int inputId = sc.nextInt();
        list.remove(inputId);
        updateId(list);

    }
}
