package Mycontact;

class Contact {
    private int id;

    private int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    private int getContact() {
        return contact;
    }

    void setContact(int contact) {
        this.contact = contact;
    }

    private String name;

    Contact(int id, String name, int contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    private int contact;

    String getContactInfo() {
        return "Id : \t" + getId() + "\tName : " + getName() + "\t\t\tContact : \t" + getContact();
    }
}
