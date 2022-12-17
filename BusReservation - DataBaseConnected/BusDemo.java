package BusResev;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
public class BusDemo {

	public static void main(String[] args) throws SQLException {
		
		BusDAO busdao = new BusDAO();
		busdao.displayBusInfo();
		
		
		
		Scanner sc = new Scanner(System.in);
			int user = 1;
			
			while(user == 1) {
				System.out.println("Enter 1 to book or enter 2 to exit");
				
				user = sc.nextInt();
				
				if(user == 1) {
					Booking booking = new Booking();
					
					if(booking.isAvailable()) {
						BookingDAO bookingdao = new BookingDAO();
						bookingdao.addBooking(booking);
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


