import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class Test 
{

	public static void main(String[] args){
		
Scanner scanner = new Scanner(System.in);

System.out.print("Enter your birth date (YYYY-MM-DD): ");

String birthDateStr = scanner.nextLine();
// Parse the birth date and time
LocalDate birthDate = LocalDate.parse(birthDateStr);

// Get the current date and time
LocalDateTime currentDateTime = LocalDateTime.now();

// Calculate the difference between the birth date and current date
Period period = Period.between(birthDate, currentDateTime.toLocalDate());


System.out.println("Age: " + period.getYears() + " years, " +
        period.getMonths() + " months, " + period.getDays() + " days");
       
// Close the scanner
scanner.close();
}
}
