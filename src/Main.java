import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World!");
        System.out.println("Welcome to your mobile phone");
        MobilePhone mobile = new MobilePhone();
        boolean redLight = false;
        while (!redLight) {
            System.out.println("Select option:\n1. add contact\n2. read contacts \n3. update contact \n4. delete contact \n5. Exit" );
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.println("enter name");
                    String ContactName = scanner.next();
                    System.out.println("enter number");
                    String ContactNumber = scanner.next();
                    Contact contact = new Contact(ContactNumber,ContactName);
                    mobile.addContact(contact);
                    break;
                case 2:
                    System.out.println("reading contacts");
                    for (Contact c: mobile.getContactList()) {
                        System.out.println("Contact name: " + c.getName());
                        System.out.println("Contact number: " + c.getNumber());
                        Thread.sleep(100);
                    }
                    break;
                case 3:
                    System.out.println("updating contact");
                    System.out.println("enter name");
                    String searchName = scanner.next();
                    System.out.println("enter new name");
                    String newName = scanner.next();
                    System.out.println("enter new number");
                    String newNumber = scanner.next();
                    Contact editedContact = new Contact(newName, newNumber);
                    mobile.updateContact(searchName,editedContact);
                    break;
                case 4:
                    System.out.println("deleting contact");
                    break;
                case 5:
                    System.out.println("exiting phone");
                    redLight = true;
                    break;
                    default:
                        System.out.println("I don't understand. Please enter again.");
                        break;
                }
            Thread.sleep(100);
            }
        }
    }

