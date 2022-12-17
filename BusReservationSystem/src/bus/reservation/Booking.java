package bus.reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {
	String passengerName;
	int busNo;
	Date date;
	
	Booking(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of the Passenger ");
		passengerName = sc.nextLine();
		System.out.println("Enter BusNo : ");
		busNo = sc.nextInt();
		System.out.println("Enter the date in dd-mm-yyy formate");
		String dateInput = sc.next();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat(dateInput);
		
		try {
		date = dateFormat.parse(dateInput);
		}catch (ParseException e){
			e.printStackTrace();
		}
		}
		
		public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
			int capacity = 0;
			for(Bus b : buses) {
				if(b.getBusNo() == busNo) {
					capacity = b.getCapacity()  ;
				}
			}
			int booked = 0;
			for(Booking b: bookings) {
				if(b.busNo == busNo && b.date.equals(date)) {
					booked++;
				}
			}
			return booked < capacity ? true : false;
		}
	}

