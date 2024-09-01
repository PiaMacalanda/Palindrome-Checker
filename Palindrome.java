import java.util.*;

public class Palindrome{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word//phrase: ");
        String userInput = input.nextLine();

        Checker.processString(userInput);

        input.close();
    }
}