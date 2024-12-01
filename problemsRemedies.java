import java.util.Scanner;

public class PeriodProblems {
    
    // Method to display the menu of problems
    public static void displayProblems() {
        System.out.println("Select a problem you are facing during your period:");
        System.out.println("1. Dysmenorrhea (Painful cramps during menstruation)");
        System.out.println("2. Menorrhagia (Heavy bleeding during menstruation)");
        System.out.println("3. Mood Swings");
        System.out.println("4. PCOD (POLYCYSTIC OVARIAN SYNDROME)");
        System.out.println("5. Fatigue");
        System.out.println("6. Bloating");
        System.out.println("7. Headaches");
        System.out.println("8. Acne");
        System.out.println("9. Backache");
        System.out.print("Enter the number corresponding to your problem: ");
    }
    
    // Method to provide the solution based on the selected problem
    public static void provideSolution(int problemNumber) {
        switch(problemNumber) {
            case 1:
                System.out.println("\nSolution: For painful cramps, try TAKING OVER THE COUNTER(OTC) MEDICATION:\nIbuprofen(Advil) \nNaproxen(Aleve) \nLow dose aspirin \nHigh dose aspirin \nAPPLYING HEAT to your abdomen and lower back may relieve pain \nMESSAGE THERAPY  using lavender , peppermint, rose or fennel \nDuring menstruation avoid  certain foods like oily foods, alcohol,");
                break;
            case 2:
                System.out.println("\nSolution: For heavy flow, 1, Take Blood thinners and aspirin. \n2. Try hormone replacement therapy. \n3.Intrauterine devices(IUD’S) \n4. A Pelvic ultrasound is most common way to diagnose menorrhagia. \n5. A cervical test for infection");
                break;
            case 3:
                System.out.println("\nSolution: For mood swings, relaxation techniques like meditation, breathing exercises, or engaging in physical activity can help balance emotions.");
                break;
            case 4:
                System.out.println("\nSolution: For PCOD, 1. DIET MODIFICATION is the 1st step to solve your PCOD problem \n2. Cyclic hormonal treatment. \n3. Regular exercises. \n4. Intaking progestrone");
                break;   
            case 5:
                System.out.println("\nSolution: For fatigue, get plenty of rest, eat iron-rich foods to counteract any blood loss, and drink water to stay hydrated.");
                break;
            case 6:
                System.out.println("\nSolution: To reduce bloating, avoid salty foods and caffeine. Drink water and consider gentle exercises like walking or stretching.");
                break;
            case 7:
                System.out.println("\nSolution: For headaches, try taking pain relievers, using a cold compress, or practicing relaxation techniques like deep breathing.");
                break;
            case 8:
                System.out.println("\nSolution: For acne, maintain a good skincare routine, wash your face regularly, and use non-comedogenic products. Drink plenty of water.");
                break;
            case 9:
                System.out.println("\nSolution: For backache, try applying heat to the area, take over-the-counter pain relief, and stretch gently. Yoga or Pilates can also help.");
                break;
            default:
                System.out.println("\nInvalid option. Please choose a number between 1 and 8.");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        
        int n;
        System.out.println("What are the number of problems you have?");
        n = scanner.nextInt();
        int userChoice[] = new int[n];
        
        // Display the problem options to the user
        displayProblems();  
        
        // Read the user's choice
        for(int i=0; i<n; i++)
        {
            userChoice[i] = scanner.nextInt();
        }
        
        
        
        // Provide the corresponding solution
        for(int i=0; i<n; i++)
        {
            provideSolution(userChoice[i]);
        }
        
        // Close the scanner
        scanner.close();
    }
}