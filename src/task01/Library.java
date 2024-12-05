package task01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Library {
    private static Scanner readInt=new Scanner(System.in);
    private static Scanner readStr=new Scanner(System.in);
    private static HashMap<String,String>library=new HashMap<>();
    public static void main(String[] args) {
        int number=0;
        do {
        System.out.print("1. Lists of The Books\n2. Add a Book\n3. Delete a Book\n4. Exit\nYours choose (1-4) = ");
        number= readInt.nextInt();
            switch (number) {
                case 1: ListOfBooks(Library.library);break;
                case 2: AddBook(Library.library);break;
                case 3: DeleteBook(Library.library);break;
                case 4: System.out.println("Exited");break;
                default: System.out.println("Mistake İnput");
            }
        }while (number!=4);
    }
    private static void ListOfBooks(HashMap<String,String> library){
        if (!library.isEmpty()) {
            for (Map.Entry<String, String> hm : library.entrySet()) {
                System.out.println(hm.getKey() + ": " + hm.getValue());
            }
        }
        else System.out.println("Library is empty");
    }
    private static void AddBook(HashMap<String,String> library){
        System.out.print("A Book Name = ");
        String key=readStr.nextLine().trim();
        System.out.print("The Book Author = ");
        String value=readStr.nextLine().trim();
        if (!key.isEmpty() && !value.isEmpty()){
            library.put(key,value);
            System.out.println("The Book Added : " + key);
        }
        else System.out.println("Mistake input");
    }
    private static void DeleteBook(HashMap<String,String> library){
        System.out.print("Name of the book you want to delete = ");
        String key=readStr.nextLine().trim();
        if (!key.isEmpty() && library.containsKey(key)){
            library.remove(key);
            System.out.println("The book named " + key + " was deleted");
        }
        else System.out.println("Mistake input");
    }
}
