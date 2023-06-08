package contacts;

import java.util.Scanner;

public class Contacts {

    private static Contacts instance = null;
    private final Records records;

    private Contacts() {
        this.records = new Records();
    }
    public static Contacts getInstance() {
        if (instance == null) {
            instance = new Contacts();
        }
        return instance;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the person:");
        String fName = scanner.nextLine();
        System.out.println("Enter the surname of the person:");
        String lName = scanner.nextLine();
        System.out.println("Enter the number:");
        String phoneN = scanner.nextLine();

        ContactRecord contactRecord = new ContactRecord(fName, lName, phoneN);
        System.out.println("A record created!");
        records.addRecord(contactRecord);
        System.out.println("A Phone Book with a single record created!");
    }

    public Records getRecords() {
        return records;
    }
}
