public class Checker {

    public  static void processString(String input){
        
        boolean isPalindrome = isPalindrome(input);

        if (isPalindrome) {
            System.out.println(input + (" is a palindrome :)."));

        } else {
            System.out.println(input + (" is not a palindrome :(."));
            
        }
        
    }

    public static String cleanString(String input){
        return input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    public static boolean isPalindrome(String input){

        String cleanedInput = cleanString(input);

        String reveresedInput = new StringBuilder(cleanedInput).reverse().toString();

        return cleanedInput.equals(reveresedInput);
    }
    
}