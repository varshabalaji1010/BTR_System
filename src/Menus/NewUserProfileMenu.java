package Menus;
import Peaces.User;

public class NewUserProfileMenu {
    public static int length = 3; // reflects the number of available options (used for getOption method in MenuManager class)
    public static void printMenu(User newUser) { // method to print the menu
        System.out.println("=====================================");
        System.out.println("|   Bus Ticket Reservation System   |");
        System.out.println("|   -----------------------------   |");
        System.out.println("|         Customer Platform         |");
        System.out.println("=====================================");
        System.out.println("| Your user profile:                |");
        System.out.println("|–----------------------------------|");
        System.out.printf("   First name:    %s\n", newUser.fname);     // print user profile details
        System.out.printf("   Last name:     %s\n", newUser.lname);     // ToDo: Write the NewUserProfileMenu more elegant
        System.out.printf("   Date of birth: %s\n", newUser.dob);
        System.out.printf("   Email:         %s\n", newUser.email);
        System.out.println();
        System.out.printf("   Username:      %s\n", newUser.username);
        System.out.printf("   Password:      %s\n", newUser.password);
        System.out.println("|–----------------------------------|");
        System.out.println("| Options:                          |");
        System.out.println("|       1. Login with this account  |");
        System.out.println("|       2. Register another user    |");
        System.out.println("|       3. Back to menu             |");
        System.out.println("|                                   |");
        System.out.println("=====================================");
    }
}
