import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number = new Scanner(System.in);
		System.out.print("Enter a value: ");
		int year = number.nextInt();
		isLeapYear(year);
	}
	public static boolean isLeapYear(int year) {
		if(year % 4 == 0) {
			if((year % 400 == 0) && (year % 100 != 0)) {
				System.out.println("This year is a leap year.");
				return true;
			} else {
				System.out.println("This year is not a leap year.");
				return false;
			}
		}
		System.out.println("This year is not a leap year.");
		return false;
	}

}
