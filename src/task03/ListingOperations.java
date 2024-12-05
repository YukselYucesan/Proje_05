package task03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListingOperations {

    private static ArrayList<String> array = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Element");
            System.out.println("2. Remove Top Indexed Element");
            System.out.println("3. View Top Indexed Element");
            System.out.println("4. Sort Elements");
            System.out.println("5. Invert Elements");
            System.out.println("6. Number of Elements in the Array");
            System.out.println("7. Number of a Particular Element");
            System.out.println("8. Indexes of a Particular Element");
            System.out.println("9. Get Copy of Directory");
            System.out.println("10. Remove a Specific Element");
            System.out.println("11. Filter Elements in a Specified Range");
            System.out.println("12. List Current Elements");
            System.out.println("0. Exit");
            System.out.print("Make your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Read blank line

            switch (choice) {
                case 1:
                    System.out.print("Enter the element you want to add: ");
                    array.add(scanner.next());
                    break;
                case 2:
                    if (!array.isEmpty()) {
                        array.remove(array.size() - 1);
                        System.out.println("Top element removed.");
                    } else {
                        System.out.println("The stack is empty.");
                    }
                    break;
                case 3:
                    if (!array.isEmpty()) {
                        System.out.println("Top Indexed Element = " + array.get(array.size() - 1));
                    } else {
                        System.out.println("The stack is empty.");
                    }
                    break;
                case 4:
                    if (!array.isEmpty()) {
                        Collections.sort(array);
                        System.out.println(array);
                        System.out.println("The transaction was completed successfully.");
                    } else {
                        System.out.println("The stack is empty.");
                    }
                    break;
                case 5:
                    if (!array.isEmpty()) {
                        Collections.reverse(array);
                        System.out.println(array);
                        System.out.println("The transaction was completed successfully.");
                    } else {
                        System.out.println("The stack is empty.");
                    }
                    break;
                case 6:
                    if (!array.isEmpty()) {
                        System.out.println("Number of Elements in the Array = " + array.size());
                    } else {
                        System.out.println("The stack is empty.");
                    }
                    break;
                case 7:
                    if (!array.isEmpty()) {
                        NumberOfSpecificElement();
                    } else {
                        System.out.println("The stack is empty.");
                    }
                    break;
                case 8:
                    if (!array.isEmpty()) {
                        IndexOfSpecificElement();
                    } else {
                        System.out.println("The stack is empty.");
                    }
                    break;
                case 9:
                    if (!array.isEmpty()) {
                        CopyArray();
                    } else {
                        System.out.println("The stack is empty.");
                    }
                    break;
                case 10:
                    if (!array.isEmpty()) {
                        DeleteSpecificElement();
                    } else {
                        System.out.println("The stack is empty.");
                    }
                    break;
                case 11:
                    if (!array.isEmpty()) {
                        Filter();
                    } else {
                        System.out.println("The stack is empty.");
                    }
                    break;
                case 12:
                    ListCurrentElements();
                    break;
                case 0:
                    exit = true;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid selection. Please try again..");
                    break;
            }
            ListCurrentElements();
        }
    }

    private static void ListCurrentElements() {
        System.out.println("Current Staff: " + array);
    }
    private static void NumberOfSpecificElement(){
        System.out.print("Your Selected Element: ");
        String element= scanner.nextLine();
        int counter=0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).equalsIgnoreCase(element)){counter++;}
        }
        System.out.println("Number of Elements You Selected: " + counter);
    }
    private static void IndexOfSpecificElement(){
        System.out.print("Your Selected Element = ");
        String element= scanner.nextLine();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).equalsIgnoreCase(element)){
                System.out.println("-"+i);
            }
        }
        System.out.println("The transaction was completed successfully.");
    }
    private static void CopyArray(){
        ArrayList<String>copyArray=new ArrayList<>(array);
        System.out.println("Copy complete");
        System.out.println("Copy Array = " + copyArray);
    }
    private static void DeleteSpecificElement(){
        System.out.print("Your Selected Element: ");
        String element= scanner.nextLine();
        array.remove(element);
        System.out.println("Element deleted");
    }
    private static void Filter(){
        System.out.print("Enter the starting element: ");
        String start=scanner.nextLine();
        System.out.print("Enter the end element: ");
        String finish=scanner.nextLine();
        boolean yesOrNo=false;
        for (String item: array){
            if (item.equalsIgnoreCase(start)) yesOrNo=true;
            if (yesOrNo) System.out.println(item);
            if (item.equalsIgnoreCase(finish)) break;
        }
        System.out.println("The transaction was completed successfully.");
    }
}
