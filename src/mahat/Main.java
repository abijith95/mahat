package mahat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name::");
        String name = sc.nextLine();

        System.out.println("Enter the emial::");
        String email = sc.nextLine();

        System.out.println("Enter the password::");
        String password = sc.next();

        System.out.println("Enter the age::");
        String age = sc.next();

        Registration rname = new Name(name);
        Registration remail = new Email(email);
        Registration rpass = new Password(password);
        Registration rage = new Age(age);

        if(rname.analyse() && remail.analyse() && rpass.analyse() && rage.analyse())
        {
            System.out.println("The values entered are correct!! Proceed to next process..");
        }
        else
        {
            System.out.println("The values entered are not correct.Kindly analyse");
        }
    }
}
