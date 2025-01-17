package Systems;

import Peaces.User;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class UserRegistration { // this class is used to for any logic needed to register users
    public ArrayList<User> UserList = new ArrayList<>(); // this is the user list

    public User register() { // method to register a new user and add them to the user list
        // create scanner object for user input
        Scanner getInput = new Scanner(System.in);
        // create user object
        User newUser = new User();

        // prompt the user for input and saves information in customer (User object)
        System.out.print("First name: ");
        newUser.fname = getInput.nextLine();
        System.out.print("Last name: ");
        newUser.lname = getInput.nextLine();

        // set date of birth
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate newDate;
        boolean isSet = false;
        while (!isSet) {
            System.out.print("Date of birth (dd.mm.yy): ");
            String dateString = getInput.nextLine();
            try {
                newDate = LocalDate.parse(dateString, dateFormatter);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format");
                continue;
            }
            newUser.dob = newDate;
            isSet = true;
        }

        // set email
        System.out.print("Email: ");
        newUser.email = getInput.nextLine();

        // set username and check for duplicates in UserList (username must be unique)
        while (true) { // while loop is always true and is exited by break statement

            boolean isUnique = true; // used to track if the username is unique (assumption = true)

            // set up username
            System.out.print("Username: "); // prompt for username
            newUser.username = getInput.nextLine(); // set username

            // check if username is unique
            for (User user : UserList) { // repeat for each User in UserList
                if (newUser.username.equals(user.username)) { // check if new username equals username from UserList
                    System.out.println("Username already exists"); // inform user that username is not unique
                    System.out.println(); // empty line for formatting
                    isUnique = false; // assumption = false, username is not unique
                }
            }
            if (isUnique) { // only exit the while loop when username is unique
                break;
            }
        }

        // set up password
        System.out.print("Password: "); // prompt for password
        newUser.password = getInput.nextLine(); // read user input
        System.out.println(); // empty lines for formatting
        System.out.println();

        // append newUser to user list
        UserList.add(newUser);
        return newUser;
    }
}
