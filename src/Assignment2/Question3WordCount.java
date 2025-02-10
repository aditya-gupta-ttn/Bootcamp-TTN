package Assignment2;

import java.io.*;
import java.util.regex.*;

public class Question3WordCount {
    public static void main(String[] args) {
        // Check if the correct number of command-line arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide both the filename and the word to search.");
            return;
        }

        String fileName = args[0];
        String wordToSearch = args[1];
        int count = 0;

        // Regular expression to match words (ignores punctuation)
        String regex = "\\b" + Pattern.quote(wordToSearch) + "\\b";

        // Read the file and count occurrences of the word
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Use regular expression to match the word in the line
                Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(line);

                // Find all occurrences of the word
                while (matcher.find()) {
                    count++;
                }
            }

            System.out.println("The word '" + wordToSearch + "' appeared " + count + " times in the file.");
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
