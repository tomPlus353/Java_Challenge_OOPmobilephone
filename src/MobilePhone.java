import java.util.ArrayList;

public class MobilePhone {
    //list of contacts
    public ArrayList<Contact> contactList;

    public MobilePhone() {
        this.contactList = new ArrayList();
    }

    public ArrayList<Contact> getContactList() {
        return this.contactList;
    }

    public void addContact(Contact newContact) {
        this.contactList.add(newContact);
    }

    public Contact searchContact(String contactName){
        for (Contact c :this.contactList) {
            if (c.getName().equals(contactName)) {
                return c;
            }
        }
        return null;
    }

    public boolean updateContact(String searchName, Contact editedContact) {

        if (this.searchContact(searchName)!= null) {
            Contact oldContact = this.searchContact(searchName);
            oldContact.number = editedContact.number;
            oldContact.name = editedContact.name;

            return true;
        } else {
            return false;
        }
    }

    public void removeContact(Contact contactToDelete){
        this.contactList.remove(contactToDelete);
    }


    // Able to store, modify, remove and query contact names.
    // Create a master class (MobilePhone) that holds the ArrayList of Contacts
    // Add a menu of options that are available.
    // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
    // and search/find contact.
    // When adding or updating be sure to check if the contact already exists (use name)
    // Be sure not to expose the inner workings of the Arraylist to MobilePhone
    // e.g. no ints, no .get(i) etc
    // MobilePhone should do everything with Contact objects only.

}
