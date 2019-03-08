package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author telferja
 */
/*
Test class for the UserProfile class. Propmpts uset to enter their name, 
then their favourite genre from a list of given genres. Pofile is then created based on input
and a confirmatin message is outputed.
*/
public class TestUserProfile {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter yout name: "); //prompts user to enter name and set the userID
        String userId = in.nextLine(); //user enters name and it is set to userID
        
        System.out.println("Please enter your favourite genre from the list below: ");//prompts user to enter their favourite genre from a list
        System.out.printf("Comedy\nDrama\nAction\nMystery\n");
        System.out.print("Enter: "); 
        String genre = in.nextLine(); //userenters favourite genre and it is set to genre
        
        UserProfile profile = new UserProfile(userId, genre); //Creates new user profile to store user's input
        System.out.println("Profile " + userId + " has been created."); //confirmation message of account creation
    }
}
