package bus.reservation;
import java.util.ArrayList;
import java.util.Scanner;
public class BusDemo {

	public static void main(String[] args) {
		
		ArrayList<Bus> buses = new ArrayList<>();
		ArrayList<Booking> bookings = new ArrayList<>();
		
		buses.add(new Bus(1, true, 2));
		buses.add(new Bus(2, false, 30));
		buses.add(new Bus(3, true, 40));
		buses.add(new Bus(4, true, 45));
		
		for(Bus b : buses) {
			b.display();
		}
		
		try (Scanner sc = new Scanner(System.in)) {
			int user = 1;
			
			while(user == 1) {
				System.out.println("Enter 1 to book or enter 2 to exit");
				
				user = sc.nextInt();
				
				if(user == 1) {
					Booking booking = new Booking();
					
					if(booking.isAvailable(bookings, buses)) {
						bookings.add(booking);
						System.out.println("Your journey is confirmed");
					}else {
						System.out.println("Sorry try a differrent date");
					}
				}
				
			}
			if(user ==2) {
				System.out.println("Have a happy journey");
			}
		}

	}

}
