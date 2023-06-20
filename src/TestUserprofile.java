/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author miskm
 */
import java.util.Scanner;

public class TestUserprofile {
    public static void main(String[] args) {
        // Displaying the list of possible genres
        System.out.println("List of possible genres:");
        System.out.println("1. Action");
        System.out.println("2. Adventure");
        System.out.println("3. Comedy");
        System.out.println("4. Drama");
        System.out.println("5. Fantasy");
        System.out.println("6. Sci-Fi");

        // Getting user input for name and favorite genre
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the number corresponding to your favorite genre: ");
        int genreChoice = scanner.nextInt();

        // Creating the user profile
        String genre;
        switch (genreChoice) {
            case 1:
                genre = "Action";
                break;
            case 2:
                genre = "Adventure";
                break;
            case 3:
                genre = "Comedy";
                break;
            case 4:
                genre = "Drama";
                break;
            case 5:
                genre = "Fantasy";
                break;
            case 6:
                genre = "Sci-Fi";
                break;
            default:
                genre = "Unknown";
                break;
        }

        System.out.println("User profile created:");
        System.out.println("Name: " + name);
        System.out.println("Favorite Genre: " + genre);
    }
}

