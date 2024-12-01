import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class MenstrualCycle {

    // Method to add days to a given date
    public static Date addDays(Date date, int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days);
        return cal.getTime();
    }

    // Method to print the date in "yyyy-MM-dd" format
    public static String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Get the menstruation date of the previous month from the user
        System.out.print("Enter the first day of menstruation (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        try {
            // Parse the user input date
            Date menstruationDate = dateFormat.parse(inputDate);

            // Calculate the start of the follicular phase (same day as menstruation)
            Date follicularPhaseStart = menstruationDate;

            // Ovulation phase starts on day 14, i.e., 13 days after the menstruation date
            Date ovulationPhaseStart = addDays(menstruationDate, 13);

            // Luteal phase starts after ovulation and lasts 14 days
            Date lutealPhaseStart = addDays(ovulationPhaseStart, 1);
            Date lutealPhaseEnd = addDays(lutealPhaseStart, 13);

            // Probable menstruation date of the next month is 28 days after the first day of this menstruation
            Date nextMenstruationDate = addDays(menstruationDate, 28);

            // Output the phases and the next menstruation date
            System.out.println("Follicular Phase: " + formatDate(follicularPhaseStart) + " to " + formatDate(ovulationPhaseStart));
            System.out.println("Ovulation Phase: " + formatDate(ovulationPhaseStart));
            System.out.println("Luteal Phase: " + formatDate(lutealPhaseStart) + " to " + formatDate(lutealPhaseEnd));
            System.out.println("Probable Menstruation Date for next month: " + formatDate(nextMenstruationDate));

        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
        }

        scanner.close();
    }
}