package task02;

import java.util.HashMap;
import java.util.Scanner;

public class PasswordManager {
    private static Scanner readInt=new Scanner(System.in);
    private static Scanner readStr=new Scanner(System.in);
    private static HashMap<String,HashMap<String,String>> passwords = new HashMap<>();

    public static void main(String[] args) {
        int choose=0;
        do {
            System.out.print("1- Add Password\n2- Show Password\n3- Exit\nYour choice = ");
            choose = readInt.nextInt();
            switch (choose){
                case 1: AddPassword(PasswordManager.passwords);break;
                case 2: ShowPassword(PasswordManager.passwords); break;
                case 3: System.out.println("Log Out");break;
                default: System.out.println("Incorrect entry");
            }
        }while (choose!=3);
    }
        private static void AddPassword(HashMap<String,HashMap<String,String>> passwordslist){
        System.out.print("Application Name = ");
        String app=readStr.nextLine().toLowerCase();
        System.out.print("User name = ");
        String name=readStr.nextLine().toLowerCase();
        System.out.print("Password = ");
        String password=readStr.nextLine().toLowerCase();
        HashMap<String,String> userInformation =new HashMap<>();
        userInformation.put(name,password);
        passwordslist.put(app, userInformation);
        System.out.println("Password Registration added successfully");
    }
    private static void ShowPassword(HashMap<String,HashMap<String,String>> passwordslist){
        System.out.print("Account name = ");
        String app= readStr.nextLine().toLowerCase();
        if (passwordslist.containsKey(app)){
            System.out.println("Application information = " + passwordslist.get(app));
        }else System.out.println("No Records Found");
    }
}
