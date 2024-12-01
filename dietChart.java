import java.util.ArrayList;
import java.util.Scanner;

public class MenstrualDiseaseDietChart {

    // Method to get diet suggestions based on conditions
    public static ArrayList<String> getDietSuggestions(ArrayList<String> conditions) {
        ArrayList<String> dietSuggestions = new ArrayList<>();
        
        //String problems[]={"DYSMENORRHEA(Painful cramps during menstruation)","MENORRHAGIA(Heavy bleeding during menstruation)",
            //"AMENORRHEA(Absence of menstruation)",
            //"PCOD(PLYCYSTIC OVARIAN SYNDROME)","PREMENSTRUAL SYNDROME(pain during pre menstruation)",
            //"METRORRHAGIA(Bleeding during interval particularly during expected menstruation)","OLIGOMENORRHEA(Infrequent menstrual periods)"};

        for (String condition : conditions) {
            switch (condition.toLowerCase()) {
                case "anemia":
                    dietSuggestions.add("Iron-rich foods: Spinach, lentils, red meat, fortified cereals.");
                    dietSuggestions.add("Vitamin C-rich foods to aid iron absorption: Oranges, strawberries, bell peppers.");
                    break;
                case "pcod":
                    dietSuggestions.add("Low-glycemic foods: Quinoa, whole grains, vegetables.");
                    dietSuggestions.add("Healthy fats: Avocado, olive oil, fatty fish.");
                    dietSuggestions.add("Anti-inflammatory foods: Turmeric, ginger, green tea.");
                    break;
                case "dysmenorrhea":
                    dietSuggestions.add("Magnesium-rich foods: Bananas, almonds, spinach.");
                    dietSuggestions.add("Anti-inflammatory foods: Salmon, walnuts, flaxseeds.");
                    dietSuggestions.add("Hydrating foods: Cucumber, watermelon, herbal teas.");
                    break;
                case "menorrhagia":
                    dietSuggestions.add("High-fiber foods: Broccoli, whole grains, beans.");
                    dietSuggestions.add("Omega-3 fatty acids: Salmon, chia seeds, walnuts.");
                    dietSuggestions.add("Avoid processed foods and caffeine.");
                    break;
                case "amenorrhea":
                    dietSuggestions.add("Foods rich in magnesium: Bananas, spinach, dark chocolate.");
                    dietSuggestions.add("Anti-inflammatory foods: Ginger tea, turmeric, salmon.");
                    break;
                case "oligomenorrhea":
                    dietSuggestions.add("Iron-rich foods: Lentils, beans, leafy greens, red meat.");
                    dietSuggestions.add("Energy-boosting foods: Oats, nuts, whole grains.");
                    break;
                case "mood swings":
                    dietSuggestions.add("Omega-3 fatty acids: Walnuts, chia seeds, fatty fish.");
                    dietSuggestions.add("Complex carbs: Sweet potatoes, quinoa, whole-grain bread.");
                    break;
                default:
                    dietSuggestions.add("Condition not recognized. Please consult a healthcare professional for tailored advice.");
                    break;
            }
        }

        return dietSuggestions;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Menstrual Disease Diet Chart Generator!");
        System.out.println("Enter the conditions you're experiencing (e.g., anemia, PCOD, dysmenorrhea, endometriosis).");
        System.out.println("Type 'done' when you've listed all conditions.");

        // Collect conditions from the user
        ArrayList<String> conditions = new ArrayList<>();
        while (true) {
            System.out.print("Enter condition: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            conditions.add(input.trim());
        }

        // Generate diet suggestions
        ArrayList<String> dietSuggestions = getDietSuggestions(conditions);

        // Display the diet chart
        System.out.println("\nYour Menstrual Disease-Based Diet Chart:");
        for (String suggestion : dietSuggestions) {
            System.out.println("- " + suggestion);
        }

        // Goodbye message
        System.out.println("\nStay healthy and take care!");
        scanner.close();
    }
}