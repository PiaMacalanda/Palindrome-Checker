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

    /** w/o reverse().toString()
     public static boolean isPalindrome(String input){
     
         String cleanedInput = cleanString(input);
         int length = cleanedInput.length();
         
         for (int i = 0; i < length/2; i++){
         
             if (cleanedInput.charAt(i) != cleanedInput.charAt( length -i- 1)) {
             return false;
             }
         }
         return true;
     }
    **/
    
}
