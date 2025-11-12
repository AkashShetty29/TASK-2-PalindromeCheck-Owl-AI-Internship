package task3;

import java.util.Scanner;

public class PalindromeChecker {

    //Method 1: Reversing string using StringBuilder
    public static String reverseStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    //Method 2: Reverse string using character array
    public static String reverseStringCharArr(String str) {
        char[] characters = str.toCharArray();
        int left = 0;
        int right = characters.length - 1;
        
        while (left < right) {
            // Swapping characters
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }
        
        return new String(characters);
    }
    
    
    //Method 3: Reverse string using loop
    public static String reverseStringLoop(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    
    //Cleans the string by removing all non alphabatic and non numeric characters and converting to lowercase
    public static String cleanString(String str) {
        return str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    
    //Checks if a string is palindrome using reverse and compare method
    public static boolean isPalindrome(String str, boolean ignoreCaseAndSpaces) {
        if (str == null || str.trim().isEmpty()) {
            return false;
        }
        
        String processedStr = str;
        if (ignoreCaseAndSpaces) {
            processedStr = cleanString(str);
        }
        
        //Geting reversed string
        String reversed = reverseStringBuilder(processedStr);
        
        // Compare original and reversed strings
        return processedStr.equals(reversed);
    }
    

    //Alternative method using two-pointer technique
    public static boolean isPalindromeTwoPointer(String str, boolean ignoreCaseAndSpaces) {
        if (str == null || str.trim().isEmpty()) {
            return false;
        }
        
        String processedStr = str;
        if (ignoreCaseAndSpaces) {
            processedStr = cleanString(str);
        }
        
        int left = 0;
        int right = processedStr.length() - 1;
        
        while (left < right) {
            if (processedStr.charAt(left) != processedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    

    //Displays detailed analysis of the string
    public static void displayAnalysis(String original, boolean ignoreCaseAndSpaces) {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("PALINDROME ANALYSIS RESULTS");
        System.out.println("=".repeat(50));
        
        String cleaned = ignoreCaseAndSpaces ? cleanString(original) : original;
        String reversed = reverseStringBuilder(cleaned);
        boolean isPalindrome = cleaned.equals(reversed);
        
        System.out.println("Original string: \"" + original + "\"");
        System.out.println("Processed string: \"" + cleaned + "\"");
        System.out.println("Reversed string: \"" + reversed + "\"");
        System.out.println("Length: " + cleaned.length() + " characters");
        
        // Display all reversal methods for comparison
        System.out.println("\nReverse Method Comparison:");
        System.out.println("-> StringBuilder: \"" + reverseStringBuilder(cleaned) + "\"");
        System.out.println("-> Manual: \"" + reverseStringCharArr(cleaned) + "\"");
        System.out.println("-> Loop: \"" + reverseStringLoop(cleaned) + "\"");
        
        System.out.println("\n" + "-".repeat(50));
        if (isPalindrome) {
            System.out.println("RESULT: \"" + original + "\" IS A PALINDROME!");
        } else {
            System.out.println("RESULT: \"" + original + "\" IS NOT A PALINDROME");
        }
        System.out.println("-".repeat(50));
        
        // Additional check with two-pointer method
        boolean twoPointerResult = isPalindromeTwoPointer(original, ignoreCaseAndSpaces);
        System.out.println("Two-pointer verification: " + 
                          (twoPointerResult == isPalindrome ? "Consistent" : "Inconsistent"));
    }
    

    	//Tests multiple predefined strings
    public static void runTestCases() {
        System.out.println("RUNNING PREDEFINED TEST CASES");
        System.out.println("=".repeat(60));
        
        String[] testCases = {
            "racecar",
            "A man a plan a canal Panama",
            "hello",
            "Madam",
            "12321",
            "race a car",
            "Was it a car or a cat I saw?",
            "No 'x' in Nixon",
            "abcba",
            "not a palindrome"
        };
        
        int passed = 0;
        for (String testCase : testCases) {
            boolean result = isPalindrome(testCase, true);
            //String status = result ? "✅" : "❌";
            System.out.printf(" %-40s ->  %s\n", 
                 
                "\"" + testCase + "\"",
                result ? "Palindrome" : "Not Palindrome");
            if (result) passed++;
        }
        
        System.out.println("=".repeat(60));
        System.out.printf("Test Results: %d/%d passed\n", passed, testCases.length);
    }
    

    //Main method with user interface
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("PALINDROME CHECKER - TASK 3");
        System.out.println("Created for Owl AI Internship");
        System.out.println("=".repeat(50));
        
        boolean running = true;
        
        while (running) {
            System.out.println("\n MENU OPTIONS:");
            System.out.println("1. Check a single string");
            System.out.println("2. Run predefined test cases");
            System.out.println("3. Check multiple strings");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
                continue;
            }
            
            switch (choice) {
                case 1:
                    checkSingleString(scanner);
                    break;
                case 2:
                    runTestCases();
                    break;
                case 3:
                    checkMultipleStrings(scanner);
                    break;
                case 4:
                    running = false;
                    System.out.println("\n Thank you for using Palindrome Checker!");
                    break;
                default:
                    System.out.println("Invalid option! Please choose 1-4.");
            }
            
            if (running && choice != 4) {
                System.out.println("\nPress Enter to continue...");
                scanner.nextLine();
            }
        }
        
        scanner.close();
    }
    
         //Check a single string with user input
    private static void checkSingleString(Scanner scanner) {
        System.out.println("\n CHECK SINGLE STRING");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();
        
        if (input == null || input.trim().isEmpty()) {
            System.out.println(" Error: Please enter a non-empty string.");
            return;
        }
        
        System.out.print("Ignore case and spaces? (y/n): ");
        String ignoreOption = scanner.nextLine();
        boolean ignoreCaseAndSpaces = ignoreOption.equalsIgnoreCase("y");
        
        displayAnalysis(input, ignoreCaseAndSpaces);
    }
    
      //Check multiple strings continuously
    private static void checkMultipleStrings(Scanner scanner) {
        System.out.println("\n CHECK MULTIPLE STRINGS");
        System.out.println("(Enter 'quit' to stop)");
        
        System.out.print("Ignore case and spaces? (y/n): ");
        String ignoreOption = scanner.nextLine();
        boolean ignoreCaseAndSpaces = ignoreOption.equalsIgnoreCase("y");
        
        while (true) {
            System.out.print("\nEnter string: ");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("quit")) {
                break;
            }
            
            if (input.trim().isEmpty()) {
                System.out.println(" Please enter a valid string.");
                continue;
            }
            
            String cleaned = ignoreCaseAndSpaces ? cleanString(input) : input;
            String reversed = reverseStringBuilder(cleaned);
            boolean isPalindrome = cleaned.equals(reversed);
            
            System.out.printf("Result: %s -> %s\n", 
                input, 
                isPalindrome ? " Palindrome" : " Not Palindrome");
        }
    }

}
