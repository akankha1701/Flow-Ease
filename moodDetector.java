import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MenstrualMoodColors2 {

    // Method to blend colors based on moods
    public static String blendColors(ArrayList<String> moods, HashMap<String, String> moodColors) {
        StringBuilder blendedColor = new StringBuilder("Blended Mood Color: ");
        
        for (String mood : moods) {
            String color = moodColors.getOrDefault(mood.toLowerCase(), "unknown");
            if (!color.equals("unknown")) {
                blendedColor.append(color).append(" ");
            }
        }
        
        return blendedColor.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define moods and their corresponding colors
        HashMap<String, String> moodColors = new HashMap<>();
        moodColors.put("happy", "Green");
        moodColors.put("sad", "Blue");
        moodColors.put("angry", "Red");
        moodColors.put("depressed", "Yellow");
        moodColors.put("bored", "Pink");
        moodColors.put("disgust", "Orange");

        // Welcome message
        System.out.println("Welcome to the Menstrual Mood Color Detector!");
        System.out.println("Enter the moods you're experiencing (e.g., happy, sad, angry,depressed,bored,disgust).");
        System.out.println("Type 'done' when you've entered all moods.");

        // Collect moods from the user
        ArrayList<String> moods = new ArrayList<>();
        while (true) {
            System.out.print("Enter mood: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            moods.add(input.trim());
        }

        // Generate and display the color blend
        String blendedColor = blendColors(moods, moodColors);
        System.out.println("\nYour Mood-Based Color Formation:");
        System.out.println(blendedColor);

        // Goodbye message
        System.out.println("\nTake care and embrace your colors!");
        scanner.close();
    }
}