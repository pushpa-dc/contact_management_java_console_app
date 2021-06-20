package Mycontact;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Contact> list = new ArrayList<Contact>();
        list.add(new Contact(list.size() + 1, "Gopal", 3456));
        list.add(new Contact(list.size() + 1, "Shyam", 3456));
        list.add(new Contact(list.size() + 1, "gita", 3456));
        list.add(new Contact(list.size() + 1, "sita", 3456));
        System.out.println("========================================");
        for (Contact contact : list
        ) {
            System.out.println(contact.getContactInfo());
        }
        list.remove(1);
        System.out.println("*****************************");
        int count=1;
        for (Contact contact : list
        ) {
            contact.setId(count++);
//            System.out.println(list.size()-list.lastIndexOf(contact));
            System.out.println(contact.getContactInfo());
        }
    }
}
