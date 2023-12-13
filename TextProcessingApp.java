
    import java.util.Scanner;
import java.util.HashSet;

public class TextProcessingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter text: ");
        String inputText = scanner.nextLine();
        
        if (inputText.isEmpty()) {
            System.out.println("Input text is empty.");
            return;
        }
        
        while (true) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Word Count");
            System.out.println("2. Character Count");
            System.out.println("3. Reverse Text");
            System.out.println("4. Remove Duplicates");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            switch (choice) {
                case 1:
                    int wordCount = countWords(inputText);
                    System.out.println("Word Count: " + wordCount);
                    break;
                case 2:
                    int charCount = countCharacters(inputText);
                    System.out.println("Character Count: " + charCount);
                    break;
                case 3:
                    String reversedText = reverseText(inputText);
                    System.out.println("Reversed Text:\n" + reversedText);
                    break;
                case 4:
                    String textWithoutDuplicates = removeDuplicates(inputText);
                    System.out.println("Text without Duplicates:\n" + textWithoutDuplicates);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid operation.");
            }
        }
    }
    
    public static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }
    
    public static int countCharacters(String text) {
        return text.length();
    }
    
    public static String reverseText(String text) {
        StringBuilder reversed = new StringBuilder(text);
        return reversed.reverse().toString();
    }
    
    public static String removeDuplicates(String text) {
        String[] words = text.split("\\s+");
        HashSet<String> uniqueWords = new HashSet<>();
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            if (uniqueWords.add(word)) {
                result.append(word).append(" ");
            }
        }
        
        return result.toString().trim();
    }
}
  
