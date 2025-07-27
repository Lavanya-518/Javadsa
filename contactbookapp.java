import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Abstract base class
abstract class Contact {
    private String contactId;
    private String name;
    private String phoneNumber;
    private String email;

    public Contact(String contactId, String name, String phoneNumber, String email) {
        this.contactId = contactId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getContactId() { return contactId; }
    public String getName() { return name; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public abstract void displayDetails();
}

// Personal Contact subclass
class PersonalContact extends Contact {
    private String birthday;

    public PersonalContact(String contactId, String name, String phoneNumber, String email, String birthday) {
        super(contactId, name, phoneNumber, email);
        this.birthday = birthday;
    }

    @Override
    public void displayDetails() {
        System.out.println("Contact Record");
        System.out.println("ID: " + getContactId());
        System.out.println("Name: " + getName());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Email: " + getEmail());
        System.out.println("Birthday: " + birthday);
        System.out.println();
    }
}

// Business Contact subclass
class BusinessContact extends Contact {
    private String companyName;

    public BusinessContact(String contactId, String name, String phoneNumber, String email, String companyName) {
        super(contactId, name, phoneNumber, email);
        this.companyName = companyName;
    }

    @Override
    public void displayDetails() {
        System.out.println("Contact Record");
        System.out.println("ID: " + getContactId());
        System.out.println("Name: " + getName());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Email: " + getEmail());
        System.out.println("Company Name: " + companyName);
        System.out.println();
    }
}

// Emergency Contact subclass
class EmergencyContact extends Contact {
    private String relation;

    public EmergencyContact(String contactId, String name, String phoneNumber, String email, String relation) {
        super(contactId, name, phoneNumber, email);
        this.relation = relation;
    }

    @Override
    public void displayDetails() {
        System.out.println("Contact Record");
        System.out.println("ID: " + getContactId());
        System.out.println("Name: " + getName());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Email: " + getEmail());
        System.out.println("Relation: " + relation);
        System.out.println();
    }
}

// Interface for Contact operations (CRUD)
interface ContactOperations {
    boolean addContact(Contact c);
    void viewContacts();
    boolean updatePhoneNumber(String contactId, String newPhone);
    boolean deleteContact(String contactId);
    void searchContactsByName(String name);
}

class ContactManager implements ContactOperations {
    private List<Contact> contacts = new ArrayList<>();

    @Override
    public boolean addContact(Contact c) {
        if (findContactById(c.getContactId()) == null) {
            contacts.add(c);
            System.out.println("Contact added successfully.");
            return true;
        }
        System.out.println("Duplicate Contact ID! Contact not added.");
        return false;
    }

    @Override
    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.\n");
            return;
        }
        for (Contact c : contacts) {
            c.displayDetails();
        }
    }

    @Override
    public boolean updatePhoneNumber(String contactId, String newPhone) {
        Contact c = findContactById(contactId);
        if (c != null) {
            c.setPhoneNumber(newPhone);
            System.out.println("Phone number updated successfully.\n");
            return true;
        }
        System.out.println("Contact ID not found.\n");
        return false;
    }

    @Override
    public boolean deleteContact(String contactId) {
        Contact c = findContactById(contactId);
        if (c != null) {
            contacts.remove(c);
            System.out.println("Contact deleted successfully.\n");
            return true;
        }
        System.out.println("Contact ID not found.\n");
        return false;
    }

    @Override
    public void searchContactsByName(String name) {
        boolean found = false;
        for (Contact c : contacts) {
            if (c.getName().toLowerCase().contains(name.toLowerCase())) {
                c.displayDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No contacts found matching: " + name + "\n");
        }
    }

    private Contact findContactById(String contactId) {
        for (Contact c : contacts) {
            if (c.getContactId().equalsIgnoreCase(contactId)) {
                return c;
            }
        }
        return null;
    }
}

public class contactbookapp {
    private static final Scanner sc = new Scanner(System.in);
    private static final ContactManager manager = new ContactManager();

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = getIntInput("Choose an option: ");
            handleChoice(choice);
        }
    }

    private static void showMenu() {
        System.out.println("\n===== Contact Book Menu =====");
        System.out.println("1. Add Contact");
        System.out.println("2. View Contacts");
        System.out.println("3. Update Phone Number");
        System.out.println("4. Delete Contact");
        System.out.println("5. Search Contacts by Name");
        System.out.println("6. Exit");
    }

    private static void handleChoice(int choice) {
        switch (choice) {
            case 1:
                addContact();
                break;
            case 2:
                manager.viewContacts();
                break;
            case 3:
                updatePhoneNumber();
                break;
            case 4:
                deleteContact();
                break;
            case 5:
                searchContacts();
                break;
            case 6:
                exitApp();
                break;
            default:
                System.out.println("Invalid option, try again.");
        }
    }

    private static void addContact() {
        System.out.println("Select Contact Type:");
        System.out.println("1. Personal Contact");
        System.out.println("2. Business Contact");
        System.out.println("3. Emergency Contact");
        int type = getIntInput("Choice: ");

        System.out.print("Enter Contact ID: ");
        String contactId = sc.nextLine().trim();
        System.out.print("Enter Name: ");
        String name = sc.nextLine().trim();
        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine().trim();
        System.out.print("Enter Email: ");
        String email = sc.nextLine().trim();

        Contact contact = null;
        switch (type) {
            case 1:
                System.out.print("Enter Birthday (dd/mm/yyyy): ");
                String birthday = sc.nextLine().trim();
                contact = new PersonalContact(contactId, name, phone, email, birthday);
                break;
            case 2:
                System.out.print("Enter Company Name: ");
                String companyName = sc.nextLine().trim();
                contact = new BusinessContact(contactId, name, phone, email, companyName);
                break;
            case 3:
                System.out.print("Enter Relation: ");
                String relation = sc.nextLine().trim();
                contact = new EmergencyContact(contactId, name, phone, email, relation);
                break;
            default:
                System.out.println("Invalid contact type!");
                return;
        }
        manager.addContact(contact);
    }

    private static void updatePhoneNumber() {
        System.out.print("Enter Contact ID to update phone: ");
        String idToUpdate = sc.nextLine().trim();
        System.out.print("Enter new phone number: ");
        String newPhone = sc.nextLine().trim();
        manager.updatePhoneNumber(idToUpdate, newPhone);
    }

    private static void deleteContact() {
        System.out.print("Enter Contact ID to delete: ");
        String idToDelete = sc.nextLine().trim();
        manager.deleteContact(idToDelete);
    }

    private static void searchContacts() {
        System.out.print("Enter name or partial name to search: ");
        String nameToSearch = sc.nextLine().trim();
        manager.searchContactsByName(nameToSearch);
    }

    private static void exitApp() {
        System.out.println("Exiting... Goodbye!");
        sc.close();
        System.exit(0);
    }

    private static int getIntInput(String prompt) {
        int input = -1;
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            try {
                input = Integer.parseInt(line);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
        return input;
    }
}
